package arreglos;
import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int N = 0;

    System.out.print("N-Size: ");
    if (entrada.hasNextInt()) {
      N = entrada.nextInt();
      if (N < 1) {
        System.out.println("Error: Numero debe ser 1 o mayor.");
        entrada.close();
        return;
      }
    } else {
      entrada.next();
      entrada.close();
      System.out.println("Error: Input debe ser un numero entero.");
      return;
    }
    entrada.close();
    
    //char[][] matriz = new char[N][N];
    for (int i=0; i<N; i++) {
      for (int j=0; j<N; j++) {
        if (i==j || i==N-j-1)
          System.out.print('X');
          //matriz[i][j] = 'X';
        else
          System.out.print('_');
          //matriz[i][j] = '_';
        //System.out.print(matriz[i][j]);
      }
      System.out.println();
    }
  }
}
