package clases;

public class Persona {
  private String nombre;
  private int edad;

  // Initializer

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  // SET

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  // GET

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  //

  public void mostrarInfo() {
    System.out.println("Nombre:   " + nombre);
    System.out.println("Edad:     " + edad);
  }
}