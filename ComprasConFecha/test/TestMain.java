package test;
import clases.Compras;

public class TestMain {
  public static void main(String[] args) {
    Compras c1 = new Compras("Costco Hotdog", 2.50);
    Compras c2 = new Compras("Chocomilk Soriana", 49.99);
    System.out.println(c1.formatDate("en", "US") + " : " + c1.toString());
    System.out.println(c2.formatDate("es", "MX") + " : " + c2.toString());
  }
}
