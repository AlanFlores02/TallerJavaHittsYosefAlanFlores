package test;
import java.util.List;
import entidades.*;
import repo.Repositorio;

public class TestMain {
  public static void main(String[] args) {
    Repositorio<Cliente> clienteRepositorio = new Repositorio<>();
    clienteRepositorio.agregar(new Cliente("Yosef"));
    clienteRepositorio.agregar(new Cliente("Alan"));
    clienteRepositorio.agregar(new Cliente("Flores"));

    List<Cliente> clientes = clienteRepositorio.obtenerTodo();

    System.out.println("\n\t======== CLIENTES ========");
    for (Cliente cliente : clientes) {
      System.out.println(cliente);
    }

    Repositorio<Producto> productoRepositorio = new Repositorio<>();
    productoRepositorio.agregar(new Producto("Leche LaLa", 20.50));
    productoRepositorio.agregar(new Producto("Pan Bimbo", 45));
    productoRepositorio.agregar(new Producto("Arroz", 35.75));
    productoRepositorio.agregar(new Producto("Azucar", 23.40));
    
    System.out.println("\n\t======== PRODUCTOS ========");
    for (Producto producto : productoRepositorio.obtenerTodo()) {
      System.out.println(producto);
    }
  }
}
