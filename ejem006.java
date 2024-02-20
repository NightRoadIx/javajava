import java.util.Scanner;

public class Ejem006 {
    public static void main(String[] args){
        int i;

        // Ciclo while()
        // El cual piensa antes de hacer
        // se ejecuta mientras la condición sea verdadera
        i = 0;
        while (i < 5) { //true se ejecuta, false se detiene
            System.out.println(i);
            i++; // No olvidar modificar la variable de la condición
        }
        /* while(true)
        {
            System.out.println(i);
            i++;  // No olvidar modificar la variable de la condición
            if(i > 5) // para ciclos infinitos
                break;
        } */

        System.out.println("\n");

        // Ciclo do - while()
        // El cual hace (al menos una vez) y luego piensa
        i = 0; // i = 6;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        System.out.println("\n");

        // Sentencias de salto break y continue
        // Para detener la ejecución de un ciclo se puede utilizar "break"
        i = 0;
        while (i < 10) {
            // Cuando i sea igual a 4, terminar con el ciclo
            if (i == 4) break;
            // Tras que i sea 4, esto ya nunca se ejecutará
            System.out.println(i);
            i++;
        }

        System.out.println("\n");

        // Para evitar la ejecución de líneas en algún momento en
        // particular, pero asegurando que se cumpla con las ejecuciones del ciclo
        // puede utilizarse la sentencia continue
        i = 0;
        while (i < 10) {
            // Cuando i sea igual a 4, salta
            if (i == 4) {
                i++; // Como las líneas no se ejecutarán hay que incrementar
                continue;
            }
            // todas las instrucciones por debajo
            System.out.println(i);
            i++;
        }
    }
}
