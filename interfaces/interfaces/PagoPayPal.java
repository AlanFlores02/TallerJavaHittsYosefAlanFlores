package interfaces;

public final class PagoPayPal implements MetodoPago {
  @Override
  public void pago(double cantidad) {
    System.out.println("Pagando $" + cantidad + " con PayPal.");
  }
}
