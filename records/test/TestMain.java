package test;
import record.Producto;

public class TestMain {
  public static void main(String[] args) {
    Producto p1 = new Producto("Nintendo Switch", 20000);
    Producto p2 = new Producto("Mario Kart Tour", 1600);
    System.out.println(p1);
    System.out.println(p2.descripcion());
  }
}
