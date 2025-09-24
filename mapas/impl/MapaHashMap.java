package impl;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class MapaHashMap {
  public static void main(String[] args) {
    Map<Integer, String> frutas = new HashMap<>();
    frutas.put(1, "Manzana");
    frutas.put(3, "Uvas");
    frutas.put(2, "Melon");
    frutas.put(5, "Sandia");
    System.out.println("Frutas: " + frutas); //print
    frutas.put(1, "Sandia");
    frutas.put(null, "Fruta desconocida");
    System.out.println("Frutas: " + frutas); //print
    frutas.put(null, "Otra fruta");
    System.out.println("Frutas: " + frutas); //print
    System.out.println("Fruta2: " + frutas.get(2)); //print index
    
    // Recorrer por clave
    System.out.println("• Recorriendo por clave");
    for (Integer clave : frutas.keySet()) {
      System.out.println("  Clave: " + clave);
    }

    // Recorrer solo los valores
    System.out.println("• Recorriendo por valores");
    List<String> valores = new ArrayList<>(frutas.values());
    //Set<String> valores = new HashSet<>(frutas.values());
    for (String valor : valores) {
      System.out.println("  Valor: " + valor);
    }
  }
}
