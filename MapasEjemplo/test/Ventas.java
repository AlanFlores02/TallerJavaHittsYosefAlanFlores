package test;
import java.util.Map;
import java.util.TreeMap;
import java.time.LocalDate;
import modelos.Venta;

public class Ventas {
  public static void main(String[] args) {
    // TreeMap ordena
    TreeMap<LocalDate, Venta> ventas = new TreeMap<>();
    ventas.put(LocalDate.of(2025, 9, 9),
      new Venta(1, "Eloy", 1500));
    ventas.put(LocalDate.of(2025, 9, 10),
      new Venta(1, "Yosef", 2000));
    ventas.put(LocalDate.of(2025, 9, 11),
      new Venta(1, "Alan", 1000));

    // Mostrar las ventas
    for (Map.Entry<LocalDate, Venta> venta : ventas.entrySet()) {
      System.out.println(venta.getKey() + " --> " + venta.getValue());
    }

    System.out.println("Primera venta: " + ventas.firstEntry());
    System.out.println("Ultima venta: " + ventas.lastEntry());

    System.out.println("Ventas antes del 2025-09-12:");
    for (Map.Entry<LocalDate, Venta> venta : ventas.headMap(LocalDate.of(2025, 9, 12)).entrySet()) {
      System.out.println(venta.getKey() + " --> " + venta.getValue());
    }
  }
}
