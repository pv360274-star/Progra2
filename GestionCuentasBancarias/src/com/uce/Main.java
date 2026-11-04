package com.uce;

public class Main {

	public static void main(String[] args) {
	
		CuentaBancaria cuenta = new CuentaBancaria("123456789", "Juan", 100);
		CuentaBancaria cuenta2 = new CuentaBancaria("987654321", "Pedro",500);
		
		System.out.println("------- Transacciones cuenta 1 --------");
		cuenta.depositar(100);
		cuenta.retirar(300);
		
		System.out.println("------- Transacciones cuenta 2 --------");
		cuenta2.depositar(500);
		cuenta2.retirar(100);
		
		System.out.println("------- Estado de las cuentas --------");
		System.out.println("Titular: " + cuenta.getTitular() + " Saldo actual " + cuenta.getSaldo());
		System.out.println("Titular: " + cuenta2.getTitular() + " Saldo actual " + cuenta2.getSaldo() );
		
		System.out.println("------- Reporte global --------");
		System.out.println("Total de cuentas creadas en el sistema " + CuentaBancaria.getTotalCuentas());


	
		
		
		

	}

}
