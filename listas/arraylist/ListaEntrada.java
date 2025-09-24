package arraylist;
import java.util.List;
import java.util.LinkedList;

public class ListaEntrada {
  public static void main(String[] args) {
    List<String> frutas = new LinkedList<>();
    // Add
    frutas.add("Manzana");
    frutas.add("Platano");
    frutas.add("Naranja");
    System.out.println(frutas);
    // Get
    System.out.println("index 1:" + frutas.get(1));
    // Add in index (más eficiene que ArrayList)
    frutas.add(1, "Pera");
    System.out.println(frutas);
    // Remove
    System.out.println("Eliminado: " + frutas.remove(1));
    System.out.println(frutas);
    // Edit
    frutas.set(1, "Fresa");
    System.out.println(frutas);
    // Reverse
    System.out.println(frutas.reversed());
  }
}
