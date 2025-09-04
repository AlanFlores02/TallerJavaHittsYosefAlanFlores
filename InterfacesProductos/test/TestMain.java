package test;
import java.time.LocalDate;
import abstractas.Producto;
import clases.*;

public class TestMain {
  public static void main(String[] args) {
    Producto[] items = new Producto[3];
    items[0] = new IPhone(11400, 25999.99, "Apple", "iPhone 16 Pro", "Blanco");
    items[1] = new TvLcd(3000, 7199.78, "Samsung", 50);
    items[2] = new Comics(50, 200, LocalDate.of(2011, 11, 1), "Scott Snyder", "Swamp Thing", "DC Comics", "Swamp Thing");

    for (Producto item : items) {
      System.out.println(item.toString());
    }
  }
}
