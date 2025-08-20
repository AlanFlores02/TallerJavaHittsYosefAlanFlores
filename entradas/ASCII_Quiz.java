package entradas;
import java.util.Scanner;
import java.util.Random;

public class ASCII_Quiz {
  static Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) {
    guessCharToCode();
    guessCodeToChar();
  }

  static void guessCharToCode() {
    printH2("Adivina el codigo ASCII: Char --> Code");
    System.out.print("Cual es el codigo ASCII de este simbolo? : ");
    int randomCode = new Random().nextInt(95) + 32;
    printH3((char)randomCode + "\n");

    int yourAnswer = entrada.nextInt(); entrada.nextLine();
    System.out.println(yourAnswer == randomCode ? "Correcto" : "Incorrecto, la respuesta correcta es: " + randomCode);
  }

  static void guessCodeToChar() {
    printH2("Adivina el codigo ASCII: Code --> Char");
    System.out.print("Que simbolo representa este codigo ASCII? : ");
    int randomCode = new Random().nextInt(95) + 32;
    printH3(randomCode + "\n");

    String yourAnswer = entrada.nextLine();
    System.out.println(yourAnswer == Integer.toString(randomCode) ? "Correcto" : "Incorrecto, la respuesta correcta es: " + (char)randomCode);
  }

  static void printH2(String text) {
    System.out.print("\n\u001B[32m" + text + "\u001B[0m\n");
  }

  static void printH3(String text) {
    System.out.print("\u001B[31m" + text + "\u001B[0m");
  }
}
