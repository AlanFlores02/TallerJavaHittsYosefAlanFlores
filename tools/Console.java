package tools;

public class Console {

  /* ~~~~~~~~ PRINT ~~~~~~~~ */

  public static void print(String text) {
    // Print simple text
    System.out.print(text);
  }

  public static void print(String text, Color color) {
    // Print Color
    System.out.print("\u001B[" + color.getId() + "m" + text + "\u001B[0m");
  }

  public static void print2(String text, Color color) {
    // Print Bright Color
    System.out.print("\u001B[1;" + color.getId() + "m" + text + "\u001B[0m");
  }

  public static void print(String text, int R, int G, int B) {
    // Print Custom Color
    System.out.print("\u001B[2;" + R + ";" + G + ";" + B + "m" + text + "\u001B[0m");
  }

  /* ~~~~~~~~ PRINT NEWLINE ~~~~~~~~ */

  public static void println(String text) {
    // Print simple text
    System.out.println(text);
  }

  public static void println(String text, Color color) {
    // Print Color
    System.out.println("\u001B[" + color.getId() + "m" + text + "\u001B[0m");
  }

  public static void println2(String text, Color color) {
    // Print Bright Color
    System.out.println("\u001B[1;" + color.getId() + "m" + text + "\u001B[0m");
  }

  public static void println(String text, int R, int G, int B) {
    // Print Custom Color
    System.out.println("\u001B[2;" + R + ";" + G + ";" + B + "m" + text + "\u001B[0m");
  }

  /* ~~~~~~~~ NEWLINE ~~~~~~~~ */

  public static void Newline() {
    // Insert Newline
    System.out.println();
  }

  public static void Newline(int amount) {
    // Insert multiple Newlines
    String newline = "\n".repeat(amount);
    System.out.print(newline);
  }
}
