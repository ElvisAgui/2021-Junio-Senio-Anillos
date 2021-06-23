package src.Bestias;

import src.entes.Bestias;

public class Orcos extends Bestias {

    public Orcos(String nombre, int armadura) {
        super(nombre, armadura);
        super.vida = 300;
    }
    

    @Override
    public String DatosEnte() {
        return "Soy un Orco Mi ataque maximo es " + ataqueMaximo + " Mi nombre es" + nombre + " Mi vida es" + vida +" puntos armadura "+getArmadura() + " Y soy super Fuerte ";
    }
}
