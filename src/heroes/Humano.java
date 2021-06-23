package src.heroes;

import src.entes.Heroe;

public class Humano extends Heroe{

    public Humano(String nombre, int armadura) {
        super(nombre, armadura);
        super.vida = 180;
    }
    
    @Override
    public String DatosEnte() {
        return "Soy un Humano Mi ataque maximo es " + ataqueMaximo + ", Mi nombre es " + nombre + ", vida " + vida +" puntos armadura "+getArmadura();
    }

}
