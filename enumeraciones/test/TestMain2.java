package test;
import java.util.Enumeration;

import enums.Semaforo;

public class TestMain2 {
  public static void main(String[] args) {
    for (Semaforo color : Semaforo.values()) {
      System.out.println(color.name() + " ==> " + color.accion());
    }
  }
}
