package clases;

public class Lobo extends Canino {
  private int numeroCamada;
  private String especieLobo;

  public Lobo(String nombreCientifico, String habitat, float altura, float largo, float peso, float tamanoColmillos, String color, int numeroCamada, String especieLobo) {
    super(nombreCientifico, habitat, altura, largo, peso, tamanoColmillos, color);
    this.numeroCamada = numeroCamada;
    this.especieLobo = especieLobo;
  }

  public int getNumeroCamada() { return numeroCamada; }
  public String getEspecieLobo() { return especieLobo; }

  @Override
  public String comer() {
    return "Un " + especieLobo + " del grupo #" + numeroCamada + " come para mantener su figura de " + peso + " kilogramos.";
  }
  @Override
  public String dormir() {
    return "Un " + especieLobo + " del grupo #" + numeroCamada + " duerme comodamente en " + habitat + ".";
  }
  @Override
  public String correr() {
    return "Un " + especieLobo + " del grupo #" + numeroCamada + " corre por " + habitat + ".";
  }
  @Override
  public String comunicarse() {
    return "Un " + especieLobo + " del grupo #" + numeroCamada + " presume su bello pelaje " + color + ".";
  }
}
