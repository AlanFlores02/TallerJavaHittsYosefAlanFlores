package ciclos;
import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Cantidad de valores: ");
    int amount = entrada.nextInt();

      System.out.print("1° Numero: ");
      int smallest = entrada.nextInt();
    for (int i=2; i<=amount; i++) {
      System.out.print(i + "° Numero: ");
      int numero = entrada.nextInt();
      if (numero < smallest) smallest = numero;
    }

    System.out.println("El valor mas chico es: " + smallest);
    System.out.println((smallest < 10) ? "Es menor a 10" : "Es igual o mayor a 10");

    entrada.close();
  }
}
