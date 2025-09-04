package test;
import interfaces.MetodoPago;
import interfaces.PagoPayPal;
import interfaces.PagoTarjetaCredito;

public class Prueba {
  public static void main(String[] args) {
    MetodoPago[] metodos = new MetodoPago[3];

    MetodoPago pago1 = new PagoTarjetaCredito();
    MetodoPago pago2 = new PagoPayPal();
    MetodoPago pago3 = new PagoTarjetaCredito();

    metodos[0] = pago1;
    metodos[1] = pago2;
    metodos[2] = pago3;

    pago1.pago(1500);
    pago2.pago(950.50);
    pago3.pago(2500);

    for (MetodoPago pago : metodos) {
      
    }
  }
}
