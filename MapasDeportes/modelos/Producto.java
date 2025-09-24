package modelos;
import java.util.Map;

public class Producto {
  private String codigo;
  private String nombre;
  private String categoria;
  private Map<String, Integer> stock;

  public Producto(String codigo, String nombre, String categoria, Map<String, Integer> stock) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.categoria = categoria;
    this.stock = stock;
  }

  public String getCodigo() { return codigo; }
  public void setCodigo(String codigo) { this.codigo = codigo; }

  public String getNombre() { return nombre; }
  public void setNombre(String nombre) { this.nombre = nombre; }

  public String getCategoria() { return categoria; }
  public void setCategoria(String categoria) { this.categoria = categoria; }

  public Map<String, Integer> getStock() { return stock; }
  public void setStock(Map<String, Integer> stock) { this.stock = stock; }

  public Integer getStockValue(String key) { return stock.get(key); }
  public void setStockValue(String key, Integer value) {
    if (stock.containsKey(key)) stock.replace(key, value);
    else System.out.println("Error: No existe la sucursal " + key);
  }
  public boolean getStockKey(String key) { return stock.containsKey(key); }
  public void setStockKey(String key, Integer value) {
    if (stock.containsKey(key)) System.out.println("Error: Ya existe una sucursal de nombre " + key);
    else stock.put(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("\nCódigo:    ").append(codigo)
      .append("\nNombre:    ").append(nombre)
      .append("\nCategoría: ").append(categoria)
      .append("\nStock Disponible: [");
    for (Map.Entry<String, Integer> e : stock.entrySet()) {
      sb.append("\nSucursal ").append(e.getKey())
        .append(" --> ").append(e.getValue()).append(" unidades.");
    }
    sb.append("\n]");
    return sb.toString();
  }
}
