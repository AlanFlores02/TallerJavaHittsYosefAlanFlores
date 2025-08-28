package clases;

public class Producto {
  private int id;
  private String nombre;
  private double precio;

  private static int contador;

  public Producto(String nombre, double precio) {
    this.id = contador++;
    this.nombre = nombre;
    this.precio = precio;
  }

  // Getters
  public int getId() { return id; }
  public String getNombre() { return nombre; }
  public double getPrecio() { return precio; }

  // Setters
  public void setNombre(String nombre) { this.nombre = nombre; }
  public void setPrecio(double precio) { this.precio = precio; }
}
