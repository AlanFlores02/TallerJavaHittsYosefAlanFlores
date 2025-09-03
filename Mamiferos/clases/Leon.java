package clases;

public class Leon extends Felino {
  private int numeroManada;
  private float potenciaDeRugido;

  public Leon(String nombreCientifico, String habitat, float altura, float largo, float peso, float tamanoGarras, int velocidad, float potenciaDeRugido, int numeroManada) {
    super(nombreCientifico, habitat, altura, largo, peso, tamanoGarras, velocidad);
    this.potenciaDeRugido = potenciaDeRugido;
    this.numeroManada = numeroManada;
  }

  public int getNumeroManada() { return numeroManada; }
  public float getPotenciaDeRugido() { return potenciaDeRugido; }

  @Override
  public String comer() {
    return "Un leon del grupo #" + numeroManada + " come para mantener su figura de " + peso + " kilogramos.";
  }
  @Override
  public String dormir() {
    return "Un leon del grupo #" + numeroManada + " duerme comodamente en " + habitat + ".";
  }
  @Override
  public String correr() {
    return "Un leon del grupo #" + numeroManada + " corre a " + velocidad + " metros por segundo.";
  }
  @Override
  public String comunicarse() {
    return "Un leon del grupo #" + numeroManada + " ruge a " + potenciaDeRugido + " decibeles.";
  }
}
