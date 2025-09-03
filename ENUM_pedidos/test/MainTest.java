package test;
import enums.*;
import clases.Order;

public class MainTest {
  public static void main(String[] args) {
    Order o1 = new Order("Ana", OrderStatus.NEW, OrderPriority.HIGH, PaymentMethod.CARD);
    Order o2 = new Order("Luis", OrderStatus.SHIPPED, OrderPriority.MEDIUM, PaymentMethod.CASH);
    Order o3 = new Order("Marta", OrderStatus.DELIVERED, OrderPriority.LOW, PaymentMethod.TRANSFER);
    o1.showDetails();
    o2.showDetails();
    o3.showDetails();
  }
}
