package org.example;

import org.example.examenmovi.Jugador;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entradaPorTeclado = new Scanner(System.in);
        Jugador objetoJugador = new Jugador();

        System.out.print("****** Equipo de la seleccion********");
        System.out.print("**************************************");

        int variableDeControl=0;
        System.out.println(" Equipo de la seleccion:");

        System.out.print("1.Jugador:");
        System.out.print("2. Buscar jugador:");
        System.out.print("3. Editar jugador:");
        System.out.print("4. Todas las convocatorias:");
        System.out.print("5. Salir...");


    }
}