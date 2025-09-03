package clases;
import abstractas.Electronico;

public class IPhone extends Electronico {
  private String modelo;
  private String color;

  public IPhone(int precio, double precioVenta, String fabricante, String modelo, String color) {
    super(precio, precioVenta, fabricante);
    this.modelo = modelo;
    this.color = color;
  }

  public String getModelo() { return modelo; }
  public String getColor() { return color; }
}
