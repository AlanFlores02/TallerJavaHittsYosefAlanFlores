package entradas;
import java.util.Scanner;

public class Entrada {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    String nombre;
    System.out.print("Nombre:   ");
    nombre = inputColor(entrada);

    int edad;
    System.out.print("Edad:     ");
    edad = Integer.parseInt(inputColor(entrada));

    long telefono;
    System.out.print("Telefono: ");
    telefono = Long.parseLong(inputColor(entrada));

    double estatura;
    System.out.print("Estatura: ");
    estatura = Double.parseDouble(inputColor(entrada));

    System.out.println("Nombre:   " + nombre);
    System.out.println("Edad:     " + edad);
    System.out.println("Telefono: " + telefono);
    System.out.println("Estatura: " + estatura);
  }

  static String inputColor(Scanner entrada) {
    System.out.print("\u001B[32m");
    String text = entrada.next();
    System.out.print("\u001B[0m");
    return text;
  }
}
