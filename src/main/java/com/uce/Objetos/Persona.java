package com.uce.Objetos;

public class Persona {

    private String nombre;
    public  String apellido;
    public int edad;
    public int dinero;


    public void setNombre(String nombre){
        System.out.println("Hola, mi nombre ahora es : " + nombre);
        this.nombre = nombre;
    }

    public void hablar(){
        System.out.println("Hola, mi nombre es : " + nombre);
    }

    public void decirEdad(){
        System.out.println("Tengo" + edad + "años");
    }




    
}
