package com.andresmontoyalopez.dominioam;

public class Directo extends Empleado {
    private long salarioAndres;

    public Directo(String nombreAndres, long salarioAndres) {
        super(nombreAndres);
        this.salarioAndres = salarioAndres;
    }

    @Override
    public long calcularSalarioMontoya() {
        long salarioTotalAndres = 0;
        long aporteSaludAndres = calcularSaludMontoya();
        long aportePensionAndres = calcularPensionMontoya();
        salarioTotalAndres = salarioAndres - aporteSaludAndres - aportePensionAndres;
        return salarioTotalAndres;
    }

    public long calcularSaludMontoya(){
        return (long) (salarioAndres * 0.05);
    }

    public long calcularPensionMontoya(){
        return (long) (salarioAndres * 0.065);
    }

    public long getSalarioAndres() {
        return salarioAndres;
    }

    public void setSalarioAndres(long salarioAndres) {
        this.salarioAndres = salarioAndres;
    }


}
