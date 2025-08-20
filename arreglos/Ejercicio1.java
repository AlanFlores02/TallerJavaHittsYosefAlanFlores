package arreglos;
import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 
    int[] numeros = new int[10];

    System.out.println("======== INPUT ========");
    for (int i=0; i<numeros.length; i++) {
      while (true) {
        System.out.print("Numero #" + (i+1) + ":  ");
        if (entrada.hasNextInt()) {
          numeros[i] = entrada.nextInt();
          break;
        } else {
          entrada.next();
          System.out.println("Error: Input debe ser un numero entero.");
        }
      }
    }

    System.out.println("\n======== OUTPUT ========");
    for (int i=0; i<numeros.length/2; i++) {
      int j = numeros.length - i - 1;
      System.out.println("Numero #" + (j+1) + ":  " + numeros[j]);
      System.out.println("Numero #" + (i+1) + ":  " + numeros[i]);
    }

    entrada.close();
  }
}
