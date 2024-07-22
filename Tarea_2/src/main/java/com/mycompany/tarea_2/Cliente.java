package com.mycompany.tarea_2;

public class Cliente {
    private String nombre;
    private String rtn;
    private String direccion;
    private String telefono;
    
    Cliente(String nombre, String rtn, String direccion, String telefono) throws Exception{
        if (nombre.isEmpty()){
            throw new Exception("El nombre no puede ser vacio");
        }
        if (rtn.isEmpty()){
            throw new Exception("El rtn no puede ser vacio");
        }
        if (direccion.isEmpty()){
            throw new Exception("La direccion no puede ser vacio");
        }
        if (telefono.isEmpty()){
            throw new Exception("El telefono no puede ser vacio");
        }
        this.nombre = nombre;
        this.rtn = rtn;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    void mostrar(){
        
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("RTN del cliente: " + rtn);
        System.out.println("Direccion del cliente: " + direccion);
        System.out.println("Numero de telefono del cliente: " + telefono);
    }
}
