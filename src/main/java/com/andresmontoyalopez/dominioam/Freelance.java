package com.andresmontoyalopez.dominioam;

public class Freelance extends Empleado{
    private long valorHoraAndres;
    private long horasTrabajadasAndres;
    public Freelance(String nombreAndres, long valorHoraAndres, long horasTrabajadasAndres) {
        super(nombreAndres);
        this.valorHoraAndres = valorHoraAndres;
        this.horasTrabajadasAndres = horasTrabajadasAndres;
    }

    @Override
    public long calcularSalarioMontoya() {
        return getHorasTrabajadasAndres() * getValorHoraAndres();
    }

    public long getValorHoraAndres() {
        return valorHoraAndres;
    }

    public long getHorasTrabajadasAndres() {
        return horasTrabajadasAndres;
    }
}
