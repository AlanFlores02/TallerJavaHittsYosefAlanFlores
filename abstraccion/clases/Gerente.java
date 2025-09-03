package clases;

public class Gerente extends Empleado {
  public Gerente(String nombre, double salario) {
    super(nombre, salario);
  }

  @Override
  public double calcularBono() {
    // Bono de 20%
    return salario * 0.20;
  }
}
