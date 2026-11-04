package com.uce;

public class CuentaBancaria {
	
	private static String nombreBanco = "Produbanco";
	private static int cuentasCreadas = 0;
	private String numeroCuenta;
	private String titular;
	private double saldo;
	
	
	public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
		this.numeroCuenta = numeroCuenta;
		
		if( titular.equals("")){
			this.titular = "Sin nombre";
		}else {
			this.titular = titular;
		}
		
		if(saldoInicial < 0) {
			System.out.println("Error... no se permiten saldos negativos");
			this.saldo=0;
		}else {
			this.saldo = saldoInicial;
		}
		
		cuentasCreadas = cuentasCreadas +1;
	}
	
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}


	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		if(!titular.equals("")) {
			this.titular = titular;
		}
	}

	public double getSaldo() {
		return saldo;
	}


	public void depositar(double monto) {
		if(monto > 0) {
			if(monto >= 500) {
				double bonificacion = monto*0.10;
				this.saldo = this.saldo + monto + bonificacion;
				System.out.println("Deposito " + monto + " con bonificacion");
				
			}else {
				this.saldo = this.saldo + monto;
				System.out.println("Deposito de " + monto );
			}
		}
	}
	
	public boolean retirar(double monto) {
		double comision = 1.0;
		double totalARetirar = monto + comision;
		
		if(this.saldo >= totalARetirar) {
			this.saldo = this.saldo - totalARetirar;
			System.out.println("Retiro de " + monto );
			return true;
			
		}else {
			System.out.println("Error... saldo insuficiente");
			return false;
		}
	}
	
	public static int getTotalCuentas() {
		return cuentasCreadas;
	}
	
	

}
