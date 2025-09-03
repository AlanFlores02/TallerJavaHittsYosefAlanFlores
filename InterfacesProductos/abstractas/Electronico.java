package abstractas;
import interfaces.IElectronico;

public abstract class Electronico extends Producto implements IElectronico{
  protected String fabricante;

  public Electronico(int precio, double precioVenta, String fabricante) {
    super(precio, precioVenta);
    this.fabricante = fabricante;
  }

  @Override
  public String getFabricante() { return fabricante; }
}
