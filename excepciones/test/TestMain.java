package test;

public class TestMain {
  public static void main(String[] args) {
    try {
      int resultado = 10 / 0;
      System.out.println("Resultado: " + resultado);
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Error: No se puede dividir entre cero.");
    } finally {
      System.out.println("Finally");
    }
  }
}
