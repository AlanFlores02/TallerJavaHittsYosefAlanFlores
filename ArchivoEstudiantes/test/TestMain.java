package test;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.*;
import clases.Estudiante;

public class TestMain {
  public static void main(String[] args) {
    Path input = Paths.get("estudiantes.txt");
    Path output = Paths.get("reporte.txt");
    try {
      // Listas
      List<String> lineas = Files.readAllLines(input);
      List<Estudiante> estudiantes = new ArrayList<>();

      // Convertir cada elemento a Estudiante
      for (String linea : lineas) {
        String[] elementos = linea.split(",");
        String nombre = elementos[0].trim();
        int edad = Integer.parseInt(elementos[1].trim());
        double calificacion = Double.parseDouble(elementos[2].trim());
        estudiantes.add(new Estudiante(nombre, edad, calificacion));
      }

      // Variables estadísticas
      int size = estudiantes.size();
      int sumaEdades = 0;
      double sumaScores = 0;
      double maxScore = Double.MIN_VALUE;
      double minScore = Double.MAX_VALUE;
      Estudiante mejorEstudiante = null;
      Estudiante peorEstudiante = null;

      // Calcular totales y promedios
      for (Estudiante e : estudiantes) {
        sumaEdades += e.getEdad();
        sumaScores += e.getCalificacion();
        if (e.getCalificacion() > maxScore) {
          maxScore = e.getCalificacion();
          mejorEstudiante = e;
        }
        else if (e.getCalificacion() < minScore) {
          minScore = e.getCalificacion();
          peorEstudiante = e;
        }
      }
      double promedioEdad = size > 0 ? (double)sumaEdades/size : 0;
      double promedioScore = size > 0 ? (double)sumaScores/size : 0;

      // Construir el reporte
      StringBuilder reporte = new StringBuilder();
      reporte.append("REPORTE DE ESTUDIANTES");
      reporte.append("\n============================");
      reporte.append("\nTotal de estudiantes:       ").append(size);
      reporte.append("\nPromedio de edades:         ").append(String.format("%.2f", promedioEdad));
      reporte.append("\nPromedio de calificaciones: ").append(String.format("%.2f", promedioScore));
      reporte.append("\nMejor Estudiante:           ").append(maxScore).append(" (")
             .append(mejorEstudiante!=null ? mejorEstudiante.getNombre() : "-").append(")");
      reporte.append("\nPeor Estudiante:            ").append(minScore).append(" (")
             .append(peorEstudiante!=null ? peorEstudiante.getNombre() : "-").append(")");

      // Guardar reporte
      Files.writeString(output, reporte, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
      System.out.println("Reporte guardado en:          " + output.toAbsolutePath());

    } catch (IOException e) {
      System.out.println("Error al manejar el archivo:  " + e.getMessage());
    } catch (NumberFormatException e) {
      System.out.println("Error de formato de los datos: " + e.getMessage());
    }
  }
}