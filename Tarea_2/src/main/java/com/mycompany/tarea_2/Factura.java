package com.mycompany.tarea_2;

import java.util.ArrayList;

public class Factura {
    private int numero;
    private String fecha;
    private Cliente cliente;
    private ArrayList<Producto> productos = new ArrayList();
    Factura (int numero, String fecha, Cliente cliente, Producto agregarProducto) throws Exception{
        if (numero <= 0){
            throw new Exception("El numero no puede ser menor que 0");
        }
        if (fecha.isEmpty()){
            throw new Exception("La fecha no puede ser vacio");
        }
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        productos.add(agregarProducto);
    }
    
    void mostrar(){
        System.out.println("Numero de factura: " + numero);
        System.out.println("Fecha: " + fecha);
        System.out.println("Datos del cliente");
        cliente.mostrar();
        System.out.println("Lista de productos");
        for (int i = 0; i < productos.size(); i++){
            Producto info = productos.get(i);
            info.mostrar();
        }
    }
    
}
