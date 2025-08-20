package flujo;
import java.util.Scanner;
import tools.Console;

public class InicioSesion {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String username, password;

    Console.print("Ingrese el username: ", tools.Color.Blue);
    username = entrada.next();
    Console.print("Ingrese el password: ", tools.Color.Cyan);
    password = entrada.next();

    if (username.equals("AlanFlores02") && password.equals("java"))
      Console.print("Bienvenido", tools.Color.Green);
    else
      Console.print("Error: Wrong username or password!", tools.Color.Red);

    entrada.close();
  }
}
