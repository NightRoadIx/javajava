import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Colocar una variable como hardcode
        // TODO: Agregar una entrada de datos con restricciones
        // int n = 30;
        Scanner felipe = new Scanner(System.in);

        System.out.println("Ingrésamelo... el número también: ");
        String jelipeii = felipe.nextLine();
        for(char tmp : jelipeii.toCharArray())
        {
            Character.isDigit(tmp);
            float jelipeiii = (float)3;
        }
        int n;

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

        // Se puede mostrar toda la serie
        for(int tmp :fibo)
            System.out.print(tmp + ", ");
        // Colocar un salto de línea
        System.out.println("");
        // O solamente mostrar lo que pide
        // el usuario
        for(int k = 0; k < n; k++)
            System.out.print(fibo.get(k) + ", ");
    }
}
