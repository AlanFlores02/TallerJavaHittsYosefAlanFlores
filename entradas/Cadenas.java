package entradas;

public class Cadenas {
  public static void main(String[] args) {
    String A = "Hola mundo";
    String B = "Hola Mundo";
    printRed("A==B                  : " + (A==B));
    printBlu("A.equals(B)           : " + A.equals(B));
    printRed("A.equalsIgnoreCase(B) : " + A.equalsIgnoreCase(B));
  }

  static void printRed(String text) {
    System.out.print("\u001B[31m" + text + "\n");
  }

  static void printBlu(String text) {
    System.out.print("\u001B[34m" + text + "\n");
  }
}
