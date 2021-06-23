package src.juego;

import src.entes.*;
import src.heroes.*;
import src.Bestias.*;

public class Juego {
    private String heroes[] = { "Zalasar, Rancio, Floky, Armont,Dont" };
    private String bestias[] = { "Rick, Mataz, Star, Dinamot,Donald" };
    private int random = 0;
    private final int numEjercitoHeroes = 5;
    private final int numEjercitoBestias = 5;
    private int iteraciones = 0;
    private Bestias ejercitoBestias[] = new Bestias[numEjercitoBestias];
    private Heroe ejercitoHeroes[] = new Heroe[numEjercitoHeroes];;

    public Juego() {
        

    }

    public void partida(){
        System.out.println("----Turno No." );
    }


    public void turno(){
        if (vueltas(ejercitoBestias) == vueltas(ejercitoHeroes) ) {
            
        }
        for (int i = 0; i < bestias.length; i++) {
            
        }

    }


    public int vueltas(Ente[] competidores){
        int vivos = 0 ;
        for (int i = 0; i < competidores.length; i++) {
            if (competidores[i] != null) {
                vivos++;
            }
        }
        return vivos;
    }

    public void iniciarHeores() {
        System.out.println("Ejercito que de Heroes Que luchara esta Partida");
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = Ente.tirarDado(2, 1);
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

    }

    public void iniciarBestias() {
        System.out.println("Ejercito que de Bestias Que luchara esta Partida");
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = Ente.tirarDado(1, 1);
            switch (random) {
                case 0:
                    ejercitoBestias[i] = new Orcos(bestias[i], armadura());
                    break;
                case 1:
                    ejercitoBestias[i] = new Trasgos(bestias[i], armadura());
                    break;
            }
        }
    }

    public int armadura() {
        int valor = Ente.tirarDado(20, 1) + 50;
        return valor;
    }

}
