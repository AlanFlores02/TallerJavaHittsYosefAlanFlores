package impl;
import interfaces.Logger;

public class LoggerConsola implements Logger {
  @Override
  public void log(String mensaje) {
    System.out.println(mensaje);
  }
}
