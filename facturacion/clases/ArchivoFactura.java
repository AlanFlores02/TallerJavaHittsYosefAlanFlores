package clases;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import entidades.*;

public class ArchivoFactura {
  public static void guardar(Factura factura) {
    Path path = Paths.get("facturas/factura_" + factura.getId() + ".txt");
    try {
      Files.writeString(path, factura.generarReporte(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
      System.out.println("Factura #" + factura.getId() + " guardada en archivo.");
    } catch (Exception e) {
      System.out.println("Error: " + e);
    }
  }

  public static void leer(int id) {
    Path path = Paths.get("facturas/factura_" + id + ".txt");
    try {
      List<String> lineas = Files.readAllLines(path);
      for (String linea : lineas) {
        System.out.println("\t" + linea);
      }
    } catch (IOException e) {
      System.out.println("Error al leer las líneas: " + e);
    }
  }

  public static void lista() {
    System.out.println("\n======== LISTA DE ARCHIVOS DE FACTURAS ========");
    File[] archivos = new File("facturas").listFiles();
    for (File archivo : archivos) {
      System.out.println(archivo.getName());
    }
  }
}
