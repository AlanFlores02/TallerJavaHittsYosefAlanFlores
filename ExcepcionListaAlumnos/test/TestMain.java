package test;
import java.util.InputMismatchException;
import java.util.Scanner;
import excepciones.EdadInvalidaException;

public class TestMain {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int[] alumnos = new int[3];
    int i = 0;

    while (true) {
      // Main Loop
      try {
        System.out.print("Edad del alumno #" + (i+1) + ":   ");
        alumnos[i] = entrada.nextInt();
        if (alumnos[i] < 0) throw new IllegalArgumentException();
        else if (alumnos[i] < 18) throw new EdadInvalidaException();
        System.out.println("Edad asignada correctamente.");
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Error: No es posible guardar más de 3 alumnos."); break;
      } catch (IllegalArgumentException | InputMismatchException e) {
        System.out.println("Error: Argumento inválido, debe ser un número entero positivo.");
      } catch (EdadInvalidaException e) {
        System.out.println("Error: Edad inválida, debe ser mayor a 18 años.");
      }
      i++;
      entrada.nextLine();
    }
  }
}
