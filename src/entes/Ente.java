package src.entes;

public class Ente {

    protected String nombre;
    protected int vida;
    protected int armadura;
    protected int ataqueMaximo;
    protected int cantDados;
    protected int ataque;

    public Ente(String nombre, int armadura) {
        this.nombre = nombre;
        this.armadura = armadura;
    }

    public static int tirarDado(int maximo, int numDados) {
        int valor = 0;
        int random;
        for (int i = 0; i < numDados; i++) {
            random = (int)(Math.random()*maximo);
            if(random > valor){
                valor = random;
            }
        }
        return valor;
    }

    public int getAtaque(){
        return ataque;
    }

    public void ataqueEnemigo(Ente enemigo){
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Personajes en Pelea "+this.getNombre()+"mis puntos de vida son; "+this.getVida()+" contra "+enemigo.getNombre()+"mis puntos de vida son; "+enemigo.getVida());
        System.out.println(this.getNombre()+" Estooy atacando a: "+enemigo.getNombre());
        
        if (this.aumentoAtaque(enemigo) > enemigo.diminucionArmadura(this)) {
            enemigo.setVida(this.getAtaque() - enemigo.getArmadura());
            System.out.println("*******Exelente, Mi ataque fue mayor a su Defensa******");
        }else{
            System.out.println("------oh!!, No logre hacerle daño por su armadura------");
        }   
    
        System.out.println("-----Fin de la Pelea-----");
        System.out.println(" "+this.getNombre()+"mis puntos de vida son; "+this.getVida()+" contra "+enemigo.getNombre()+"mis puntos de vida son; "+enemigo.getVida());
        System.out.println("----------------------------------------------------------------------------");
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida -= vida;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getAtaqueMaximo() {
        return ataqueMaximo;
    }

    public void setAtaqueMaximo(int ataqueMaximo) {
        this.ataqueMaximo = ataqueMaximo;
    }

    public int getCantDados() {
        return cantDados;
    }

    public void setCantDados(int cantDados) {
        this.cantDados = cantDados;
    }

    public int aumentoAtaque(Ente enemigo){
        return getAtaque();
    }

    public int diminucionArmadura(Ente enemigo){
        return getArmadura();
    }

    
    public String DatosEnte() {
        return "Ente [ataqueMaximo=" + ataqueMaximo + ", nombre=" + nombre + ", vida=" + vida + "]";
    }

    

    
    

}
