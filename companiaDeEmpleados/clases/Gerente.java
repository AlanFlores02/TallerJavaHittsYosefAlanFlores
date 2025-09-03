package clases;

public class Gerente extends Empleado {
  private double presupuesto;

  public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, double presupuesto) {
    super(nombre, apellido, numeroFiscal, direccion, remuneracion);
    this.presupuesto = presupuesto;
  }

  public double getPresupuesto() { return presupuesto; }

  @Override
  public String toString() {
    String text = super.toString();
    return text.substring(0, text.length()-1) +
          ", Presupuesto: " + presupuesto + "}";
  }
}
