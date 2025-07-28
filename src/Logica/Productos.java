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

        Producto producto = new Producto(nombre,categoria,precio,stock);
        productos.add(producto);


        mostrarProductos();

    }

    public void mostrarProductos() {

        System.out.println("==========================================");

        if (productos.isEmpty()) {
            System.out.println("No hay productos en el almacen. ");
        }

        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            System.out.println("Producto " + (i + 1 ) + ":");
            System.out.println("Nombre del producto: " + producto.getNombre());
            System.out.println("Catergoria del producto: " + producto.getCatergoria());
            System.out.println("Precio del producto: " + producto.getPrecio());
            System.out.println("Stock del producto: " + producto.getStock());
        }
    }

}
