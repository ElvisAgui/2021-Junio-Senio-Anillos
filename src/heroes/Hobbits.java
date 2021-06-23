package src.heroes;

import src.Bestias.Trasgos;
import src.entes.Ente;
import src.entes.Heroe;

public class Hobbits extends Heroe {

    public Hobbits(String nombre, int armadura) {
        super(nombre, armadura);
        super.vida = 200;
    }

    public int aumentoAtaque(Ente enemigo){
        if (enemigo instanceof Trasgos) {
            System.out.println("Rayos un Trasgo, ----Disminuye mi ataque...!"); 
            return getAtaque()-5; 
        }
        return getAtaque();
    }

    @Override
    public String DatosEnte() {
        return "Soy un Hobbit " + ataqueMaximo + ", nombre=" + nombre + ", vida=" + vida + " y Temo a los Trasgos";
    }
    
   
    
}
