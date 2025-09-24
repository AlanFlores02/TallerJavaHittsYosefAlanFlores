package archivos;
import java.io.IOException;
import java.nio.file.*;

public class Archivos {
  public static void main(String[] args) {
    createFile("file.txt");
    standardCreateFile("standard.txt", "HOLA MUNDO.\n");
  }

  public static void createFile(String _path) {
    Path path = Paths.get(_path);
    try {
      Files.createFile(path);
      System.out.println("Archivo creado: " + path.toAbsolutePath());
    } catch (IOException e) {
      System.out.println("Error al crear el archivo: " + e.getMessage());
    }
  }

  public static void standardCreateFile(String _path, String _message) {
    Path path = Paths.get(_path);
    try {
      Files.writeString(path, _message, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
      System.out.println("Archivo creado y mensaje escrito: " + path.toAbsolutePath());
    } catch (IOException e) {
      System.out.println("Error al escribir en el archivo: " + e.getMessage());
    }
  }

  public static void standardAppendFile(String _path, String _message) {
    Path path = Paths.get(_path);
    try {
      Files.writeString(path, _message, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
      System.out.println("Archivo creado y mensaje escrito: " + path.toAbsolutePath());
    } catch (IOException e) {
      System.out.println("Error al escribir en el archivo: " + e.getMessage());
    }
  }
}
