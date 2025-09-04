package test;
import excepciones.EdadInvalida;

public class ExcepcionPersonalizada {
  private static void validarEdad(int edad) throws EdadInvalida {
    if (edad < 18) throw new EdadInvalida("La edad mínima es 18 años.");
    System.out.println("Edad: " + edad);
  }

  public static void main(String[] args) {
    try {
      validarEdad(15);
    } catch (EdadInvalida e) {
      System.out.println("Excepción capturada: " + e);
    }
  }
}
