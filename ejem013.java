/* 
 * Clases son envoltorios
 * variables: atributos, descripción de la clase
 * funciones: métodos, funcionalidad de la clase
 */
/**
 * Clase automóvil con sus atributos y métodos
 */
class Automovil {
    /* ATRIBUTOS */
     /**
     * Tipo de energía que utiliza el automóvil (e.g., "gasolina", "eléctrico").
     */
    private String energia;
    /**
     * Indica si la transmisión es manual (`false`) o automática (`true`).
     */  
    private boolean transmision;
    /**
     * Categoría del automóvil (e.g., "sedán", "SUV", "compacto").
     */  
    private String segmento;
    /**
     * Velocidad máxima que puede alcanzar el automóvil en km/h.
     */  
    private int velocidadMaxima;
    /**
     * Precio del automóvil en burrodólares.
     */  
    private double precio;
    /**
     * Marca del fabricante del automóvil.
     */  
    private String marca;
    /**
     * Modelo específico del automóvil.
     */  
    private String modelo;
    /**
     * Año de fabricación del automóvil.
     */  
    private int anno;
  
    /* MÉTODOS */

    /* Getters y setters */
    /**
     * @return String return the energia
     */
    public String getEnergia() {
        return energia;
    }

    /**
     * @param energia the energia to set
     */
    public void setEnergia(String energia) {
        this.energia = energia;
    }

    /**
     * @return boolean return the transmision
     */
    public boolean isTransmision() {
        return transmision;
    }

    /**
     * @param transmision the transmision to set
     */
    public void setTransmision(boolean transmision) {
        this.transmision = transmision;
    }

    /**
     * @return String return the segmento
     */
    public String getSegmento() {
        return segmento;
    }

    /**
     * @param segmento the segmento to set
     */
    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    /**
     * @return int return the velocidadMaxima
     */
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * @param velocidadMaxima the velocidadMaxima to set
     */
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * @return double return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return String return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return String return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return String return the anno
     */
    public int getAnno() {
        return anno;
    }

    /**
     * @param jahr the anno to set
     */
    public void setModelo(int jahr) {
        this.anno = jahr;
    }   

    /**
     * Constructor de la clase. Se ejecuta al crear un nuevo objeto `Automovil`.
     *
     * @param mod Modelo del automóvil (String).
     * @param mar Marca del fabricante del automóvil (String).
     * @param yir Año de fabricación del automóvil (int).
     *
     * @see #mostrarAuto()
     */
    public Automovil(String mod, String mar, int yir)
    {
      System.out.println("Se creo el objeto Automóvil");
      this.marca = mar;
      this.modelo = mod;
      this.anno = yir;
    }

    /**
     * Constructor de la clase. Se ejecuta al crear un nuevo objeto `Automovil`.
     * Inicia variables a vacío y anno a 1908
     *
     */    
    public Automovil()
    {
        System.out.println("Se crea el objeto Automovil como mi mente, en blanco");
        this.marca = "";
        this.modelo = "";
        this.anno = 1908;
    }
  
    /**
     * Muestra información básica del automóvil por consola.
     */
    public void mostrarAuto()
    {
      System.out.println("Marca : " + this.marca);
      System.out.println("Modelo: " + this.modelo);
      System.out.println("Año   : " + this.anno);
    }
  }

public class Ejem013 {
  
    // Método main
    public static void main(String[] args) {
      // Instanciar un objeto de la clase Automovil
      Automovil tsuru = new Automovil("Tsuru","Nissan",2017);
      Automovil ibiza = new Automovil("Ibiza", "SEAT", 2001);
      // Generar un objeto Automovil con el constructor vacío
      Automovil batimovil = new Automovil();      

      tsuru.mostrarAuto();
      //ibiza.anno = 2023;
      ibiza.mostrarAuto();
      batimovil.mostrarAuto();
    }
}
