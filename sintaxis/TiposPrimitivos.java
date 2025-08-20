package sintaxis;

public class TiposPrimitivos {
  public static void main(String[] args) {
    /* NUMEROS */
    byte exByte = 0;
               printH2("Numero Real Byte:         " + exByte);
    System.out.println("Valor minimo del byte:    " + Byte.MIN_VALUE);
    System.out.println("Valor minimo del byte:    " + Byte.MAX_VALUE);

    short exShort = 0;
               printH2("Numero Real Short:        " + exShort);
    System.out.println("Valor minimo del short:   " + Short.MIN_VALUE);
    System.out.println("Valor minimo del short:   " + Short.MAX_VALUE);

    int exInt = 0;
               printH2("Numero Real Int:          " + exInt);
    System.out.println("Valor minimo del int:     " + Integer.MIN_VALUE);
    System.out.println("Valor minimo del int:     " + Integer.MAX_VALUE);

    long exLong = 0;
               printH2("Numero Real Long:         " + exLong);
    System.out.println("Valor minimo del long:    " + Long.MIN_VALUE);
    System.out.println("Valor minimo del long:    " + Long.MAX_VALUE);

    float exFloat = 3.45e-3f;
               printH2("Numero Real Float:        " + exFloat);
    System.out.println("Valor minimo del float:   " + Float.MIN_VALUE);
    System.out.println("Valor minimo del float:   " + Float.MAX_VALUE);

    double exDouble = 12.43e-3;
               printH2("Numero Real Double:       " + exDouble);
    System.out.println("Valor minimo del double:  " + Double.MIN_VALUE);
    System.out.println("Valor minimo del double:  " + Double.MAX_VALUE);

    /* TEXTO */
    
  }

  static void printH2(String text) {
    System.out.println("\n\u001B[35m" + text + "\u001B[0m");
  }
}