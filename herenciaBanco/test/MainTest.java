package test;
import clases.*;

public class MainTest {
  public static void main(String[] args) {
    CuentaBancaria c1 = new CuentaDeAhorro("Eloy", 5000, 0.04);
    CuentaBancaria c2 = new Chequera("Paty", 2000, 1000);
    CuentaDeAhorro c3 = new CuentaDeAhorro("Alan", 50000, 0.08);

    c1.mostrarInfo();
    c2.mostrarInfo();
    c3.mostrarInfo();

    System.out.println("\n\t======== Operaciones ========");
    c1.depositar(5000);
    c1.retirar(1500);
    ((CuentaDeAhorro)c1).aplicarIntereses();
    c1.mostrarInfo();

    c2.retirar(2500);
    c2.mostrarInfo();
  }
}
