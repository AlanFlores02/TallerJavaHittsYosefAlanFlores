package genericos;
import java.util.List;
import java.util.ArrayList;

public class ServicioGenerico<T extends Identificable<ID>, ID> {
  private List<T> datos = new ArrayList<>();

  /*public ServicioGenerico() {
    datos = new ArrayList<>();
  }*/

  // Buscar por ID
  public T buscarPorId(ID id) {
    for (T elemento : datos) {
      if (elemento.getId().equals(id)) return elemento;
    }
    return null;
  }

  // Guardar nuevo elemento
  public void guardar(T elemento) {
    if (buscarPorId(elemento.getId()) != null) {
      System.out.println("Ya existe un elemento con ID: " + elemento.getId());
    } else {
      datos.add(elemento);
      System.out.println("Guardado: " + elemento);
    }
  }

  // Listar todos los elementos
  public List<T> listar() {
    return datos;
  }

  // Actualizar un elemento de datos de acuerdo al ID
  public boolean actualizar(ID id, T nuevoElemento) {
    for (int i=0; i<datos.size(); i++) {
      if (datos.get(i).getId().equals(id)) {
        datos.set(i, nuevoElemento);
        System.out.println("Actualizado ID " + id + " con: " + nuevoElemento);
        return true;
      }
    }
    System.out.println("No se encontró ID " + id + " para actualizar.");
    return false;
  }

  // Eliminar un elemento con ID
  public boolean eliminar(ID id) {
    for (int i=0; i<datos.size(); i++) {
      if (datos.get(i).getId().equals(id)) {
        datos.remove(i);
        System.out.println("Eliminado ID: " + id);
        return true;
      }
    }
    System.out.println("No se encontró el ID: " + id);
    return false;
  }
}
