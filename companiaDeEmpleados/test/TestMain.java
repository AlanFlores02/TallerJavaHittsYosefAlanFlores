package test;
import clases.*;

public class TestMain {
  public static void main(String[] args) {
    Persona p1 = new Persona("Chavo", "Del Ocho", "00008", "Barril");
    Cliente c1 = new Cliente("Pepsi", "Man", "01800", "OXXO");
    Empleado e1 = new Empleado("Calamardo", "Tentaculos", "12345", "Fondo de Bikini", 0.50);
    Gerente g1 = new Gerente("Eugene", "Cangrejo", "54321", "Fondo de Bikini", 2500.0, 2.50);

    System.out.println(p1.toString());
    System.out.println(c1.toString());
    System.out.println(e1.toString());
    System.out.println(g1.toString());

    System.out.println("\n\t======== Operaciones ========");
    e1.aumentarRemuneracion(50);
    g1.aumentarRemuneracion(200);
    System.out.println(e1.toString());
    System.out.println(g1.toString());
  }
}
