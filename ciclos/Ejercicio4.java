package ciclos;
import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int action = 0;
    boolean active = true;
    
    while (active) {
      System.out.println("\t======== MENU ========");
      System.out.println("1.- Actualizar");
      System.out.println("2.- Eliminar");
      System.out.println("3.- Crear");
      System.out.println("4.- Listar");
      System.out.println("5.- Salir");

      if (entrada.hasNextInt()) {
        action = entrada.nextInt();
        switch (action) {
          case 1 -> System.out.println("Actualizado correctamente");
          case 2 -> System.out.println("Se ha eliminado el usuario");
          case 3 -> System.out.println("Mostrando lista de usuarios...");
          case 4 -> System.out.println("Se ha creado el usuario");
          case 5 -> {
            System.out.println("Haz salido con exito!");
            active = false;
          }
          default -> System.out.println("Error: Seleccion fuera de rango (1-5)");
        }
      } else {
        System.out.println("Error: Seleccion no es un numero");
        entrada.next();
      }
    }
    entrada.close();
  }
}
