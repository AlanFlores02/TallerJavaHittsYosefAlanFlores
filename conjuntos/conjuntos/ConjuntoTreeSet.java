package conjuntos;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoTreeSet {
  public static void main(String[] args) {
    Set<String> frutas = new TreeSet<>();
    System.out.println("Frutas: " + frutas.isEmpty());
    frutas.add("Manzana");
    frutas.add("Pera");
    frutas.add("Naranja");
    frutas.add("Pera"); //duplicado, se ignora
    frutas.add("Banana");
    // Se ordena alfabeticamente por default
    System.out.println("Frutas: " + frutas);
  }
}
