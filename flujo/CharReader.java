package flujo;
import java.util.Scanner;
import tools.Console;

public class CharReader {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Console.print("Insert Character: ", tools.Color.Yellow);
    char input = entrada.next().charAt(0);

    if (Character.isLetter(input)) {
      char low = Character.toLowerCase(input);
      if (low=='A' || low=='e' || low=='i' || low=='o' || low=='u') {
        Console.print("Es una vocal.", tools.Color.Grey);
      } else {
        Console.print("Es una consonante.", tools.Color.Grey);
      }
    } else if (Character.isDigit(input)) {
      Console.print("Es un numero.", tools.Color.Grey);
    } else {
      Console.print("Es un simbolo.", tools.Color.Grey);
    }

    entrada.close();
  }
}