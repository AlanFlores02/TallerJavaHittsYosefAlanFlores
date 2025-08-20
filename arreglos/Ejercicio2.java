package arreglos;
import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int[] numeros = new int[10];

    System.out.println("\n\t===== INPUT =====");
    for (int i=0; i<numeros.length; i++) {
      while (true) {
        System.out.print("Numero #" + (i+1) + ":\t");
        // Solo permite numeros enteros
        if (entrada.hasNextInt()) {
          numeros[i] = entrada.nextInt();
          // Solo permite numeros de 1 a 9
          if (numeros[i] >= 1 && numeros[i] <= 9) break;
          else System.out.println("Error: Numero fuera de rango (1-9).");
        } else {
          entrada.next();
          System.out.println("Error: Input debe ser un numero entero.");
        }
      }
    }
    entrada.close();

    // Contar ocurrencias de cada digito
    int[] ocurrencias = new int[9];
    for (int numero : numeros) {
      ocurrencias[numero-1]++;
    }
    // Conseguir el de mayor ocurrencias
    int mayor = 0;
    for (int i=0; i<9; i++) {
      if (ocurrencias[mayor] < ocurrencias[i]) mayor = i;
    }
    // Escribir resultado
    System.out.println("\n\t=== RESULTADO ===");
    System.out.println("El numero que mas se repite es:  " + (mayor+1));
    System.out.println("Con una cantidad de ocurrencias: " + ocurrencias[mayor]);
    System.out.println();
  }
}
