package conjuntos;
import java.util.Set;
import java.util.LinkedHashSet;

public class ConjuntoLinkedHashSet {
  public static void main(String[] args) {
    Set<Integer> numeros = new LinkedHashSet<>();
    numeros.add(34);
    numeros.add(23);
    numeros.add(34); // duplicado, se ignora
    numeros.add(50);
    numeros.add(20);
    numeros.add(10);
  }
}
