package test;
import java.util.Map;
import java.util.LinkedHashMap;
import modelos.Producto;

public class Productos {
  public static void main(String[] args) {
    // LinkedHashMap mantiene el orden de inserción
    Map<String, Producto> inventario = new LinkedHashMap<>();
    inventario.put("P001", new Producto("P001", "Laptop", 5));
    inventario.put("P002", new Producto("P002", "Mouse", 2));
    inventario.put("P003", new Producto("P003", "Teclado", 4));

    // Update
    String clave = "P006";
    if (inventario.containsKey(clave)) {
      System.out.println("Cantidad: " + inventario.get(clave).getCantidad());
      inventario.get(clave).setCantidad(10);
    }

    // Mostrar el inventario
    for (Map.Entry<String, Producto> p : inventario.entrySet()) {
      System.out.println(p.getKey() + " --> " + p.getValue());
    }

    // Eliminar
    System.out.println("Producto eliminado: " + inventario.remove("P003"));

    // Insertar
    inventario.put("P004", new Producto("P004", "Monitor", 4));

    // Mostrar el inventario
    for (Map.Entry<String, Producto> p : inventario.entrySet()) {
      System.out.println(p.getKey() + " --> " + p.getValue());
    }
  }
}
