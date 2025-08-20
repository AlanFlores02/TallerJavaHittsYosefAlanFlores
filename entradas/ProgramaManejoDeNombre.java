package entradas;
import java.util.Scanner;

public class ProgramaManejoDeNombre {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    String nombres[] = new String[3];
    String nuevosNombres[] = new String[3];
    String resultado = "Resultado: ";
    for (int i=0; i<nombres.length; i++) {
      System.out.print("Nombre " + (i+1) + ": ");
      nombres[i] = entrada.nextLine();
      nuevosNombres[i] = nombres[i].toUpperCase().charAt(1) + "." + nombres[i].substring(nombres[i].length() - 2);
      resultado += nuevosNombres[i];
      if (i < nombres.length-1) resultado += "_";
    }
    entrada.close();
    System.out.println(resultado);
  }
}
