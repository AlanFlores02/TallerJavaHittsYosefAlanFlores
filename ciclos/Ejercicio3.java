package ciclos;
import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int passAmount = 0, failAmount = 0;
    double passPromedio = 0, failPromedio = 0, promedioTotal = 0;
    
    for (int i=1; i<=20; i++) {
      System.out.print("Nota Final del alumno #" + i + ": ");
      double nota = entrada.nextDouble();

      if (nota < 1 || nota > 10) {
        System.out.println("Error: Valor fuera de rango (1-10)");
        entrada.close();
        return;
      }
      else if (nota < 6) {
        failAmount++;
        failPromedio += nota;
      }
      else {
        passAmount++;
        passPromedio += nota;
      }
      promedioTotal += nota;
    }
    
    passPromedio /= passAmount;
    failPromedio /= failAmount;
    promedioTotal /= 20;
    entrada.close();

    System.out.println("Promedio de alumnos aprovados:  " + passPromedio);
    System.out.println("Promedio de alumnos reprovados: " + failPromedio);
    System.out.println("Promedio Total:                 " + promedioTotal);
  }
}
