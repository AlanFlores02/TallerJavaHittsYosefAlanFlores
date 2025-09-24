package conjuntos;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import modelos.Alumno;

public class ConjuntoHashSet {
  public static void main(String[] args) {
    Set<String> departamentos = new HashSet<>();
    departamentos.add("");
    departamentos.add("");
    departamentos.add("");
    departamentos.add("");
    departamentos.add("");

    Iterator<String> iterator = departamentos.iterator();
    while (iterator.hasNext()) {
      String next = iterator.next();
      System.out.println("Departamento: " + next);
      if (next.equals("TI")) {
        iterator.remove();
      }
    }
    System.out.println("Departamentos: " + departamentos);

    System.out.println("\n\t======== ALUMNOS ========");
    Set<Alumno> alumnos = new HashSet<>();
    alumnos.add(new Alumno(1, "Yosef", 90));
    alumnos.add(new Alumno(2, "Alan", 100));
    alumnos.add(new Alumno(4, "Eloy", 80));
    alumnos.add(new Alumno(3, "Obama", 75));
    alumnos.add(new Alumno(3, "Obama", 75));
    for (Alumno alumno : alumnos) {
      System.out.println(alumno.toString());
    }
  }
}
