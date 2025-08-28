package fechas;
import java.time.LocalTime;

public class Hora {
  public static void main(String[] args) {
    // Hora actual
    System.out.println("\n\t======== HORA ACTUAL ========");
    LocalTime ahora = LocalTime.now();
    System.out.println("Hora actual:        " + ahora);

    // Partes
    System.out.println("Hora actual:        " + ahora.getHour());
    System.out.println("Minuto actual:      " + ahora.getMinute());
    System.out.println("Segundo actual:     " + ahora.getSecond());
    System.out.println("Nanosegundo actual: " + ahora.getNano());

    // Add
    System.out.println("\n\t======== ADICION DE HORAS ========");
    System.out.println("Next hour:          " + ahora.plusHours(1));
    System.out.println("Next minute:        " + ahora.plusMinutes(1));
    System.out.println("Next second:        " + ahora.plusSeconds(1));
    System.out.println("Next nanosecond:    " + ahora.plusNanos(1));

    // Hora especifica
    System.out.println("\n\t======== Hora ESPECIFICA ========");
    LocalTime inicio = LocalTime.of(10, 0, 0);
    System.out.println("Inicio de clase:    " + inicio);
    System.out.println("Toma de asistencia: " + inicio.plusMinutes(10));
    System.out.println("Fin de la clase:    " + inicio.plusHours(2));

    // Desde texto ISO ("yyyy-MM-dd")
    System.out.println("\n\t==== DESDE TEXTO (\"hh:mm:ss\") ====");
    LocalTime hora = LocalTime.parse("2:30");
    System.out.println("Hora de comer:      " + hora);

    System.out.println();
  }
}
