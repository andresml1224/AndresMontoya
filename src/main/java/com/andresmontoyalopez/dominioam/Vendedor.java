package com.andresmontoyalopez.dominioam;

public class Vendedor extends Directo{

    private long ventasDelMesAndres;

    public Vendedor(String nombreAndres, long salarioAndres, long ventasDelMesAndres) {
        super(nombreAndres, salarioAndres);
        this.ventasDelMesAndres = ventasDelMesAndres;
    }
    public long calcularSalarioMontoya() {
        return super.calcularSalarioMontoya() + calcularComisionMontoya();
    }

    public long calcularComisionMontoya(){
        long salarioBaseAndres = getSalarioAndres();

        long comisionAndres = 0;
        if (salarioBaseAndres < 1000000) {
            comisionAndres = (long) (getVentasDelMesAndres() * 0.04);
        } else {
            comisionAndres = (long) (getVentasDelMesAndres() * 0.035);
        }
        return comisionAndres;
    }

    public long getVentasDelMesAndres() {
        return ventasDelMesAndres;
    }
}
