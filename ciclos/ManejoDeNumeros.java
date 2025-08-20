package ciclos;
import java.util.Scanner;

public class ManejoDeNumeros {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int entero = 0;
    boolean esValido = false;
    while (!esValido) {
      System.out.print("Numero: ");
      esValido = entrada.hasNextInt();
      if (esValido) {
        entero = entrada.nextInt();
      } else {
        entrada.next();
        System.err.println("No es un numero");
      }
    }

    System.out.println("Numero: " + entero);
    entrada.close();
  }
}
