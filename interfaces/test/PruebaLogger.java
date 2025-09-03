package test;
import impl.LoggerConsola; 
import interfaces.Logger;

public class PruebaLogger {
  public static void main(String[] args) {
    Logger logger = new LoggerConsola();
    logger.info("");
    logger.error("");
    logger.log("");
  }
}
