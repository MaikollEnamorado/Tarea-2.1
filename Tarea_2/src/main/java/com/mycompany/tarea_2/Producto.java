package com.mycompany.tarea_2;

public class Producto {
    private String nombre;
    private double precio;
    private CategoriaProducto categoria;
    private int cantidad;
    private double total;
    Producto(String nombre, double precio, CategoriaProducto categoria,int cantidad)throws Exception{
        if (nombre.isEmpty()){
            throw new Exception("El nombre no puede ser vacio");
        }
        if (precio <= 0){
            throw new Exception("El precio no puede ser menor que 0");
        }
        if (cantidad <= 0){
            throw new Exception("La cantidad no puede ser menor que 0");
        }
        this.precio = precio;
        this.categoria = categoria;
        this.cantidad = cantidad;
        total = this.precio  * this.cantidad;
    }
    void mostrar(){
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio del producto: " + precio);
        System.out.println("Cantidad del producto: " + cantidad);
        System.out.println("total: " + total);
        System.out.println("Ubicacion del producto");
        categoria.mostrar();
    }
}
