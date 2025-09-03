package test;
import clases.*;

public class TestMain {
  public static void main(String[] args) {
    Gerente gerente = new Gerente("Yosef", 15000);
    Empleado dev = new Desarrollador("Alan", 5000);
    Empleado vendedor = new Vendedor("Bob Esponja", 2.80);

    gerente.mostrarInfo();
    System.out.println("Bono: $" + gerente.calcularBono());
    dev.mostrarInfo();
    System.out.println("Bono: $" + dev.calcularBono());
    vendedor.mostrarInfo();
    System.out.println("Bono: $" + vendedor.calcularBono());
  }
}
