package com.andresmontoyalopez.dominioam;

public abstract class Empleado {
    private String nombreAndres;

    public Empleado(String nombreAndres) {
        this.nombreAndres = nombreAndres;
    }

    public abstract long calcularSalarioMontoya();

    public String getNombreAndres() {
        return nombreAndres;
    }
}
