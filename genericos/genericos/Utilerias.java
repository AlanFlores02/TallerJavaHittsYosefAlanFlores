package genericos;

public class Utilerias {
  public static <T extends Comparable> T maximo(T a, T b) {
    return (a > b) ? a : b;
  }
}
