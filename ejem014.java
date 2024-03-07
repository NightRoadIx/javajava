class Animal {
    protected String dieta;
    protected String coloracion;
    protected String habitat;
    protected int extremidades;
    protected double dimensiones;

    public Animal()
    {
        this.dieta = "Carnivoro";
        this.coloracion = "Café anaranjado con detalles atigrados";
        this.habitat = "en su casa";
        this.dimensiones = 31.5;
        this.extremidades = 4;
        System.out.println("Se creo el Animal");
    }

    public void comer()
    {
        System.out.println("El animal está comiendo");
    }

}

class Felinos extends Animal {
    protected String pelaje;
    
    public Felinos() {
        this.pelaje = "sin pelaje mechudo";
        System.out.println("Se creo un Felino");
    }

    public void ronronear() 
    {
        System.out.println("El felino está ronroneando");
    }

    public void comer(){
        System.out.println("El felino está comiendo");
    }    

}

class Gato extends Felinos {
    private String raza;
    private boolean domestico;

    public Gato() {
        this.raza = "Munchkin";
        this.domestico = true;
        System.out.println("Se creo un Gato");
    }

    public void dormir() {
        System.out.println("El gato estpá durmiendo");
    }

    public void comer(){
        System.out.println("El gato está comiendo");
    }
}

public class App {

    public static void main(String[] args) {
    // Instanciar un objeto
    Gato nan = new Gato();
    nan.comer();
    }
}