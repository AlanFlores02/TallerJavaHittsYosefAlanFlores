package test;
import java.util.Map;
import java.util.LinkedHashMap;
import modelos.Empleado;

public class Empleados {
  public static void main(String[] args) {
    Map<Integer, Empleado> empleados = new LinkedHashMap<>();
    empleados.put(1, new Empleado(1, "Yosef", "Management"));
    empleados.put(1, new Empleado(2, "Alan", "Programación"));
    empleados.put(1, new Empleado(3, "Eloy", "Educación"));

    // Mostrar lista
    for (Map.Entry<Integer, Empleado> p : empleados.entrySet()) {
      System.out.println(p.getKey() + " --> " + p.getValue());
    }

    // Acceder por ID
    System.out.println("Buscar empleado con ID: 1");
    System.out.println(empleados.get(1));

    // Verificar si existe
    int buscarID = 2;
    if (empleados.containsKey(buscarID))
      System.out.println("El empleado " + buscarID + " si existe.");
    else
      System.out.println("El empleado " + buscarID + " no existe.");
    
    // Eliminar
    System.out.println("Empleado eliminado: " + empleados.remove(3));

    // Mostrar lista
    for (Map.Entry<Integer, Empleado> p : empleados.entrySet()) {
      System.out.println(p.getKey() + " --> " + p.getValue());
    }

  }
}
