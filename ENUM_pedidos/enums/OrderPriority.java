package enums;

public enum OrderPriority {
  LOW(1),
  MEDIUM(2),
  HIGH(3);

  private final int prioridad;

  private OrderPriority(int prioridad) {
    this.prioridad = prioridad;
  }

  public int getPrioridad() {
    return prioridad;
  }
}
