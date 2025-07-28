package Logica;

public class Producto {
    private String nombre;
    private int precio;
    private String catergoria;
    private int stock;

    public Producto() {
    }

    public Producto(String nombre, String catergoria, int precio, int stock) {
        this.catergoria = catergoria;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCatergoria() {
        return catergoria;
    }

    public void setCatergoria(String catergoria) {
        this.catergoria = catergoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
