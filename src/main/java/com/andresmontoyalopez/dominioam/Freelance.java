package com.andresmontoyalopez.dominioam;

public class Freelance extends Empleado{
    private long valorHoraAndres;
    private long horasTrabajadasAndres;
    public Freelance(String nombreAndres, long valorHoraAndres, long horasTrabajadasAndres) {
        super(nombreAndres);
        this.valorHoraAndres = valorHoraAndres;
        this.horasTrabajadasAndres = horasTrabajadasAndres;
    }
    public long calcularSalarioMontoya() {
        return horasTrabajadasAndres * valorHoraAndres;
    }
}
