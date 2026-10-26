package com.uce;

public class TramiteTurnos {
	
	public static int contadorTurnos = 0;

    private String nombre;
    private String apellido;
    private String cedula;
    private String servicio;
    private int turnoAsignado;

    public TramiteTurnos() {
    }
    public void ingresarDatos(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public void generarServicio(String servicio) {
        this.servicio = servicio;
        
        contadorTurnos++;
        this.turnoAsignado = contadorTurnos;
    }

    public void imprimirInfo() {
        System.out.println("--- DATOS DEL TURNO ---");
        System.out.println("Cliente: " + this.nombre + " " + this.apellido);
        System.out.println("Cédula: " + this.cedula);
        System.out.println("Servicio solicitado: " + this.servicio);
        System.out.println("Número de turno asignado: #" + this.turnoAsignado);
    }

    public void asignaCubiculo() {
     
        imprimirInfo();

        int cubiculo;
        if (this.servicio.equalsIgnoreCase("Caja") || this.servicio.equalsIgnoreCase("Pagos")) {
            cubiculo = 1;
        } else if (this.servicio.equalsIgnoreCase("Atencion al cliente")) {
            cubiculo = 2;
        } else {
            cubiculo = 3; 
        }

        System.out.println("Cubículo asignado: Módulo " + cubiculo);
        System.out.println("----------------------------------------");

}
}
