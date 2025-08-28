package test;
import clases.Producto;
import clases.Venta;

public class TestMain {
  public static void main(String[] args) {
    
    System.out.println("\n\t======== PRODUCTOS ========");
    Producto p1 = new Producto("Soda", 0);
    Producto p2 = new Producto("Galletas Marias", 0);
    Producto p3 = new Producto("Coca Cola 600 ml", 0);
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);

    System.out.println("\n\t======== VENTAS ========");
    Venta v1 = new Venta(p1, 5);
    Venta v2 = new Venta(p2, 3);
    Venta v3 = new Venta(new Producto("Pan Bimbo", 32.40), 2);
    System.out.println(v1);
    System.out.println(v2);
    System.out.println(v3);
    
    System.out.println();
  }
}
