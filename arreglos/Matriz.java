package arreglos;

public class Matriz {
  public static void main(String[] args) {
    final int FILAS=3, COLUMNAS=2;
    int[][] matriz1 = new int[FILAS][COLUMNAS];
    int[][] matriz2 = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    for (int i=0; i<FILAS; i++) {
      for (int j=0; j<COLUMNAS; j++) {
        System.out.print(matriz1[i][j] + " ");
      }
      System.out.println();
    }

    for (int[] fila : matriz2) {
      for (int elemento : fila) {
        System.out.print(elemento + " ");
      }
      System.out.println();
    }
  }
}
