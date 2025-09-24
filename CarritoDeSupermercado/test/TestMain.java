package test;
import java.util.List;
import java.util.ArrayList;
import clases.*;

public class TestMain {
  public static void main(String[] args) {
    System.out.println("\n\t======== LACTEOS ========");
    List<Lacteo> lacteos = new ArrayList<>();
    lacteos.add(new Lacteo("Leche LaLa", 225.50, 12, 120));
    lacteos.add(new Lacteo("Leche LaLa", 225.50, 12, 120));
    lacteos.add(new Lacteo("Leche LaLa", 225.50, 12, 120));
    lacteos.add(new Lacteo("Leche LaLa", 225.50, 12, 120));
    lacteos.add(new Lacteo("Leche LaLa", 225.50, 12, 120));

    System.out.println("\n\t======== FRUTAS ========");
    List<Fruta> frutas = new ArrayList<>();
    frutas.add(new Fruta("Manzana", 4.50, 200, "Rojo"));
    frutas.add(new Fruta("Naranja", 5.50, 150, "Naranja"));
    frutas.add(new Fruta("Pera", 6.50, 225, "Verde"));
    frutas.add(new Fruta("Mora Azul", 0.50, 10, "Azul"));
    frutas.add(new Fruta("Platano", 3.50, 125, "Amarillo"));

    System.out.println("\n\t======== LIMPIEZA ========");
    List<Limpieza> limpieza = new ArrayList<>();
    limpieza.add(new Limpieza("Shampoo", 99.50, "Jabón", 2));
    limpieza.add(new Limpieza("Condicionador", 99.50, "Jabón", 2));
    limpieza.add(new Limpieza("Jabón de manos", 99.50, "Jabón", 2));
    limpieza.add(new Limpieza("Desinfectante", 99.50, "Alcohol", 2));
    limpieza.add(new Limpieza("Jabón lava trastes", 99.50, "Jabón", 2));

    System.out.println("\n\t======== NO PERECIBLES ========");
    List<NoPerecible> noPerecibles = new ArrayList<>();
    noPerecibles.add(new NoPerecible("Atun enlatado", 25, 225, 120));
    noPerecibles.add(new NoPerecible("Atun enlatado", 25, 225, 120));
    noPerecibles.add(new NoPerecible("Atun enlatado", 25, 225, 120));
    noPerecibles.add(new NoPerecible("Atun enlatado", 25, 225, 120));
    noPerecibles.add(new NoPerecible("Atun enlatado", 25, 225, 120));
  }
}
