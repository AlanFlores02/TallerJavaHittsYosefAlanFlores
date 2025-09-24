package clases;

public class Jugador implements Comparable<Jugador> {
  private Integer id;
  private String nombre;

  private static Integer contador = 0; 

  public Jugador(String nombre) {
    this.id = ++contador;
    this.nombre = nombre;
  }

  public Integer getId() { return id; }
  public String getNombre() { return nombre; }

  @Override
  public String toString() {
    return "{id: " + id + ", nombre: " + nombre + "}";
  }

  @Override
  public int compareTo(Jugador other) {
    return this.id.compareTo(other.id);
  }
}
