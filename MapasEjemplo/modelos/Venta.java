package modelos;

public class Venta {
  private int id;
  private String cliente;
  private double monto;

  public Venta(int id, String cliente, double monto) {
    this.id = id;
    this.cliente = cliente;
    this.monto = monto;
  }
  
  public int getId() { return id; }
  public void setId(int id) { this.id = id; }

  public String getCliente() { return cliente; }
  public void setCliente(String cliente) { this.cliente = cliente; }
  
  public double getMonto() { return monto; }
  public void setMonto(double monto) { this.monto = monto; }
}
