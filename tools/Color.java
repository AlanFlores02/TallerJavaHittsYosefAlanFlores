package tools;

public enum Color {
  White(1),
  Black(30),
  Red(31),
  Green(32),
  Yellow(33),
  Blue(34),
  Purple(35),
  Cyan(36),
  Grey(37);

  private final int id;
  private Color(int id) {
    this.id = id;
  }
  public int getId() {
    return id;
  }
}