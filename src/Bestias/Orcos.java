package src.Bestias;

import src.entes.Bestias;

public class Orcos extends Bestias {

    public Orcos(String nombre, int armadura) {
        super(nombre, armadura);
        super.vida = 300;
    }
    

    @Override
    public String DatosEnte() {
        return "Soy un Orco " + ataqueMaximo + ", nombre=" + nombre + ", vida=" + vida + " Y soy super Fuerte ";
    }
}
