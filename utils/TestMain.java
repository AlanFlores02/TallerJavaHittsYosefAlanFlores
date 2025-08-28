package utils;

public class TestMain {
  public static void main(String[] args) {
    System.out.println("\n\t======== UtilsMath ========");
    //UtilsMath util = new UtilsMath();
    System.out.println("Valor de PI: " + UtilsMath.PI);
    System.out.println("Potencia de 10: " + UtilsMath.square(10));
    
    System.out.println("\n\t======== static vars ========");
    Persona p1 = new Persona("Yosef", 53);
    Persona p2 = new Persona("Alan", 23);
    System.out.println("Cantidad de personas: " + Persona.getContador());
    
    System.out.println();
  }
}
