package ciclos;
import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("EJERCICIO 1: Bucle for");
    System.out.print("Primer Numero: ");
    int numero1 = entrada.nextInt();
    System.out.print("Segundo Numero: ");
    int numero2 = entrada.nextInt();

    int resultado = 0;
    int signoNum2 = Integer.signum(numero2);
    for (int i=0; i<Math.abs(numero2); i++) {
      resultado += numero1;
    }
    resultado *= signoNum2;
    entrada.close();

    System.out.print(numero1 + " x " + numero2 + " = " + resultado);
  }
}
