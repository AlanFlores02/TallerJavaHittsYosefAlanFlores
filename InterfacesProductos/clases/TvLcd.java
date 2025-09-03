package clases;
import abstractas.Electronico;

public class TvLcd extends Electronico {
  private int pulgada;

  public TvLcd(int precio, double precioVenta, String fabricante, int pulgada) {
    super(precio, precioVenta, fabricante);
    this.pulgada = pulgada;
  }

  public int getPulgada() { return pulgada; }
}
