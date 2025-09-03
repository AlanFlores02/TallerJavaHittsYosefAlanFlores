package abstractas;
import interfaces.IProducto;

public class Producto implements IProducto {
  protected int precio;
  protected double precioVenta;

  public Producto(int precio, double precioVenta) {
    this.precio = precio;
    this.precioVenta = precioVenta;
  }

  @Override
  public int getPrecio() { return precio; }
  @Override
  public double getPrecioVenta() { return precioVenta; }
}
