package enums;

public enum OrderStatus {
  NEW("Pedido creado"),
  PROCESSING("Pedido en proceso"),
  SHIPPED("Pedido enviado"),
  DELIVERED("Pedido entregado"),
  CANCELLED("Pedido cancelado");

  private final String mensaje;

  private OrderStatus(String mensaje) {
    this.mensaje = mensaje;
  }

  public String getMensaje() {
    return mensaje;
  }
}
