package Logica;

import java.util.ArrayList;
import java.util.Scanner;

public class Productos {
    Scanner sc = new Scanner(System.in);
    ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto() {
        System.out.println("==========================================\n" +
                "Ingrese la informacion de su producto: \n" +
                "==========================================\n");

        System.out.println("Nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.println("Categoria de producto: ");
        String categoria = sc.nextLine();
        System.out.println("Precio del producto: ");
        int precio = sc.nextInt();
        System.out.println("Stock del producto: ");
        int stock = sc.nextInt();

        Producto producto = new Producto(nombre, categoria, precio, stock);
        productos.add(producto);
        sc.nextLine();

        mostrarProductos();

    }

    public void mostrarProductos() {

        System.out.println("==========================================");

        if (productos.isEmpty()) {
            System.out.println("No hay productos en el almacen. ");
        } else {

            System.out.println("Lsita de productos: ");

            for (int i = 0; i < productos.size(); i++) {
                Producto producto = productos.get(i);
                System.out.println(" " + (i + 1) + "." + producto.getNombre());
            }
        }
    }

    public void informacionDetallada() {

        System.out.println("==========================================");

        System.out.println("Desea mostrar informacion mas detallada de los productos? (S/N): ");
        String opcion = sc.nextLine();

        switch (opcion) {
            case "S":
                for (int i = 0; i < productos.size(); i++) {
                    Producto producto = productos.get(i);
                    System.out.println((i + 1) + "." + producto.getNombre());
                    System.out.println(" Catergoria: " + producto.getCatergoria());
                    System.out.println(" Precio: $ " + producto.getPrecio() + " Pesos Mexicanos.");
                    System.out.println(" Stock: " + producto.getStock() + " Unidades.");
                }
                break;
            case "N":
                System.out.println("No se mostrará información. \n");
                break;
        }
    }

    public void ventaProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos disponibles. \n"
                    + "Ingrese un producto antes para poder realizar ventas.");
        } else {
            System.out.println("========================================== \n" +
                    "Ingrese el nombre del producto que desea vender: ");
            String busquedaProducto = sc.nextLine();

            for (int i = 0; i < productos.size(); i++) {
                Producto producto = productos.get(i);
            }
        }
    }

}
