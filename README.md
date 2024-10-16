
# LinkedIn Search Query Generator

This program helps you generate a boolean search query for LinkedIn job searches based on your known technologies, unknown technologies, and desired job positions.

## How to Use

1. Ensure you have Java installed on your system.

2. Download the `LinkedInSearchQuery.java` file.

3. Compile the Java file:
   ```
   javac LinkedInSearchQuery.java
   ```

4. Run the program:
   ```
   java -jar LinkedInSearchQuery
   ```

5. Follow the prompts:

   - Enter the technologies you know, separated by commas.
   - Enter the technologies you don't know, separated by commas.
   - Enter the desired job positions (Estágio, Junior, Pleno, Senior), separated by commas if there's more than one.

6. The program will generate a boolean search query that you can use on LinkedIn's job search.

## Example

Here's an example of how to use the program:

```
Digite as tecnologias que você conhece (separe por vírgula): 
Java, Python, SQL

Digite as tecnologias que você não conhece (separe por vírgula): 
C++, Ruby

Digite o tipo de cargo que você deseja (Estágio, Junior, Pleno, Senior) (separe por vírgula, se houver mais de um cargo
Junior, Pleno

Consulta de pesquisa booleana para o LinkedIn:
(Java OR Python OR SQL) AND NOT (C++ OR Ruby) AND (Junior OR Pleno)
```

You can then copy this generated query and paste it into LinkedIn's job search bar to find job listings that match your criteria.

## License

This code is free for reuse. Feel free to modify and distribute it as needed.

## Contributing

If you have any suggestions or improvements, feel free to create a pull request or open an issue.

Happy job hunting!
