package com.mycompany.tarea_2;

import javax.swing.JOptionPane;

public class Tarea_2 {

    public static void main(String[] args) {
        
        try{
            Cliente cliente = new Cliente("Jose","1201199800234","Col. Las brisas","95678932");
            CategoriaProducto categoria = new CategoriaProducto("bebidas", 1);
            Producto producto = new Producto("Cafe", 6, categoria, 4);
            agregarProducto(producto);
            Factura factura = new Factura(0001,"12/07/24",cliente, producto);
            factura.mostrar();
        }catch (Exception error){
            JOptionPane.showMessageDialog(null, error.getMessage());
            System.out.println(error.getMessage());
        }
    }
    public static Producto agregarProducto(Producto producto){
        return producto;
    }
    
}
