package clases;

public class Automovil {
  private String marca = "Toyota";
  private String color;
  private int year;

  public Automovil() {}
	public Automovil(String marca, String color, int year) {
		super();
		this.marca = marca;
		this.color = color;
		this.year  = year;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}