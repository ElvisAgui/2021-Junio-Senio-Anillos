package src.heroes;

import src.Bestias.Orcos;
import src.entes.Ente;
import src.entes.Heroe;

public class Elfo extends Heroe {



    public Elfo(String nombre, int armadura) {
        super(nombre, armadura);
        super.vida = 250;
        
    }

    @Override
    public int aumentoAtaque(Ente enemigo){
        if (enemigo instanceof Orcos) {
            System.out.println("Rayos un Orco, ----Aumentando mi ataque...!"); 
            return getAtaque()+10; 
        }
        return getAtaque();
    }

    @Override
    public String DatosEnte() {
        return "Soy un Elfo " + ataqueMaximo + ", nombre=" + nombre + ", vida=" + vida + " y odio a los Orcos";
    }
    
}
