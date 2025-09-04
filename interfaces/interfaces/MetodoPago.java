package interfaces;

public sealed interface MetodoPago permits PagoTarjetaCredito, PagoPayPal {
  // "sealed interface" → se debe indicar con "permit" cuales clases pueden usar esto
  // clases hijas deben ser "final", "sealed" o "non-sealed"
  public void pago(double cantidad);
}
