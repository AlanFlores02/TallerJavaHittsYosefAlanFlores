package test;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import genericos.ServicioGenerico;
import entidades.*;
import clases.ArchivoFactura;

public class Facturacion {
  public static void main(String[] args) {
    ServicioGenerico<Cliente, String> clienteServicio = new ServicioGenerico<>();
    ServicioGenerico<Producto, Integer> productoServicio = new ServicioGenerico<>();
    ServicioGenerico<Factura, Integer> facturaServicio = new ServicioGenerico<>();
    //ServicioGenerico<Estudiante, Integer> estudianteServicio = new ServicioGenerico<>();

    // Clientes
    Cliente c1 = new Cliente("C001", "Prof Eloy Sánchez");
    Cliente c2 = new Cliente("C001", "Barack Obama Care");
    Cliente c3 = new Cliente("C002", "Yosef Alan Flores");
    // No se guarda c2 porque tiene ID duplicado
    clienteServicio.guardar(c1);
    clienteServicio.guardar(c2);
    clienteServicio.guardar(c3);

    // Productos
    Producto p1 = new Producto(100, "Laptop nVIDIA", 15000);
    Producto p2 = new Producto(200, "Mouse RBG Lights", 250);
    Producto p3 = new Producto(300, "Teclado Mecánico", 670.54);
    Producto p4 = new Producto(400, "Pantalla uLCD", 1670.50);
    productoServicio.guardar(p1);
    productoServicio.guardar(p2);
    productoServicio.guardar(p3);

    // Facturas
    List<Producto> nuevaLista = new ArrayList<>(Arrays.asList(p1, p2, p3));
    Factura f1 = new Factura(1, c1, Arrays.asList(p1, p2));
    Factura f2 = new Factura(2, c3, Arrays.asList(p1, p2, p3));
    facturaServicio.guardar(f1);
    facturaServicio.guardar(f2);

    // Buscar por ID
    System.out.println("Buscar cliente C002...");
    System.out.println(clienteServicio.buscarPorId("C002"));
    System.out.println("Buscar cliente C003...");
    System.out.println(clienteServicio.buscarPorId("C003"));

    // Actualizar cliente
    System.out.println("Actualizar cliente C002...");
    System.out.println(clienteServicio.actualizar("C002", new Cliente("C002", "Alan Flores")));
    
    // Actualizar cliente
    System.out.println("Eliminar cliente C003...");
    clienteServicio.eliminar("C003");

    System.out.println("Eliminar y añadir elementos de factura...");
    f2.eliminarProducto(300);
    f2.agregarElemento(p4);

    // Files
    ArchivoFactura.guardar(f1);
    ArchivoFactura.guardar(f2);
    ArchivoFactura.lista();
    ArchivoFactura.leer(1);
    ArchivoFactura.leer(2);
  }
}
