package test;
import clases.*;

public class TestMain {
  public static void main(String[] args) {
    
    System.out.println("\n\t==== Automovil ====");
    Automovil auto = new Automovil();
    auto.setColor("Rojo");
    auto.setYear(2025);
    System.out.println("Marca: " + auto.getMarca());
    System.out.println("Color: " + auto.getColor());
    System.out.println("Year : " + auto.getYear());

    System.out.println("\n\n\t==== Calculadora ====");
    Calculadora calculadora = new Calculadora();
    System.out.println("Suma de dos enteros : " + calculadora.suma(6, 7));
    System.out.println("Suma de tres enteros: " + calculadora.suma(5, 10, 20));
    System.out.println("Suma de dos doubles : " + calculadora.suma(34.5, 5));

    System.out.println("\n\n\t==== Persona ====");
    calculadora.saludar("Alan");
    Persona p1 = new Persona("Yosef", 23);
    Persona p2 = new Persona("Yosef", 53);
    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println("Son iguales?: " + (p1.equals(p2)));

    System.out.println();
  }
}
