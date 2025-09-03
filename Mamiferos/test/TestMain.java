package test;
import clases.*;

public class TestMain {
  public static void main(String[] args) {
    Mamifero[] mamiferos = new Mamifero[5];
    mamiferos[0] = new Leon("Panthera Leo", "la sabana africana", 120, 220, 190, 12, 5, 20, 22);
    mamiferos[1] = new Tigre("Panthera Tigris", "la selva tropical", 94, 140, 72, 10, 25, "Tigre Siberiano");
    mamiferos[2] = new Guepardo("Acinonyx Jubatus", "el pastizal", 4.9f, 130, 94, 8, 29);
    mamiferos[3] = new Lobo("Canis Lupus", "el bosque", 80, 120, 60, 18, "Gris", 2, "Lobo Gris");
    mamiferos[4] = new Perro("Canis Lupus Familiaris", "la ciudad", 50, 85, 30, 20, "Café", 700);
    
    for (Mamifero animal : mamiferos) {
      System.out.println("\n\t======== " + animal.getNombreCientifico() + " ========");
      System.out.println(animal.comer());
      System.out.println(animal.dormir());
      System.out.println(animal.correr());
      System.out.println(animal.comunicarse());
    }
  }
}
