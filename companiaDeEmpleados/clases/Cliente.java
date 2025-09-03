package clases;

public class Cliente extends Persona {
  private int clienteId;
  private int contador;

  public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
    super(nombre, apellido, numeroFiscal, direccion);
    clienteId = ++contador;
  }

  public int getClienteId() { return clienteId; }

  @Override
  public String toString() {
    String text = super.toString();
    return "{Cliente Id: " + clienteId + ", " +
          text.substring(1, text.length());
  }
}
