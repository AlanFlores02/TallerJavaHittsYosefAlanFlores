package ciclos;
import java.text.DecimalFormat;

public class FormateoNumeros {
  public static void main(String[] args) {
    double numero = 3.14159265359;
    float numero2 = 3.14159265359F;
    String cadena = "Hola Mundo";
    int entero = 1641632;

    // %, hace que se separen los miles en un numero "1,000,000" en vez de "1000000"
    // %.2 indica cuantos digitos decimales mostrar

    System.out.println("\t======== printf ========");
    System.out.printf("Numero A: %,.2f\n", numero);
    System.out.printf("Numero B: %f\n", numero2);

    System.out.println("\t======== String.format ========");
    System.out.println(String.format("Numero: %,.2f", numero));
    System.out.println(String.format("Cadena: %s", cadena));
    System.out.println(String.format("Entero: %,d", entero));

    System.out.println("\t======== DecimalFormat ========");
    DecimalFormat df = new DecimalFormat("#,###.000");
    System.out.println("Numero: " + df.format(numero));
  }
}
