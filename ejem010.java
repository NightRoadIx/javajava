import java.util.Scanner;

public class Ejem010 {

	/*
		Los comentarios de documentación Java se utilizan para explicar el 
		código y facilitar su comprensión.
		Se pueden escribir comentarios de documentación para clases, métodos, 
		variables y otros elementos del código.
		Se puede incluir información adicional como:
		* Parámetros de la función
		* Valor de retorno de la función
		* Excepciones que puede generar la función
		* Ejemplos de uso de la función
	*/
	
    /**
     * Función que suma dos números enteros y devuelve el resultado.
     *
     * @param num1 El primer número a sumar.
     * @param num2 El segundo número a sumar.
     * @return La suma de los dos números.
	 * @throws ArithmeticException Si se produce un desbordamiento aritmético.
     */
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Función principal del programa.
     *
     * @param args Argumentos de la línea de comandos (no se usan en este ejemplo).
     */
    public static void main(String[] args) {
        // Se llama a la función sumar y se almacenan los resultados
        int resultado1 = sumar(5, 3);
        int resultado2 = sumar(10, -2);

        // Se muestran los resultados por consola
        System.out.println("La suma de 5 y 3 es: " + resultado1);
        System.out.println("La suma de 10 y -2 es: " + resultado2);
    } 
}