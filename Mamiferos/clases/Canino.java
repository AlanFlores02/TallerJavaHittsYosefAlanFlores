package clases;

public abstract class Canino extends Mamifero {
  protected float tamanoColmillos;
  protected String color;

  public Canino(String nombreCientifico, String habitat, float altura, float largo, float peso, float tamanoColmillos, String color) {
    super(nombreCientifico, habitat, altura, largo, peso);
    this.tamanoColmillos = tamanoColmillos;
    this.color = color;
  }

  public float getTamanoColmillos() { return tamanoColmillos; }
  public String getColor() { return color; }
}
