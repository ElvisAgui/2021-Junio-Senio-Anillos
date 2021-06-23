package src.entes;

public class Bestias extends Ente{

    public Bestias(String nombre, int armadura) {
        super(nombre, armadura);
        super.cantDados=1;
        super.ataqueMaximo = 90;
    }

    @Override
    public int getAtaque(){
        return super.ataque = Ente.tirarDado(this.ataqueMaximo, this.cantDados);
    }

    
    
}
