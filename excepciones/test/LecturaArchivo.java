package test;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {
  public static void main(String[] args) {
    try {
      BufferedReader reader = new BufferedReader(new FileReader("datos.txt"));
      System.out.println(reader.readLine());
      reader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Error: No se encuentra el archivo.");
    } catch (IOException e) {
      System.out.println("Error: No se puede leer el archivo.");
    }
  }
}
