package test;
import enums.Calificacion;
import enums.Dia;

public class TestMain {
  private static String verificarDias(Dia dia) {
    String respuesta = switch(dia) {
      case Dia.SABADO, Dia.DOMINGO -> "Fin de semana";
      default -> "Dia laboral";
    };
    return respuesta;
  }
  public static void main(String[] args) {
    System.out.println("Dia Lunes:    " + verificarDias(Dia.LUNES));
    System.out.println("Dia Viernes:  " + verificarDias(Dia.VIERNES));
    System.out.println("Dia Sabado:   " + verificarDias(Dia.SABADO));
    System.out.println(Dia.values());

    for (Calificacion cal : Calificacion.values()) {
      System.out.println("Valor ordinal:  " + cal.ordinal());
      System.out.println("Valor:          " + cal.name());
      System.out.println("Descripcion:    " + cal.getCalificacion());
    }
  }
}