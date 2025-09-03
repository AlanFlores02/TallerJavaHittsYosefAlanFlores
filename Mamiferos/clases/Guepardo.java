package clases;

public class Guepardo extends Felino {
  public Guepardo(String nombreCientifico, String habitat, float altura, float largo, float peso, float tamanoGarras, int velocidad) {
    super(nombreCientifico, habitat, altura, largo, peso, tamanoGarras, velocidad);
  }

  @Override
  public String comer() {
    return "El guepardo come para mantener su figura de " + peso + " kilogramos.";
  }
  @Override
  public String dormir() {
    return "El guepardo duerme comodamente en " + habitat + ".";
  }
  @Override
  public String correr() {
    return "El guepardo corre a " + velocidad + " metros por segundo.";
  }
  @Override
  public String comunicarse() {
    return "El guepardo se presenta como " + nombreCientifico + ".";
  }
}