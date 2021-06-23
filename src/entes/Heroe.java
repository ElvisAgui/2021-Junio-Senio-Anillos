package src.entes;

import src.Bestias.Orcos;

public class Heroe extends Ente {

    public Heroe(String nombre, int armadura) {
        super(nombre, armadura);
        super.cantDados=2;
        super.ataqueMaximo = 100;
    }
    
    @Override
    public int getAtaque(){
        return super.ataque = Ente.tirarDado(this.ataqueMaximo, this.cantDados);
    }

    @Override
    public int diminucionArmadura(Ente enemigo){
        if(enemigo instanceof Orcos) {
            int reduccion = (int)(getArmadura()*0.1);
            System.out.println("Rayos un Orco, ----Mi armadura es muy devil...!"); 
            return getArmadura()-reduccion;
        }

        return getArmadura();
    }
    
    

}
