package genericos;

public class Prueba {
  public static void main(String[] args) {
    Caja<String> c1 = new Caja<>();
    c1.set("Factura");
    System.out.println("Caja 1 contiene: " + c1.get());

    Caja<Double> c2 = new Caja<>();
    c2.set(125.4);
    System.out.println("Caja 2 contiene: " + c2.get());

    System.out.println("Maximo(20, 35): " + Utilerias.maximo(20, 35));
    System.out.println("Maximo(java, python): " + Utilerias.maximo("Java", "Python"));
  }
}
