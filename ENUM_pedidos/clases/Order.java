package clases;
import enums.*;

public class Order {
  private int id;
  private String customer;
  private OrderStatus status;
  private OrderPriority priority;
  private PaymentMethod paymentMethod;

  private static int contador;

  public Order(String customer, OrderStatus status, OrderPriority priority, PaymentMethod paymentMethod) {
    this.id = ++contador;
    this.customer = customer;
    this.status = status;
    this.priority = priority;
    this.paymentMethod = paymentMethod;
  }

  public void showDetails() {
    System.out.println("Pedido #" + id);
    System.out.println("Cliente: " + customer);
    System.out.println("Estado: " + status.name() + " --> " + status.getMensaje());
    System.out.println("Prioridad: " + priority.name() + " (Nivel " + priority.getPrioridad() + ")");
    System.out.println("Método de pago: " + paymentMethod.name() + " --> " + paymentMethod.getDescripcion());
    System.out.println();
  }
}
