package com.uce.Funciones;

public class CalculadoraIMC {
    
    public double calcularIMC(int peso, int estatura) {
        double estatura1 = estatura / 100.0;

        double peso1 = peso * 0.454392;

        double imc = peso1 / (estatura1 * estatura1);
        return imc;
    }


    public int calcularIMC(double peso, double estatura) {

        int imc = (int) (peso / (estatura * estatura));
        return imc;
    }
}
