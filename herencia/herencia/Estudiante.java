package herencia;
import clases.Persona;

public class Estudiante extends Persona {
  private String carrera;

  public Estudiante(String nombre, int edad, String carrera) {
    super(nombre, edad);
    this.carrera = carrera;
  }

  @Override
  public void mostrarInfo() {
    System.out.println("Nombre:   " + getNombre());
    System.out.println("Edad:     " + getEdad());
    System.out.println("Carrera:  " + carrera);
  }

  public void asignarNombre(String nombre) {
    
  }
}
