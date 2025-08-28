package clases;
import java.util.Objects;

public class Persona {
  private String nombre;
  private Integer edad;

  public Persona() {}
  public Persona(String nombre) {
    this.nombre = nombre;
  }
  public Persona(Integer edad) {
    this.edad = edad;
  }
  public Persona(String nombre, Integer edad) {
    this.nombre = nombre;
    this.edad = edad;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public Integer getEdad() {
    return edad;
  }
  public void setEdad(Integer edad) {
    this.edad = edad;
  }

  @Override
  public String toString() {
    //return super.toString();
    return "{ nombre: " + nombre + ", edad: " + edad + "}";
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    else if (other == null || getClass() != other.getClass()) return false;

    Persona p = (Persona)other;
    return Objects.equals(p, other);
  }
}
