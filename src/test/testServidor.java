package test;

import entidades.controller;

public class testServidor {

    public static void main(String[] args) {

        controller c = new controller();

        System.out.println(
                c.registrar("Juan -> INGRESO")
        );

        System.out.println(
                c.registrar("Juan -> SALIDA_ALMUERZO")
        );

        System.out.println(
                c.registrar("Juan -> ENTRADA_ALMUERZO")
        );

        System.out.println(
                c.registrar("Juan -> SALIDA")
        );
    }
}