import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Colocar una variable como hardcode
        int n = 1;

        // Declarar la variable de la serie
        int serie[] = new int[n];
        // También se puede declarar un objeto arreglo
        ArrayList<Integer> fibo = new ArrayList<Integer>();

        // Estos valores son los por defecto de la serie
        /*serie[0] = 0; serie[1] = 1;
        // Calcular los elementos de la serie
        for(int i = 2; i < n; serie[i] = serie[i-1] + serie[i-2], i++);
            
        // Mostrar los datos de la serie ya calculada
        for(int tmp :serie)
            System.out.print(tmp + ", ");
        */
        fibo.add(0); fibo.add(1);
        for(int j = 2; j < n; j++)
            fibo.add(fibo.get(j-1) + fibo.get(j-2));

        for(int tmp :fibo)
        System.out.print(tmp + ", ");
    }
}
