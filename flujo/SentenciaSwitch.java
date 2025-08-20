package flujo;

public class SentenciaSwitch {
  public static void main(String[] args) {
    MultipleCases(5);
  }

  static void ArrowSwitch(int numero) {
    switch (numero) {
      case 1 -> System.out.println("Dia lunes");
      case 2 -> System.out.println("Dia martes");
      case 3 -> System.out.println("Dia miercoles");
      case 4 -> System.out.println("Dia jueves");
      case 5 -> System.out.println("Dia viernes");
      case 6 -> System.out.println("Dia sabado");
      case 7 -> System.out.println("Dia domingo");
      default -> System.out.println("Error: Numero no valido");
    }
  }

  static void MultipleCases(int numero) {
    switch (numero) {
      // Se usan -> {} cuando hay mas de una linea
      case 1, 2, 3, 4, 5 -> {
        System.out.println("Dia laboral");
        System.out.println("Que triste :(");
      }
      case 6, 7 -> System.out.println("Fin de semana");
      default -> System.out.println("Error: Numero no valido");
    }
  }

  static void SwitchResultado() {
    int a = 10, b = 5;
    char operador = '/';
    int resultado = switch(operador) {
      case '+' -> a+b;
      case '-' -> a-b;
      case '*' -> a*b;
      case '/' -> a/b;
      default -> 0;
    };
    System.out.println(resultado);
  }
}
