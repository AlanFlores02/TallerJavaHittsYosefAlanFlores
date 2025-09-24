package impl;
import java.util.Map;
import java.util.LinkedHashMap;

public class MapaLinkedHashMap {
  public static void main(String[] args) {
    Map<String, String> nombres = new LinkedHashMap<>();
    nombres.put("eloy", "Eloy Salmoran");
    nombres.put("alan", "Yosef Alan Flores López");
    nombres.put(null, "[REDACTED]");
    nombres.put("obama", "Barack Obama Care");
    nombres.put("jose", "José José el principe de la canción");
    nombres.put("null", null);
  }
}
