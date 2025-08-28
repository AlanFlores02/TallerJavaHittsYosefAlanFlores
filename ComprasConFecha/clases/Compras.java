package clases;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Compras {
  private String producto; 
  private double precio;
  private LocalDateTime tiempo;

  public Compras() {

  }

  public Compras(String producto, double precio) {
    this.tiempo = LocalDateTime.now();
    this.producto = producto;
    this.precio = precio;
  }

  @Override
  public String toString() {
    return "{producto: " + producto +
          ", precio: " + precio + 
          ", tiempo: " + tiempo + "}";
  }

  public String formatDate(String language, String country) {
    // yyyy-MM-dd --> dd/MM/yyyy
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE, dd/MMMM/yyyy HH:mm:ss", Locale.of(language, country));
    return tiempo.format(formato);
  }
}
