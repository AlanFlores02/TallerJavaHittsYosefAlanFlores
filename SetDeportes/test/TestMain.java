package test;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import clases.Jugador;
import clases.Deporte;

public class TestMain {
  static Scanner entrada = new Scanner(System.in);
  public static Deporte futbol = new Deporte("fútbol");
  public static Deporte basketbol = new Deporte("básketbol");
  public static Deporte voleibol = new Deporte("vóleibol");

  public static void main(String[] args) {
    // Setup
    Jugador[] jugadores = {
      new Jugador("Alan Flores"),
      new Jugador("Barack Obama"),
      new Jugador("Chespirito"),
      new Jugador("Dracula"),
      new Jugador("Eloy Sanchez"),
      new Jugador("Mr. Fantástico"),
      new Jugador("Guillermo del Toro"),
      new Jugador("Harry Potter")
    };

    futbol.add(jugadores[0]);
    futbol.add(jugadores[1]);
    futbol.add(jugadores[2]);
    futbol.add(jugadores[3]);

    basketbol.add(jugadores[0]);
    basketbol.add(jugadores[4]);
    basketbol.add(jugadores[2]);
    basketbol.add(jugadores[6]);

    voleibol.add(jugadores[7]);
    voleibol.add(jugadores[4]);
    voleibol.add(jugadores[1]);
    voleibol.add(jugadores[0]);

    // Main Menu Loop
    int accion = 0;
    while (accion != 9) {
      accion = entrada.nextInt(); entrada.next();
      switch (accion) {
        case 1 -> MostrarJugadoresPorDeporte();
        case 2 -> ContarJugadoresPorDeporte();
        /*case 3 -> FusionarEquipos();
        case 4 -> JugadoresEnComun();
        case 5 -> Transferencia();
        case 6 -> MostrarTodosLosJugadores_OrdenPorNombre();
        case 7 -> MostrarTodosLosJugadores_OrdenPorInscripcion();
        case 8 -> MostrarTodosLosJugadores_OrdenPorID();
        case 9 -> Salir(); */
      }
    }
  }

  private static void MostrarJugadoresPorDeporte() {
    System.out.println("\nCUAL DEPORTE?");
    System.out.println("1.Fútbol");
    System.out.println("2.Básketbol");
    System.out.println("3.Vóleibol");

    int deporte = entrada.nextInt(); entrada.next();

    switch (deporte) {
      case 1:
        System.out.println("\n\t======== FUTBOL ========");
        futbol.imprimirSinOrden();
        break;
      case 2:
        System.out.println("\n\t======== BASKETBOL ========");
        basketbol.imprimirSinOrden();
        break;
      case 3:
        System.out.println("\n\t======== VOLEIBOL ========");
        voleibol.imprimirSinOrden();
        break;
    }
  }

  private static void ContarJugadoresPorDeporte() {
    System.out.println("\nCUAL DEPORTE?");
    System.out.println("1.Fútbol");
    System.out.println("2.Básketbol");
    System.out.println("3.Vóleibol");

    int deporte = entrada.nextInt(); entrada.next();

    switch (deporte) {
      case 1 -> System.out.println("FUTBOL: " + futbol.getSize());
      case 2 -> System.out.println("BASKETBOL: " + basketbol.getSize());
      case 3 -> System.out.println("VOLEIBOL: " + voleibol.getSize());
    }
  }

  private static Set<Jugador> FusionarEquipos(Deporte equipo1, Deporte equipo2) {
    Set<Jugador> union = equipo1.getSet();
    union.addAll(equipo2.getSet());
    return union;
  }

  private static Set<Jugador> JugadoresEnComun(Deporte equipo1, Deporte equipo2) {
    Set<Jugador> union = equipo1.getSet();
    union.retainAll(equipo2.getSet());
    return union;
  }

  private static Set<Jugador> JugadoresUnicos(Deporte equipo1, Deporte equipo2) {
    Set<Jugador> union = equipo1.getSet();
    union.removeAll(equipo2.getSet());
    return union;
  }
}
