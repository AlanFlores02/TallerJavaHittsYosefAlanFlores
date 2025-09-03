package test;
import clases.Persona;
import herencia.Estudiante;

public class TestMain {
  public static void main(String[] args) {
    Persona p1 = new Persona("Yosef", 53);
    Estudiante e1 = new Estudiante("Alan", 23, "Programacion");

    System.out.println("\n\t======== PERSONA ========");
    p1.mostrarInfo();
    System.out.println("\n\t======== ESTUDIANTE ========");
    e1.mostrarInfo();
  }
}
