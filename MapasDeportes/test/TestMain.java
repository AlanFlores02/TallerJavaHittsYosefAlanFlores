package test;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Collections;

import modelos.Producto;

public class TestMain {
  public static void main(String[] args) {
    LinkedHashMap<String, Producto> inventario = new LinkedHashMap<>();
    inventario.put("001", new Producto("001", "Pelota de fútbol", "Fútbol", new LinkedHashMap<String, Integer>() {{
      put("Tijuana", 20);
      put("Mexicali", 10);
      put("Ensenada", 5);
    }}));
    inventario.put("011", new Producto("011", "Zapatos de fútbol", "Fútbol", new LinkedHashMap<String, Integer>() {{
      put("Tijuana", 4);
      put("Mexicali", 4);
      put("Ensenada", 4);
    }}));
    inventario.put("002", new Producto("002", "Pelota de básketbol", "Básketbol", new LinkedHashMap<String, Integer>() {{
      put("Tijuana", 8);
      put("Mexicali", 4);
      put("Ensenada", 2);
    }}));
    inventario.put("012", new Producto("012", "Zapatos de básketbol", "Básketbol", new LinkedHashMap<String, Integer>() {{
      put("Tijuana", 2);
      put("Mexicali", 3);
      put("Ensenada", 2);
    }}));
    inventario.put("003", new Producto("003", "Pelota de voleibol", "Voleibol", new LinkedHashMap<String, Integer>() {{
      put("Tijuana", 12);
      put("Mexicali", 9);
      put("Ensenada", 15);
    }}));
    inventario.put("013", new Producto("013", "Zapatos de voleibol", "Voleibol", new LinkedHashMap<String, Integer>() {{
      put("Tijuana", 1);
      put("Mexicali", 1);
      put("Ensenada", 2);
    }}));

    // Mostrar en order de inserción
    System.out.println("\n\t======== ORDEN DE INSERCION ========");
    for (Map.Entry<String, Producto> producto : inventario.entrySet()) {
      System.out.println(producto);
    }

    // Mostrar en order alfabético
    System.out.println("\n\t======== ORDEN ALFABETICO ========");
    List<Map.Entry<String, Producto>> alfabetico = new ArrayList<>(inventario.entrySet());
    Collections.sort(alfabetico, (a, b) -> a.getValue().getNombre().compareTo(b.getValue().getNombre()));
    for (Map.Entry<String, Producto> producto : alfabetico) {
      System.out.println(producto);
    }

    // Get
    System.out.println("\n\t======== PROUCTO 001 ========");
    System.out.println(inventario.get("001"));
    // Compra en tijuana
    System.out.println("\n• Compra de 10 unidades en tijuana.");
    int stock = inventario.get("001").getStockValue("Tijuana");
    inventario.get("001").setStockValue("Tijuana", stock-10);
    System.out.println(inventario.get("001"));
    // Restock en ensenada
    System.out.println("\n• Restock de 10 unidades en ensenada.");
    stock = inventario.get("001").getStockValue("Ensenada");
    inventario.get("001").setStockValue("Ensenada", stock+10);
    System.out.println(inventario.get("001"));
  }
}
