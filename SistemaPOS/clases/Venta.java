package clases;

public class Venta {
  private final int id;
  private Producto producto;
  private int cantidad;

  private static int contador;

  public Venta(Producto producto, int cantidad) {
    this.id = contador++;
    this.producto = producto;
    this.cantidad = cantidad;
  }

  public double getSubtotal() {
    double subtotal = producto.getPrecio() * cantidad;
    return subtotal;
  }

  // Getters
  public int getId() { return id; }
  public Producto getProducto() { return producto; }
  public int getCantidad() { return cantidad; }

  // Setters
  public void setProducto(Producto producto) { this.producto = producto; }
  public void setCantidad(int cantidad) { this.cantidad = cantidad; }

  @Override
  public String toString() {
    return "{id: " + id +
          ", producto: " + producto +
          ", cantidad: " + cantidad +
          ", Subtotal: " + getSubtotal() + "}";
  }
}
