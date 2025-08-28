package fechas;
import java.time.LocalDate;

public class Fecha {
  public static void main(String[] args) {
    // Fecha actual
    System.out.println("\n\t======== FECHA ACTUAL ========");
    LocalDate ahora = LocalDate.now();
    System.out.println("Fecha actual: " + ahora);

    // Partes
    System.out.println("Año actual:         " + ahora.getYear());
    System.out.println("Mes actual:         " + ahora.getMonth());
    System.out.println("Mes actual (#):     " + ahora.getMonthValue());
    System.out.println("Dia actual:         " + ahora.getDayOfWeek());
    System.out.println("Dia actual (#):     " + ahora.getDayOfMonth());
    System.out.println("Dia actual (#/365): " + ahora.getDayOfYear());

    // Add
    System.out.println("\n\t======== ADICION DE FECHAS ========");
    System.out.println("Next day:           " + ahora.plusDays(1));
    System.out.println("Next week:          " + ahora.plusWeeks(1));
    System.out.println("Next month:         " + ahora.plusMonths(1));
    System.out.println("Next year:          " + ahora.plusYears(1));

    // Fecha especifica
    System.out.println("\n\t======== FECHA ESPECIFICA ========");
    LocalDate birthday = LocalDate.of(2002, 8, 17);
    System.out.println("Cumpleaños:         " + birthday);

    // Desde texto ISO ("yyyy-MM-dd")
    System.out.println("\n\t==== DESDE TEXTO (\"yyyy-MM-dd\") ====");
    LocalDate fecha = LocalDate.parse("2020-12-31");
    System.out.println("Fecha:              " + fecha);

    System.out.println();
  }
}
