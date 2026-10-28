package com.uce;

public class TramiteTurnos {
	
	
	public static int contadorTurnos = 0;

    private String nombre;
    private String apellido;
    private String cedula;
    private String servicio;
    private int nTurno;
    private int nTurnoAsignado;


	public String ingresarDatos(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        return (nombre + apellido + cedula);
    }
    
    public String ingresarDatos(String nombre, String apellido, String cedula, String servi) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.servicio = servi;
        nTurno=nTurno +1;
        nTurnoAsignado=nTurno;
       return "Usuario ingresado correctamente";
    }
    
    public String generarServicio(String servi) {
        this.servicio = servi;
        nTurno=nTurno +1;
        nTurnoAsignado=nTurno;
       return servicio + nTurnoAsignado;
    }

    public void imprimirInfo() {
        System.out.println("--- DATOS DEL TURNO ---");
        System.out.println("Cliente: " + this.nombre + " " + this.apellido);
        System.out.println("Cédula: " + this.cedula);
        System.out.println("Servicio solicitado: " + this.servicio);
        System.out.println("Número de turno asignado: #" + this.nTurnoAsignado);
    }

    public int asignaCubiculo(int nDesocupado, String servicio) {
    	
    	System.out.println("Acerquese al cubiculo : " + nDesocupado + " al servicio " + servicio);
    	
    	return nDesocupado;
     
    }
    
   
}
