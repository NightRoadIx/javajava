import java.util.Scanner;

public class Ejem011 {

    // ATRIBUTOS
    
    // MÉTODOS
    /**
     * Método para recibir un número entero en un intervalo [a,b]
     * y devolverlo
     * 
     * @param       a valor mínimo del intervalo
     * @param       b valor máximo del intervalo
     * @return      Número entero correcto ingresado por el usuario
    */
    public static int recibirEntero(int a, int b)
    {
        boolean rompe = true;
        int valor = 0;
        String cadena;
        
        // Instanciar un objeto Scanner para ingreso de datos
        // NombreClase objeto = new Constructor
        // int entero = 6;
        // Int entero = new Int(6);
        Scanner funeado = new Scanner(System.in);
        
        do
        {
            System.out.println("Ingresar un valor: ");
            try {
                /* Cualquiera de estas instrucciones puede generar una Excepción */
                // Ingresar como cadena de texto
                cadena = funeado.nextLine();
                // Intentar hacer la transformación
                valor = Integer.parseInt(cadena);
                // Revisar si está en el intervalo
                if(valor >= a && valor <= b) 
                    rompe = false;
                else
                    System.out.println("Valor fuera de intervalo");
            }
            catch (Exception ex) {
                System.out.println("Dije que pusieras un entero, que no sabes leer, te voy a regresar a la primaria ");
                System.out.println(ex.toString());
            }
        } while(rompe);        
        
        // Scanner ha de ser cerrado       
        funeado.close();

        return valor;
    }
    
    /**
     * Método para recibir un número flotante en un intervalo [a,b]
     * y devolverlo
     * 
     * @param       a valor mínimo del intervalo
     * @param       b valor máximo del intervalo
     * @return      Número entero correcto ingresado por el usuario
    */
    public static float recibirFlotante(float a, float b)
    {
        boolean rompe = true;
        float valor = 0.0f;
        String cadena;
        
        // Instanciar un objeto Scanner para ingreso de datos
        Scanner funeado = new Scanner(System.in);
        
        do
        {
            System.out.println("Ingresar un valor: ");
            try {
                /* Cualquiera de estas instrucciones puede generar una Excepción */
                // Ingresar como cadena de texto
                cadena = funeado.nextLine();
                // Intentar hacer la transformación
                valor = Float.parseFloat(cadena);
                // Revisar si está en el intervalo
                if(valor >= a && valor <= b) 
                    rompe = false;
                else
                    System.out.println("Valor fuera de intervalo");
            }
            catch (Exception ex) {
                System.out.println("Dije que pusieras un flotante, que no sabes leer, te voy a regresar a la primaria ");
                System.out.println(ex.toString());
            }
        } while(rompe);

        // Scanner ha de ser cerrado       
        funeado.close();

        return valor;
    }    
    
    // Método main
    public static void main(String[] args) {    
        int a = 0, b = 10, valor;

        valor = recibirEntero(a, b);
        System.out.println("Uste' ingreso: " + valor); 
    }    
  
}