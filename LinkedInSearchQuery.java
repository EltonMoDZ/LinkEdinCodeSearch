import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinkedInSearchQuery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());

        // Coleta as tecnologias que você conhece
        System.out.println("Digite as tecnologias que você conhece (separe por vírgula): ");
        String knownTech = scanner.nextLine();
        List<String> knownTechList = parseInput(knownTech);

        // Coleta as tecnologias que você não conhece
        System.out.println("Digite as tecnologias que você não conhece (separe por vírgula): ");
        String unknownTech = scanner.nextLine();
        List<String> unknownTechList = parseInput(unknownTech);

        // Coleta o tipo de cargo desejado
        System.out.println("Digite o tipo de cargo que você deseja (Estágio, Junior, Pleno, Senior) (separe por vírgula, se houver mais de um cargo");
        String positions = scanner.nextLine();
        List<String> positionList = parseInput(positions);

        // Formata a consulta booleana
        String searchQuery = buildSearchQuery(knownTechList, unknownTechList, positionList);
        System.out.println("Consulta de pesquisa booleana para o LinkedIn:");
        System.out.println(searchQuery);

        scanner.close();
    }

    private static List<String> parseInput(String input) {
        String[] items = input.split(",");
        List<String> list = new ArrayList<>();
        for (String item : items) {
            list.add(item.trim());
        }
        return list;
    }

    private static String buildSearchQuery(List<String> knownTech, List<String> unknownTech, List<String> positions) {
        StringBuilder queryBuilder = new StringBuilder();

        // Adiciona tecnologias conhecidas
        if (!knownTech.isEmpty()) {
            queryBuilder.append("(").append(String.join(" OR ", knownTech)).append(")");
        }

        // Adiciona tecnologias desconhecidas
        if (!unknownTech.isEmpty()) {
            if (queryBuilder.length() > 0) {
                queryBuilder.append(" AND ");
            }
            queryBuilder.append("NOT (").append(String.join(" OR ", unknownTech)).append(")");
        }

        // Adiciona posições desejadas
        if (!positions.isEmpty()) {
            if (queryBuilder.length() > 0) {
                queryBuilder.append(" AND ");
            }
            queryBuilder.append("(").append(String.join(" OR ", positions)).append(")");
        }

        return queryBuilder.toString();
    }
}
