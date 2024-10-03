import java.util.Scanner;
import java.util.ArrayList;

/**
 * La clase Fibonacci se encarga de generar y almacenar una secuencia de números de Fibonacci.
 * Inicia la secuencia con los valores 0 y 1 por omisión y permite agregar más valores a la secuencia.
 */
class Fibonacci {
    private ArrayList<Integer> fibo; // Almacena los números de la serie de Fibonacci

    /**
     * Constructor de la clase Fibonacci.
     * Inicializa el ArrayList y añade los dos primeros números de la serie de Fibonacci: 0 y 1.
     */
    public Fibonacci() {
        fibo = new ArrayList<Integer>();
        fibo.add(0);  // Añadir el primer número de la serie
        fibo.add(1);  // Añadir el segundo número de la serie
    }

    /**
     * Añade los siguientes números de la serie de Fibonacci hasta completar el tamaño n.
     * La serie se basa en la suma de los dos números anteriores.
     *
     * @param n El número total de elementos que debe tener la serie de Fibonacci.
     */
    public void addNumbers(int n) {
        for (int j = 2; j < n; j++) {
            fibo.add(fibo.get(j - 1) + fibo.get(j - 2));
        }
    }

    /**
     * Muestra los primeros n números de la serie de Fibonacci almacenados en el ArrayList.
     *
     * @param n El número de elementos de la serie de Fibonacci que se desea mostrar.
     */
    public void showSeries(int n) {
        System.out.println("Serie de Fibonacci con " + n + " elementos:");
        for (int k = 0; k < n; k++) {
            System.out.print(fibo.get(k));
            if (k < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();  // Para dejar un salto de línea al final
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner felipe = new Scanner(System.in);
        int n = -1;  // Inicializar n con un valor inválido para iniciar el bucle

        // Solicitar al usuario que ingrese un número hasta que ingrese un valor válido (entero positivo)
        while (n <= 0) {
            System.out.println("Ingrésamelo... el número también: ");
            // Verificar si el valor ingresado es un número entero
            if (felipe.hasNextInt()) {
                n = felipe.nextInt();
                if (n <= 0) {
                    System.out.println("El número debe ser mayor a 0. Intenta de nuevo.");
                }
            }
            else {
                // Si no es un número entero, limpiar el buffer y mostrar un mensaje de error
                System.out.println("Eso no es un número entero. Qué te pasa?");
                felipe.next();  // Limpiar el valor inválido del Scanner
            }
        }
        // Crear un objeto de la clase Fibonacci
        Fibonacci fibonacci = new Fibonacci();

        // Añadir los números a la serie
        fibonacci.addNumbers(n);

        // Mostrar la serie de Fibonacci
        fibonacci.showSeries(n);
    }
}
