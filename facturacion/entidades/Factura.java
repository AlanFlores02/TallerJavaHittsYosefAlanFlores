package entidades;
import java.util.List;
import java.util.ArrayList;
import genericos.Identificable;

public class Factura implements Identificable<Integer>{
  private Integer id;
  private Cliente cliente;
  private List<Producto> productos;

  public Factura(Integer id, Cliente cliente, List<Producto> productos) {
    this.id = id;
    this.cliente = cliente;
    this.productos = new ArrayList(productos);
  }

  @Override
  public Integer getId() { return id; }
  public Cliente getCliente() { return cliente; }
  public List<Producto> getProductos() { return productos; }

  public void agregarElemento(Producto producto) {
    productos.add(producto);
    System.out.println("Producto agregado: " + producto);
  }

  public boolean eliminarProducto(int id) {
    for (int i=0; i<productos.size(); i++) {
      if (productos.get(i).getId() == id) {
        Producto producto = productos.remove(i);
        System.out.println("Producto eliminado: " + producto);
        return true;
      }
    }
    System.out.println("No se encontró el producto con ID: " + id);
    return false;
  }

  public double calcularTotal() {
    double total = 0;
    for (Producto producto : productos) {
      total += producto.getPrecio();
    }
    return total;
  }

  // Generar ticket
  public String generarReporte() {
    StringBuilder sb = new StringBuilder();
    sb.append("\n======== FACTURA #").append(id).append(" ========")
      .append("\nCliente: ").append(cliente.getNombre())
      .append("\n--------------------------------");
    for (Producto producto : productos) {
      sb.append("\n").append(producto.getDescripcion())
        .append("\t\t$").append(producto.getPrecio());
    }
    sb.append("\n--------------------------------")
      .append("\nTotal: $").append(calcularTotal())
      .append("\n--------------------------------");
    return sb.toString();
  }

  @Override
  public String toString() {
    return "Factura {id: " + id + ", cliente: " + cliente +
          ", productos: " + productos + ", Total: " + calcularTotal() + "}";
  }
}
