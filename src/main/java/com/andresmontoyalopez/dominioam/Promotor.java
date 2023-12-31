package com.andresmontoyalopez.dominioam;

public class Promotor extends Empleado {
    private int volantesRepartidosAndres;
    private long valorVolanteAndres;
    private int comprasVolanteAndres;

    public Promotor(String nombreAndres, int volantesRepartidosAndres, long valorVolanteAndres, int comprasVolanteAndres) {
        super(nombreAndres);
        this.volantesRepartidosAndres = volantesRepartidosAndres;
        this.valorVolanteAndres = valorVolanteAndres;
        this.comprasVolanteAndres = comprasVolanteAndres;
    }

    @Override
    public long calcularSalarioMontoya() {
        long pagoVolantesAndres = getVolantesRepartidosAndres() * getValorVolanteAndres();
        long pagoComprasAndres = 0;
        for (int i = 0; i < getComprasVolanteAndres(); i++) {
            pagoComprasAndres += 15000;
        }
        return pagoVolantesAndres + pagoComprasAndres;
    }

    public int getVolantesRepartidosAndres() {
        return volantesRepartidosAndres;
    }

    public long getValorVolanteAndres() {
        return valorVolanteAndres;
    }

    public int getComprasVolanteAndres() {
        return comprasVolanteAndres;
    }
}
