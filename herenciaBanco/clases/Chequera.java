package clases;

public class Chequera extends CuentaBancaria {
  private double limite;

  public Chequera(String titular, double saldo, double limite) {
    super(titular, saldo);
    this.limite = limite;
  }

  @Override
  public void retirar(double cantidad) {
    if (saldo + limite >= cantidad) saldo -= cantidad;
    else System.out.println("Error: No se puede retirar, excede el limite de retiro.");
  }

  public void mostrarInfo() {
    System.out.println("Cuenta #" + id);
    System.out.println("Titular: " + titular);
    System.out.println("Saldo: " + saldo);
    System.out.println("Tipo: Chequera | Limite: " + limite);
  }
}
