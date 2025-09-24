package archivos;
import java.util.List;
import java.util.Arrays;
import java.nio.file.*;

public class EscrituraArchivo {
  public static void main(String[] args) {
    Path path = Paths.get("file.txt");
    List<String> lineas = Arrays.asList("Línea #1", "Línea #2", "Línea #3");
    try {
      Files.write(path, lineas, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
      System.out.println("Archivo escrito con varias líneas.");
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
