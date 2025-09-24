package clases;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Deporte {
  private String nombre;
  private Set<Jugador> hashSet = new HashSet<>();
  private Set<Jugador> linkedHashSet = new LinkedHashSet<>();
  private Set<Jugador> treeSet = new TreeSet<>();

  public Deporte(String nombre) { this.nombre = nombre; }
  public int getSize() { return hashSet.size(); }
  public Set<Jugador> getSet() { return hashSet; }

  public void add(Jugador jugador) {
    // prevent duplicates
    hashSet.add(jugador);
    linkedHashSet.add(jugador);
    treeSet.add(jugador);
  }

  public void imprimirSinOrden() {
    System.out.println("Lista de jugadores de " + nombre + " sin orden (HashSet)");
    for (Jugador jugador : hashSet) {
      System.out.println(jugador.toString());
    }
  }

  public void imprimirOrdenInscripcion() {
    System.out.println("Lista de jugadores de " + nombre + " en orden de inscripción (LinkedHashSet)");
    Iterator<Jugador> iterator = linkedHashSet.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next().toString());
    }
  }

  public void imprimirPorId() {
    System.out.println("Lista de jugadores de " + nombre + " ordenados por id (TreeSet)");
    for (Jugador jugador : treeSet) {
      System.out.println(jugador.toString());
    }
  }
}
