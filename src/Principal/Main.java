package Principal;

import Logica.Menus;

public class Main {
    public static void main(String[] args) {
        Menus menu = new Menus();

        System.out.println("Bienvenido al sistema de gestion de productos. \n");

        while (true) {
            menu.menuPrincipal();
        }

    }
}
