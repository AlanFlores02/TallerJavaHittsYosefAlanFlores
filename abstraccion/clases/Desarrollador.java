package clases;

public class Desarrollador extends Empleado {
  public Desarrollador(String nombre, double salario) {
    super(nombre, salario);
  }

  @Override
  public double calcularBono() {
    // Bono de 10%
    return salario * 0.10;
  }
}
