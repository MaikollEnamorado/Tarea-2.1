package com.mycompany.tarea_2;
public class CategoriaProducto {
    private String nombre;
    private int pasillo;
    
    CategoriaProducto(String nombre, int pasillo){
        this.nombre = nombre;
        this.pasillo = pasillo;
    }
    void mostrar(){
        System.out.println("La categoria del producto es: " + nombre);
        System.out.println("Se encuentra en el pasillo: " + pasillo);
    }
}
