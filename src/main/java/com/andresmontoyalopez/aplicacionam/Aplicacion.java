package com.andresmontoyalopez.aplicacionam;

import com.andresmontoyalopez.dominioam.*;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {
    public static void main(String[] args) {
        List <Empleado> empleadosAndres = new ArrayList<>();
        Directo empleadoAndres1 = new Directo("Juan",4840000);
        Vendedor empleadoAndres2 = new Vendedor("Julian",2050000,45510000);
        Freelance empleadoAndres3 = new Freelance("Johanna",71000,89);
        Vendedor empleadoAndres4 = new Vendedor("Carolina",980000,35989000);
        Promotor empleadoAndres5 = new Promotor("Pedro",1200,300, 62);
        Directo empleadoAndres6 = new Directo("David", 3975000);
        Freelance empleadoAndres7 = new Freelance("Gustavo", 42500,65);


        empleadosAndres.add(empleadoAndres1);
        empleadosAndres.add(empleadoAndres2);
        empleadosAndres.add(empleadoAndres3);
        empleadosAndres.add(empleadoAndres4);
        empleadosAndres.add(empleadoAndres5);
        empleadosAndres.add(empleadoAndres6);
        empleadosAndres.add(empleadoAndres7);

        Nomina nominaAndres = new Nomina(empleadosAndres);

        nominaAndres.calcularNominaMontoya();
    }
}
