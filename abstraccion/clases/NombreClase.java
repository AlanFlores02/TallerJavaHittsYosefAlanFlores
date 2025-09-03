package clases;

public abstract class NombreClase {
  // Attributos
  protected String nombre;

  // Metodo abstracto (sin cuerpo, se implementa en las subclases)
  public abstract void metodoAbstracto(String nombre);

  // Metodo concreto (con cuerpo)
  public void mostrarInfo() {
    System.out.println("Nombre: " + nombre);
  }
}
