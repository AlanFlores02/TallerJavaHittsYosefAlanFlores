package arreglos;
import java.util.Random;

public class NumerosAleatorios {
  public static void main(String[] args) {
    int numero;

    System.out.println("\n\t======== Math.random() ========");
    for (int i=0; i<10; i++) {
      numero = (int)(Math.random() * 100) + 1;
      System.out.print(numero + " ");
    }

    Random aleatorio = new Random();
    System.out.println("\n\n\t====== java.util.Random ======");
    for (int i=0; i<10; i++) {
      numero = aleatorio.nextInt(100) + 1;
      System.out.print(numero + " ");
    }

    System.out.println();
  }
}
