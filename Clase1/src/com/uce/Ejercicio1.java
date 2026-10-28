package com.uce;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE TOMA DE TURNOS ===");

        TramiteTurnos turno1 = new TramiteTurnos();
        String serv = scanner.nextLine();

        System.out.print("Ingrese nombre: ");
        String nom = scanner.nextLine();

        System.out.print("Ingrese apellido: ");
        String ape = scanner.nextLine();

        System.out.print("Ingrese cédula: ");
        String ced = scanner.nextLine();

        turno1.ingresarDatos(nom, ape, ced, serv);
        turno1.ingresarDatos(nom, ape, ced);

        System.out.println("Servicios disponibles: Caja, Atencion al cliente, General");
        System.out.println("Ingrese el servicio que desea: ");
        

        turno1.generarServicio(serv);

        turno1.asignaCubiculo(1, "Caja");

        scanner.close();

	}

}
