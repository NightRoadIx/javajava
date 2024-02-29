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

      tsuru.mostrarAuto();
      //ibiza.anno = 2023;
      ibiza.mostrarAuto();
    }
}