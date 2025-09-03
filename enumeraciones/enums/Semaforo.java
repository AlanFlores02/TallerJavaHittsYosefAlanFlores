package enums;

public enum Semaforo {
  ROJO {
    @Override
    public String accion() {
      return "Detente";
    }
  },
  AMARILLO {
    @Override
    public String accion() {
      return "Precaucion";
    }
  },
  VERDE {
    @Override
    public String accion() {
      return "Avanzar";
    }
  };

  public abstract String accion();
}
