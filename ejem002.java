// Importar librería para la clase Scanner
import java.util.Scanner;

public class Ejem002 {
    public static void main(String[] args){
        /* 
            Entrada | Salida 
            Java tiene un muy pequeño y casi
            insignificante problema, no posee
            funciones built-in o estándar
            incorporadas que permitan gestionar
            los bloques de entrada | salida
        */
        // Para la entrada se requiere usar
        // un objeto de la clase Scanner()
        // usando la entrada estándar del sistema (teclado)
        Scanner sc = new Scanner(System.in);
        // Colocar un prompt o guión de que
        // hacer
        System.out.println("Ingrese algo: ");
        // Recibir una cadena de texto
        String algo = sc.nextLine();

        /*
         * Scanner tiene varios métodos para ingresar
         * diferentes tipos de datos:
         * nextBoolean()
         * nextShort()
         * nextInt()
         * nextLong()
         * nextFloat()
         * nextDouble()
         */

        // La salida se realiza mediante
        System.out.println("Se ingresó: " + algo);
        // el método print() no coloca un 
        // salto de línea al final
        // Igualmente, las cadenas de texto se pueden
        // concatenar (eso es unir) mediante el
        // operador +

        // Si se quiere imprimir números
        System.out.println(12);
    }
}
