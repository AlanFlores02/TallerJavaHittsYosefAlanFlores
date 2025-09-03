package clases;

public class Tigre extends Felino {
  private String especieTigre;

  public Tigre(String nombreCientifico, String habitat, float altura, float largo, float peso, float tamanoGarras, int velocidad, String especieTigre) {
    super(nombreCientifico, habitat, altura, largo, peso, tamanoGarras, velocidad);
    this.especieTigre = especieTigre;
  }

  public String getEspecieTigre() { return especieTigre; }

  @Override
  public String comer() {
    return "El " + especieTigre + " come para mantener su figura de " + peso + " kilogramos.";
  }
  @Override
  public String dormir() {
    return "El " + especieTigre + " duerme comodamente en " + habitat + ".";
  }
  @Override
  public String correr() {
    return "El " + especieTigre + " corre a " + velocidad + " metros por segundo.";
  }
  @Override
  public String comunicarse() {
    return "El " + especieTigre + " se comunica con los demás " + especieTigre + "s.";
  }
}