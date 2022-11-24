package org.example;

import org.example.examenmovi.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entradaPorTeclado = new Scanner(System.in);
        int menuOpciones=5;
        ArrayList<Jugador> jugadores=new ArrayList<>();

do{

    System.out.println("****** Equipo de la seleccion********");
    System.out.println("**************************************");
    System.out.println("1. Jugador:");
    System.out.println("2. Buscar jugador:");
    System.out.println("3. Editar jugador:");
    System.out.println("4. Todas las convocatorias:");
    System.out.println("5. Salir...");

    System.out.println("Digita una opcion del menu:");
    menuOpciones=entradaPorTeclado.nextInt();

    switch (menuOpciones){
        case 1:
            if (jugadores.size()<23){
                Jugador objetoJugador=new Jugador();

            System.out.println("Numero de camiseta:");
            int numeroJugador=entradaPorTeclado.nextInt();
            objetoJugador.setNumeroCamiseta(numeroJugador);
        System.out.println("Digita el nombre del jugador:");
        objetoJugador.setNombre(entradaPorTeclado.next());
        System.out.println("Digita el  apellido del jugador:");
        objetoJugador.setApellidos(entradaPorTeclado.next());
        System.out.println("Posicion que ocupa:");
        objetoJugador.setPocisionJugador(entradaPorTeclado.next());
        System.out.println("Edad del jugador:");
        objetoJugador.setEdad(entradaPorTeclado.nextInt());
        System.out.println("Equipo donde juega:");
        objetoJugador.setEquipoDondeJuega(entradaPorTeclado.next());

        jugadores.add(objetoJugador);

    } else {
                System.out.println("La convocatoria ya esta completa:");
            }
        break;
        case 2:
            System.out.println("Digita el numero del jugador:");
            int buscarCamiseta=entradaPorTeclado.nextInt();

            for (Jugador jugador:jugadores){
                if (buscarCamiseta==jugador.getNumeroCamiseta()){
                    System.out.println("Numero del jugador: "+jugador.getNumeroCamiseta() );
                    System.out.println("Nombre del jugador: "+jugador.getNombre());
                    System.out.println("Apellido del jugador: "+jugador.getApellidos());
                    System.out.println("Edad del jugador: "+jugador.getEdad());
                    System.out.println("Posicion del jugador: "+jugador.getPocisionJugador());
                    System.out.println("Equipo donde juega: "+jugador.getEquipoDondeJuega());

                }else {
                    System.out.println("El jugador no a sido encontrado:");
                }
            }
            break;
        case 3:
            System.out.println("Numero de la camiseta del jugador que desea editar:");
            int editarJugador=entradaPorTeclado.nextInt();
            for(Jugador jugador:jugadores){
                do {
                    System.out.println("1. Editar numero de camiseta:");
                    System.out.println("2. Editar nombre del jugador:");
                    System.out.println("3. Editar apellido del jugador :");
                    System.out.println("4. Salir:");
                    editarJugador = entradaPorTeclado.nextInt();

                    switch (editarJugador) {
                        case 1:
                            int nuevoNumero;
                            System.out.println("Ingrese el nuevo numero:");
                            nuevoNumero = entradaPorTeclado.nextInt();
                            for (Jugador nuevoJugador : jugadores) {
                                if (nuevoJugador.getNumeroCamiseta() == nuevoNumero) {
                                    System.out.println("Numero no valido:");
                                } else {
                                    jugador.setNumeroCamiseta(nuevoNumero);
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese el nombre:");
                            jugador.setNombre(entradaPorTeclado.next());
                            break;
                        case 3:
                            System.out.println("Ingresa el apellido:");
                            jugador.setApellidos(entradaPorTeclado.next());
                            break;
                        default:
                    }
                }while (editarJugador!=4);
        }

            break;
        case 4:
            for (Jugador jugador:jugadores){
                System.out.println("Numero del jugador:"+jugador.getNumeroCamiseta() );
                System.out.println("Nombre del jugador:"+jugador.getNombre());
                System.out.println("Apellido del jugador:"+jugador.getApellidos());
                System.out.println("Edad del jugador:"+jugador.getEdad());
                System.out.println("Posicion del jugador"+jugador.getPocisionJugador());
                System.out.println("Equipo donde juega"+jugador.getEquipoDondeJuega());

            }

        default:

}

}while(menuOpciones!=5);


    }
}