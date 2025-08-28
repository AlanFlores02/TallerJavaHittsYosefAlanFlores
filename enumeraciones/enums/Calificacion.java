package enums;

public enum Calificacion {
  A("Excelente"),
  B("Notable"),
  C("Aprobado"),
  D("Suficiente"),
  E("Reprobado"),
  F("Reprobado");

  private final String descripcion;

  private Calificacion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getCalificacion() { return descripcion; }
}
