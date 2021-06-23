package src.principal;

import src.juego.Juego;

public class Principal {

    
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n******Bienvenido al Juego de Señor de Los anillos*******\n\n");
        Principal anillos = new Principal();
    }
    private Juego jueg;
    public Principal(){
        jueg = new Juego();
        jueg.partida();;
    }

   
}
