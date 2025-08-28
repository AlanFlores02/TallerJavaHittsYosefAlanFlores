package clases;

public class CuentaBancaria {
  private int id;
  private String nombre;
  private double saldo;

  private static int contador;

  public CuentaBancaria(String nombre, double depositoInicial) {
    this.id = ++contador;
    this.nombre = nombre;
    this.saldo = depositoInicial;
  }

  public boolean deposito(double monto) {
    saldo += monto;
    System.out.println("Deposito completo!   Deposito: " + monto + "   Nuevo saldo: " + saldo);
    return true;
  }

  public boolean retiro(double monto) {
    if (saldo < monto) {
      System.out.println("ERROR: Saldo insuficiente, retiro cancelado.");
      return false;
    } else {
      saldo -= monto;
      System.out.println("Retiro completo!   Retiro: " + monto + "   Saldo restante: " + saldo);
      return true;
    }
  }

  @Override
  public String toString() {
    return "{id: " + id +
          ", titular: " + nombre +
          ", saldo: " + saldo + "}";
  }
}
