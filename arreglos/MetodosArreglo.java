package arreglos;
import java.util.Arrays;

public class MetodosArreglo {
  public static void main(String[] args) {
    int[] edades = {41, 54, 14, 62, 25, 41, 74, 21, 35, 19};

    System.out.print("Edades desordenadas:  ");
    for (int edad : edades) {
      System.out.print(edad + " ");
    }

    Arrays.sort(edades);

    System.out.print("\nEdades ordenadas:     ");
    for (int edad : edades) {
      System.out.print(edad + " ");
    }
  }
}
