package test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import clases.*;

public class TestMain {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    List<CuentaBancaria> cuentas = new ArrayList<>();
    List<Transaccion> transacciones = new ArrayList<>();

    boolean active = true;
    while (active) {
      System.out.println("\n\t ======== MENU ========");
      System.out.println("0. Salir");
      System.out.println("1. Crear nueva cuenta bancaria");
      System.out.println("2. Realizar un deposito");
      System.out.println("3. Realizar un retiro");
      System.out.println("4. Lista de cuentas bancarias");
      System.out.println("5. Lista de transacciones");

      int accion = entrada.nextInt();
      entrada.nextLine();
      switch (accion) {
        case 0 -> {
          active = false;
        }
        case 1 -> {
          System.out.println("\n\t==== NUEVA CUENTA ====");
          System.out.print("Nombre del titular: ");
          String nombre = entrada.nextLine();
          System.out.print("Deposito inicial: ");
          double saldo = entrada.nextDouble();
          cuentas.add(new CuentaBancaria(nombre, saldo));
        }
        case 2 -> {
          System.out.println("\n\t======== DEPOSITO ========");
          System.out.print("Id de la cuenta bancaria: ");
          int id = entrada.nextInt();
          System.out.print("Monto a depositar: ");
          double monto = entrada.nextDouble();
          transacciones.add(new Transaccion("DEPOSITO", monto, cuentas.get(id-1)));
        }
        case 3 -> {
          System.out.println("\n\t======== RETIRO ========");
          System.out.print("Id de la cuenta bancaria: ");
          int id = entrada.nextInt();
          System.out.print("Monto a retirar: ");
          double monto = entrada.nextDouble();
          transacciones.add(new Transaccion("RETIRO", monto, cuentas.get(id-1)));
        }
        case 4 -> {
          System.out.println("\n\t======== CUENTAS ========");
          for (CuentaBancaria cuenta : cuentas) {
            System.out.println(cuenta.toString());
          }
        }
        case 5 -> {
          System.out.println("\n\t======== TRANSACCIONES ========");
          for (Transaccion transaccion : transacciones) {
            System.out.println(transaccion.toString());
          }
        }
      }
    }
    entrada.close();
  }
}
