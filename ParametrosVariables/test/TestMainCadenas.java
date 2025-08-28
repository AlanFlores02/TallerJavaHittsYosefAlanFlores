package test;

public class TestMainCadenas {
  private static String concatenar(String titulo, int valor, String ...textos) {
    StringBuilder sb = new StringBuilder();
    System.out.println("\n\t========" + titulo + "========");
    System.out.println("Valor: " + valor);
    for (String txt : textos) {
      sb.append(txt).append(" ");
    }
    return sb.toString().trim();
  }
  public static void main(String[] args) {
    System.out.println(concatenar("1ra prueba de parametros variables", 0, ""));
    System.out.println(concatenar("2da prueba de parametros variables", 0, ""));
    System.out.println(concatenar("3ra prueba de parametros variables", 0, ""));
  }
}
