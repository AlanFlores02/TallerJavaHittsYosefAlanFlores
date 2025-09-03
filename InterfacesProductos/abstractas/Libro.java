package abstractas;
import java.util.Date;
import interfaces.ILibro;

public abstract class Libro extends Producto implements ILibro {
  protected Date fechaPublicacion;
  protected String autor;
  protected String titulo;
  protected String editorial;

  public Libro(int precio, double precioVenta, Date fechaPublicacion, String autor, String titulo, String editorial) {
    super(precio, precioVenta);
    this.fechaPublicacion = fechaPublicacion;
    this.autor = autor;
    this.titulo = titulo;
    this.editorial = editorial;
  }

  @Override
  public Date getFechaPublicacion() { return fechaPublicacion; }
  @Override
  public String getAutor() { return autor; }
  @Override
  public String getTitulo() { return titulo; }
  @Override
  public String getEditorial() { return editorial; }
}
