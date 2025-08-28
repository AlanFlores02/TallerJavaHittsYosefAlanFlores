package clases;

public class Transaccion {
  private int id;
  private String operacion;
  private CuentaBancaria cuenta;
  private double monto;
  private boolean estado;

  private static int contador;

  public Transaccion(String operacion, double monto, CuentaBancaria cuenta) {
    this.id = ++contador;
    this.operacion = operacion;
    this.cuenta = cuenta;
    this.monto = monto;

    if (operacion == "DEPOSITO") estado = cuenta.deposito(monto);
    else if (operacion == "RETIRO") estado = cuenta.retiro(monto);
    else System.out.println("ERROR: Operacion no reconozida.");
  }

  @Override
  public String toString() {
    return "{id: " + id +
          ", cuenta: " + cuenta.toString() +
          ", operacion: " + operacion +
          ", monto: " + monto +
          ", estado: " + (estado?"COMPLETO":"CANCELADO") + "}";
  }
}
