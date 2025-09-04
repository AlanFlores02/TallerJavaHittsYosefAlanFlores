package clases;
import java.time.LocalDate;
import abstractas.Libro;

public class Comics extends Libro {
  private String personaje;

  public Comics(int precio, double precioVenta, LocalDate fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
    super(precio, precioVenta, fechaPublicacion, autor, titulo, editorial);
    this.personaje = personaje;
  }

  public String getpersonaje() { return personaje; }
}
