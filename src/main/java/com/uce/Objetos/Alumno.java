package com.uce.Objetos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor

public class Alumno {

    @Getter
    @Setter
    private int ci;
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private int edad;
    @Getter
    @Setter
    private int estatura;
    @Getter
    @Setter
    private int peso;

    public double estaturaEnMetros() {
        return estatura / 100.0;
    }

    public double pesoEnKg() {
        return peso * 0.454392;

    }

}
