package impl;
import interfaces.MetodoPago;

public class PagoPayPal implements MetodoPago {
  @Override
  public void pago(double cantidad) {
    System.out.println("Pagando $" + cantidad + " con PayPal.");
  }
}
