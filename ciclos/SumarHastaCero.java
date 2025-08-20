package ciclos;
import java.util.Scanner;

public class SumarHastaCero {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int numero = 1, suma = 0;
    while (numero != 0) {
      System.out.println("Ingresa el numero: ");
      numero = entrada.nextInt();
      suma += numero;
    }

    System.out.println("Suma Total: " + suma);
    entrada.close();
  }
}
