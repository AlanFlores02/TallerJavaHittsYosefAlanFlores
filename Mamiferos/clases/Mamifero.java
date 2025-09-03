package clases;

public abstract class Mamifero {
  // ATRIBUTOS
  protected String nombreCientifico;
  protected String habitat;
  protected float altura;
  protected float largo;
  protected float peso;

  // CONSTRUCTOR
  public Mamifero(String nombreCientifico, String habitat, float altura, float largo, float peso) {
    this.nombreCientifico = nombreCientifico;
    this.habitat = habitat;
    this.altura = altura;
    this.largo = largo;
    this.peso = peso;
  }

  // GETTERS
  public String getNombreCientifico() { return nombreCientifico; }
  public String getHabitat() { return habitat; }
  public float getAltura() { return altura; }
  public float getLargo() { return largo; }
  public float getPeso() { return peso; }

  // METODOS
  public abstract String comer();
  public abstract String dormir();
  public abstract String correr();
  public abstract String comunicarse();
}
