package clases;

public class CuentaBancaria {
  protected Integer id;
  protected String titular;
  protected double saldo;

  private static Integer contador = 0;

  public CuentaBancaria(String titular, double saldo) {
    this.id = ++contador;
    this.titular = titular;
    this.saldo = saldo;
  }

  public void depositar(double cantidad) {
    if (cantidad > 0) saldo += cantidad;
  }

  public void retirar(double cantidad) {
    if (cantidad > 0 && cantidad <= saldo) {
      saldo -= cantidad;
    }
    else if (cantidad > 0) {
      System.out.println("Saldo insuficiente");
    }
    else {
      System.out.println("Error: Cantidad no puede ser negativa");
    }
  }


  public void mostrarInfo() {
    System.out.println("Cuenta #" + id + " | Titular: " + titular + " | Saldo $" + saldo);
  }
}
