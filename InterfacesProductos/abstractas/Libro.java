package abstractas;
import java.time.LocalDate;
import interfaces.ILibro;

public abstract class Libro extends Producto implements ILibro {
  protected LocalDate fechaPublicacion;
  protected String autor;
  protected String titulo;
  protected String editorial;

  public Libro(int precio, double precioVenta, LocalDate fechaPublicacion, String autor, String titulo, String editorial) {
    super(precio, precioVenta);
    this.fechaPublicacion = fechaPublicacion;
    this.autor = autor;
    this.titulo = titulo;
    this.editorial = editorial;
  }

  @Override
  public LocalDate getFechaPublicacion() { return fechaPublicacion; }
  @Override
  public String getAutor() { return autor; }
  @Override
  public String getTitulo() { return titulo; }
  @Override
  public String getEditorial() { return editorial; }
}
