package src.Bestias;

import src.entes.Bestias;

public class Trasgos extends Bestias {

    public Trasgos(String nombre, int armadura) {
        super(nombre, armadura);
        super.vida = 325;
    }

    @Override
    public String DatosEnte() {
        return "Soy un Trasgo " + ataqueMaximo + ", nombre=" + nombre + ", vida=" + vida + "Y los Hobits me temen";
    }
    
}
