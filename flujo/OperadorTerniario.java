package flujo;

public class OperadorTerniario {
  public static void main(String[] args) {
    int numero = 5;
    String resultado = (numero % 2 == 0) ? "El numero es par" : "El numero es impar";
    System.out.println(resultado);
  }
}
