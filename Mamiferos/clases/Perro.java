package clases;

public class Perro extends Canino {
  private int fuerzaDeMordida;

  public Perro(String nombreCientifico, String habitat, float altura, float largo, float peso, float tamanoColmillos, String color, int fuerzaDeMordida) {
    super(nombreCientifico, habitat, altura, largo, peso, tamanoColmillos, color);
    this.fuerzaDeMordida = fuerzaDeMordida;
  }

  public int getFuerzaDeMordida() { return fuerzaDeMordida; }

  @Override
  public String comer() {
    return "El perro " + color + " tritura croquetas con una mordida de " + fuerzaDeMordida + " psi.";
  }
  @Override
  public String dormir() {
    return "El perro " + color + " duerme comodamente en " + habitat + ".";
  }
  @Override
  public String correr() {
    return "El perro" + color + " corre por " + habitat + ".";
  }
  @Override
  public String comunicarse() {
    return "El perro" + color + " se presenta como " + nombreCientifico + " para impresionar a sus amigos.";
  }
}
