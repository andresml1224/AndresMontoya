package com.andresmontoyalopez.dominioam;

import java.util.List;

public class Nomina {
    private List <Empleado> empleadosAndres;

    public Nomina(List<Empleado> empleadosAndres) {
        this.empleadosAndres = empleadosAndres;
    }

    public void calcularNominaMontoya() {
        System.out.println("Nombre | Salario | Tipo");
        listarDirectosMontoya();
        listarFreenlanceMontoya();
        listarPromotoresMontoya();
    }
    public void listarDirectosMontoya() {
        for (Empleado empleadoAndres : empleadosAndres) {
            if (empleadoAndres instanceof Directo) {
                System.out.println(empleadoAndres.getNombreAndres() + " | " + empleadoAndres.calcularSalarioMontoya() + " | " + (empleadoAndres instanceof Vendedor ? "Vendedor" : "Directo"));
            }
        }
    }


    public void listarFreenlanceMontoya() {
        for (Empleado empleadoFreelanceAndres : empleadosAndres) {
            if (empleadoFreelanceAndres instanceof Freelance) {
                System.out.println(empleadoFreelanceAndres.getNombreAndres() + " | " + empleadoFreelanceAndres.calcularSalarioMontoya() + " | " + "Freelance");
            }
        }
    }

    public void listarPromotoresMontoya() {
        for (Empleado empleadoPromotorAndres : empleadosAndres) {
            if (empleadoPromotorAndres instanceof Promotor) {
                System.out.println(empleadoPromotorAndres.getNombreAndres() + " | " + empleadoPromotorAndres.calcularSalarioMontoya() + " | " + "Promotor");
            }
        }
    }
}

