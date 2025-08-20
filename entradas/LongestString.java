package entradas;
import java.util.Scanner;
import tools.Console;

public class LongestString {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Console.print("Frase #1: ", tools.Color.Red);
    String frase1 = entrada.nextLine();
    System.out.println(" (" + frase1.length() + " chars)");

    Console.print("Frase #2: ", tools.Color.Blue);
    String frase2 = entrada.nextLine();
    System.out.println(" (" + frase2.length() + " chars)");

    if (frase1.length() == frase2.length())
      Console.print("Es un empate!", tools.Color.Purple);
    else if (frase1.length() > frase2.length())
      Console.print("Frase #1 es mas larga", tools.Color.Red);
    else
      Console.print("Frase #2 es mas larga", tools.Color.Blue);

    entrada.close();
  }
}
