package Logica;

import java.util.Scanner;

public class Menus {
    Scanner sc = new Scanner(System.in);

    Productos produ = new Productos();

    public void menuPrincipal() {
        System.out.println(
                "==========================================\n" +
                        "Selecciona la opcion que desea realizar: \n" +
                        " 1. Agregar producto. \n" +
                        " 2. Listar productos. \n" +
                        " 3. Vender producto. \n" +
                        " 4. Reponer producto. \n" +
                        " 5. Mostrar productos con bajo stock. \n" +
                        " 6. Mostrar valor total del inventario. \n" +
                        " 7. Salir. \n" +
                        "==========================================\n"
        );

        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Agregando producto... ");
                produ.agregarProducto();
                break;
            case 2:
                System.out.println("Listando productos... ");
                produ.mostrarProductos();
                produ.informacionDetallada();
                break;
            case 3:
                System.out.println("Seleccionando productos para venta ... ");
                produ.ventaProductos();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }

    }
}