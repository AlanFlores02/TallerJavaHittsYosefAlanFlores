package modelos;
import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
  private int id;
  private String nombre;
  private double calificacion;

  public Alumno(int id, String nombre, double calificacion) {
    this.id = id;
    this.nombre = nombre;
    this.calificacion = calificacion;
  }

  public int getId() { return id; }
  public String getNombre() { return nombre; }
  public double getCalificacion() { return calificacion; }

  @Override
  public String toString() {
    return "Alumno {id: " + id +
          ", nombre: " + nombre +
          ", calificacion: " + calificacion + "}";
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;

    Alumno other = (Alumno)obj;
    return id == other.id || Objects.equals(nombre, other.nombre);
  }

  @Override
  public int compareTo(Alumno other) {
    return this.nombre.compareTo(other.nombre);
  }
}
