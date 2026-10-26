package ini;

import java.util.Scanner;

public class Tramites_de_turnos {
	public static int contadorTurnos = 0;

    private String nombre;
    private String apellido;
    private String cedula;
    private String servicio;
    private int turnoAsignado;

    public Tramites_de_turnos() {
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
            cubiculo = 3; // Cubículo general para otros trámites
        }

        System.out.println("Cubículo asignado: Módulo " + cubiculo);
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE TOMA DE TURNOS ===");

        Tramites_de_turnos turno1 = new Tramites_de_turnos();

        System.out.print("Ingrese nombre: ");
        String nom = scanner.nextLine();

        System.out.print("Ingrese apellido: ");
        String ape = scanner.nextLine();

        System.out.print("Ingrese cédula: ");
        String ced = scanner.nextLine();

        turno1.ingresarDatos(nom, ape, ced);

        System.out.println("Servicios disponibles: Caja, Atencion al cliente, General");
        System.out.println("Ingrese el servicio que desea: ");
        String serv = scanner.nextLine();

        turno1.generarServicio(serv);

        turno1.asignaCubiculo();

        scanner.close();
    }
}
