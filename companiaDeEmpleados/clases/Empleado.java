package clases;

public class Empleado extends Persona {
  protected double remuneracion;
  protected int empleadoId;
  private int contador;

  public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion) {
    super(nombre, apellido, numeroFiscal, direccion);
    this.remuneracion = remuneracion;
    empleadoId = ++contador;
  }

  public double getRemuneracion() { return remuneracion; }
  public int getEmpleadoId() { return empleadoId; }

  public void aumentarRemuneracion(int porcentaje) {
    remuneracion += remuneracion * (double)porcentaje/100;
  }

  @Override
  public String toString() {
    String text = super.toString();
    return "{Empleado Id: " + empleadoId + ", " +
          text.substring(1, text.length()-1) +
          ", Remuneracion: " + remuneracion + "}";
  }
}
