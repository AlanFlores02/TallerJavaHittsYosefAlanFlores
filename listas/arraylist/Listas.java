package arraylist;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import modelos.Persona;

public class Listas {
  public static void main(String[] args) {
    List<String> nombres = new ArrayList<>();
    // Add
    nombres.add("Yosef");
    nombres.add("Alan");
    nombres.add("Flores");
    nombres.add("López");
    System.out.println(nombres);
    // Add in index
    nombres.add(2, "--------");
    System.out.println("index 2: " + nombres.get(2));
    // Add first/last
    nombres.addFirst("========");
    nombres.addLast("========");
    for (String nombre : nombres) { System.out.println(nombre); }
    // Remove
    System.out.println("Eliminado: " + nombres.remove(3));
    for (String nombre : nombres) { System.out.println(nombre); }

    // Iterator
    var iterador = nombres.listIterator();
    System.out.println("Recorriendo con iterador...");
    while (iterador.hasNext()) {
      String next = iterador.next();
      if (next.equals("Alan")) iterador.remove();
      else System.out.println("Elemento: " + next);
    }
    while (iterador.hasPrevious()) {
      String previous = iterador.previous();
      if (previous.equals("López")) iterador.remove();
      else System.out.println("Elemento: " + previous);
    }

    // Order
    Collections.sort(nombres);
    System.out.println("Lista ordenada:");
    System.out.println(nombres);

    // Order Class
    List<Persona> personas = new ArrayList<>();
    personas.add(new Persona(1, "Yosef", 53));
    personas.add(new Persona(2, "Alan", 23));
    personas.add(new Persona(4, "Eloy", 40));
    personas.add(new Persona(5, "Jesus", 2025));
    personas.add(new Persona(3, "Obama", 64));
    //
    System.out.println("Lista de clases desordenada:");
    for (Persona persona : personas) { System.out.println(persona.toString()); }
    // Id
    System.out.println("Lista de clases ordenada (por id):");
    Collections.sort(personas);
    for (Persona persona : personas) { System.out.println(persona.toString()); }
    // Nombre
    System.out.println("Lista de clases ordenada (por nombre):");
    Collections.sort(personas, (c1, c2) -> c1.getNombre().compareToIgnoreCase(c2.getNombre()));
    for (Persona persona : personas) { System.out.println(persona.toString()); }
    // Edad
    System.out.println("Lista de clases ordenada (por edad):");
    personas.sort(Comparator.comparingInt(Persona::getEdad));
    for (Persona persona : personas) { System.out.println(persona.toString()); }
  }
}
