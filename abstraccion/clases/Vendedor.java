package clases;

public class Vendedor extends Empleado {
  public Vendedor(String nombre, double salario) {
    super(nombre, salario);
  }

  @Override
  public double calcularBono() {
    // Bono de 5%
    return 0.05;
  }
}

