import java.util.Scanner;

public class Ejem008 {
    public static void main(String[] args){

        // Generar un vector con valores ya definidos
        int[] misNumeros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // Generar un vector con cierta cantidad de espacios disponibles
        // se debe usar la palabra new y el tipo de dato, de la forma:
        // int[] nombre = new int[TAMAÑO];

        // C-ANSI:
        // int vector[10];
        // Sin embargo, es posible usar asignación dinámica de espacios
        System.out.print("Ingresar tamaño del vector: ");
        int k = Integer.parseInt(System.console().readLine());
        int[] vector = new int[k];

        // Así ya se pueden ingresar valores en el vector generado
        // la propiedad .length del vector proporciona el número
        // total de elementos en el arreglo
        for (k = 0; k < vector.length; k++) {
            System.out.print("Elemento " + k + ": ");
            vector[k] = Integer.parseInt(System.console().readLine());
        }

        // Recorrer el vector para mostrarlo
        for (int tmp : vector) {
            System.out.print(" " + tmp + " ");
        }

        // Matrices regulares
        /*
         * | 0 0 0 |
         * | 0 0 0 |
         * | 0 0 0 |
         * */
        // Se declaran, colocando una coma por cada dimensión
        int[][] matriz = new int[3][3];

        /* PROPIEDADES DE LOS VECTORES */
        // Tamaño de los vectores
        System.out.println(misNumeros.length);
        // o de las matrices, ambos proporcionan el número de elementos
        System.out.println(matriz.length);

        // Número de dimensiones de la matriz
        System.out.println(matriz.length);

        System.console().readLine();
    }
}