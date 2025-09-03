package test;
import interfaces.Factura;
import interfaces.impl.*;

public class PruebaFactura {
  public static void main(String[] args) {
    Factura f1 = new FacturaNacional(10000);
    Factura f2 = new FacturaInternacional(10000);

    System.out.println(f1.obtenerDetalles());
    System.out.println(f2.obtenerDetalles());
  }
}
