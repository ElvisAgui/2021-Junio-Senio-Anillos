package src.juego;

import src.entes.*;
import src.heroes.*;

import java.util.Scanner;

import src.Bestias.*;

public class Juego {
    private Scanner entrada = new Scanner(System.in);
    private String heroes[] = { "Zalasar", "Rancio", "Floky", "Armont", "Dont" };
    private String bestias[] = { "Rick", "Mataz", "Star", "Dinamot", "Donald" };
    private int random = 0;
    private final int numEjercitoHeroes = 5;
    private final int numEjercitoBestias = 5;
    private int iteraciones = 0;
    private Bestias ejercitoBestias[] = new Bestias[numEjercitoBestias];
    private Heroe ejercitoHeroes[] = new Heroe[numEjercitoHeroes];;

    public Juego() {
        iniciarHeores();
        iniciarBestias();

    }

    public void partida() {
        int turno = 1;
        int op;
        do {
            System.out.println("\n\n----Turno No. " + turno+"----------\n");
            turno();
            turno++; 
            System.out.println("\n Digite 1 para el siguiente turno");
            op = entrada.nextInt();  
        } while (ganador() && op == 1);
        

    }

    public void turno() {
        correrPersonajes(ejercitoHeroes);
        correrPersonajes(ejercitoBestias);

        if (vueltas(ejercitoBestias) <= vueltas(ejercitoHeroes)) {
            iteraciones = vueltas(ejercitoBestias);

        } else {
            iteraciones = vueltas(ejercitoHeroes);
        }
        if (iteraciones <= 0) {
            System.out.println("----Fin de las Batallas----");
        }else{
            for (int i = 0; i < iteraciones; i++) {
                ejercitoBestias[i].ataqueEnemigo(ejercitoHeroes[i]);
                if (ejercitoHeroes[i].getVida() <= 0 ) {
                    ejercitoHeroes[i] = null;
                    System.out.println("Heroe Derrotado....JAJAJAJA");
                }else{
                    ejercitoHeroes[i].ataqueEnemigo(ejercitoBestias[i]);
                }
                if (ejercitoBestias[i].getVida() <= 0) {
                    ejercitoBestias[i] = null;
                    System.out.println("Bien, Bestia Eliminada");
                    
                }
                
            }
        }
        

    }

    public void correrPersonajes(Ente[] personaje) {
        Ente aux;
        for (int i = 0; i < personaje.length - 1; i++) {
            for (int j = 0; j < personaje.length - 1; j++) {
                if (personaje[j] == null && personaje[j + 1] != null) {
                    aux = personaje[j];
                    personaje[j]=personaje[j+1];
                    personaje[j+1]= aux;
                }
            }
        }
    }

    public int vueltas(Ente[] competidores) {
        int vivos = 0;
        for (int i = 0; i < competidores.length; i++) {
            if (competidores[i] != null) {
                vivos++;
            }
        }
        return vivos;
    }

    public void iniciarHeores() {
        System.out.println("\n\nEjercito que de Heroes Que luchara esta Partida\n\n");
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = Ente.tirarDado(3, 1);
            switch (random) {
                case 0:
                    ejercitoHeroes[i] = new Elfo(heroes[i], armadura());
                    System.out.println(ejercitoHeroes[i].DatosEnte());
                    break;
                case 1:
                    ejercitoHeroes[i] = new Hobbits(heroes[i], armadura());
                    System.out.println(ejercitoHeroes[i].DatosEnte());
                    break;
                case 2:
                    ejercitoHeroes[i] = new Humano(heroes[i], armadura());
                    System.out.println(ejercitoHeroes[i].DatosEnte());
                    break;
            }
        }
        System.out.println("____________________________________________________________");

    }
    public boolean ganador(){
        boolean ganador = true;
        if(ejercitoHeroes[0] == null){
            ganador = false;
            System.out.println("\n\n-----------Fin de la batalla---------\n\n");
            System.out.println("----------------------------------------------");
            System.out.println("El Ejerito de Bestias ha Ganado esta Partida");
            System.out.println("----------------------------------------------");
        }
        if (ejercitoBestias[0] == null) {
            ganador = false;
            System.out.println("\n\n-----------Fin de la batalla---------\n\n");
            System.out.println("----------------------------------------------");
            System.out.println("El Ejerito de Heroes ha Ganado esta Partida");
            System.out.println("----------------------------------------------");


        }
        return ganador;

    }

    public void iniciarBestias() {
        System.out.println("\n\nEjercito que de Bestias Que luchara esta Partida\n\n");
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = Ente.tirarDado(2, 1);
            switch (random) {
                case 0:
                    ejercitoBestias[i] = new Orcos(bestias[i], armadura());
                    System.out.println(ejercitoBestias[i].DatosEnte());
                    break;
                case 1:
                    ejercitoBestias[i] = new Trasgos(bestias[i], armadura());
                    System.out.println(ejercitoBestias[i].DatosEnte());
                    break;
            }
        }
        System.out.println("_________________________________________________________");
    }

    public int armadura() {
        int valor = Ente.tirarDado(20, 1) + 50;
        return valor;
    }

}
