package clases;
import java.util.Date;
import abstractas.Libro;

public class Comics extends Libro {
  private String personaje;

  public Comics(int precio, double precioVenta, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
    super(precio, precioVenta, fechaPublicacion, autor, titulo, editorial);
    this.personaje = personaje;
  }

  public String getpersonaje() { return personaje; }
}
