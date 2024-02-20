import java.util.Scanner;

public class Ejem007 {
    public static void main(String[] args){
        int i;

        // Ciclo for, utilizado para hacer ciclos cuyo número esta bien definido
        // la ejecución es la siguiente:
        // for(inicio_de_variables; inicio_var01; condición; operaciones)
        // {
        //      Cuerpo del for
        // }
        // La ejecución es inicio_de_variables (se ejecuta solo una vez)
        // posteriormente se prueba la condición
        // luego el Cuerpo del for
        // finalmente las operaciones y se regresa a condición y así sucesivamente
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // Por otro lado, si el for realiza solo operaciones, se puede colocar todo
        // dentro de la expresión
        // Por ejemplo para sumar los números del 0 al 9
        int total;
        for (i = 0, total = 0; i < 10; total += i, i++);

        System.out.println("El valor es " + total);


        // Sentencia foreach
        // Es una sentencia de ciclo adicional a las existentes en C-ANSI
        // la cual es utilizada para recorrer un arreglo
        // Su uso es foreach(tipo nombreVariable : nombreArreglo)
        String[] frutas = { "manzana", "naranja", "uva", "cereza" };
        for (String c : frutas) {
            System.out.println(c);
        }
    }
}