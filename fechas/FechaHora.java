package fechas;
import java.time.LocalDateTime;

public class FechaHora {
  public static void main(String[] args) {
    // Fecha actual
    System.out.println("\n\t======== FECHA ACTUAL ========");
    LocalDateTime ahora = LocalDateTime.now();
    System.out.println("Fecha/Hora actual:  " + ahora);

    // Fecha especifica
    System.out.println("\n\t======== FECHA ESPECIFICA ========");
    LocalDateTime dia1 = LocalDateTime.of(2025, 8, 25, 10, 0);
    System.out.println("Curso Hitts dia 1:  " + dia1);

    // Desde texto ISO ("yyyy-MM-dd")
    System.out.println("\n\t==== DESDE TEXTO (\"yyyy-MM-dd\") ====");
    LocalDateTime diaX = LocalDateTime.parse("2025-08-25T12:00");
    System.out.println("Curso Hitts dia x:  " + diaX);

    System.out.println();
  }
}
