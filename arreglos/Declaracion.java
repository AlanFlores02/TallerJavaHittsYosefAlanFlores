package arreglos;

public class Declaracion {
  public static void main(String[] args) {
    // Initiate array with size
    int[] numeros = new int[10];
    // Initiate array with values
    char[] vocales = {'a', 'e', 'i', 'o', 'u'};

    // Array lenght
    System.out.println("Array Length: " + numeros.length);

    // Edit array values
    for (int i=0; i<numeros.length; i++) {
      numeros[i] = (i+1) * 10;
    }
    numeros[4] *= 10;
    numeros[9] *= 50;

    // Print array
    System.out.print("HiScore: ");
    for (int i : numeros) {
      System.out.print(i + " ");
    }
    System.out.print("\nVocales: ");
    for (char c : vocales) {
      System.out.print(c + " ");
    }
  }
}
