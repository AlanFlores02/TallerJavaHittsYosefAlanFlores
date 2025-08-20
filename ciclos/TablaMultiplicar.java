package ciclos;
import java.util.Scanner;
import tools.Color;
import tools.Console;

public class TablaMultiplicar {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Console.print("La tabla del numero: ", Color.Green);
    int numero = entrada.nextInt();
    
    for (int i=1; i<=10; i++) {
      String operacion = numero + " x " + i + " = ";
      Console.print(operacion);
      Console.println(Integer.toString(numero * i), Color.Red);
    }

    entrada.close();
  }
}
