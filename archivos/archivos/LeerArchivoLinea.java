package archivos;
import java.util.List;
import java.io.IOException;
import java.nio.file.*;

public class LeerArchivoLinea {
  public static void main(String[] args) {
    Path path = Paths.get("file.txt");
    try {
      List<String> lineas = Files.readAllLines(path);
      for (String linea : lineas) {
        System.out.println("\t" + linea);
      }
    } catch (IOException e) {
      System.out.println("Error al leer las líneas: " + e);
    }
  }
}
