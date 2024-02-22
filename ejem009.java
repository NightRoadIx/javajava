import java.util.Scanner;

public class Ejem009 {
    public static void main(String[] args){

        /*
            Manejo de excepciones en Java
            El manejo de excepciones permite controlar los errores de un programa
            en tiempo de ejecución.
            Generalmente, cuando un error ocurre (división entre 0, operar variables de tipos diferentes)
            el programa normalmente se detiene y genera un mensaje de error.
            El término técnico para esto es que el programa lanza una excepción (o arroja un error).

            Para esto se utiliza la instrucción try-catch

            try {
                // Bloque de código de intento
            } catch (Exception e) // Se coloca que tipo de excepción se va a manejar
            {
                // Bloque de código para manejar el error
            } finally {
                // Código a ejecutar tras el try - catch
            }
        */

        int[] misNumeros = {1, 2, 3, 4};

        try {
            // Intentar ingresar a un elemento fuera del tamaño del arreglo
            System.out.println(misNumeros[10]);
            // Esto lanzará una excepción
        } catch (ArrayIndexOutOfBoundsException e) {
            // Se muestra el mensaje de error del sistema
            System.out.println(e.getMessage());
            // Aunque también se puede colocar un mensaje personalizado
            System.out.println("Algo ha ido mal al intentar ingresar al arreglo");
        } finally {
            System.out.println("El try-catch ha finalizado");
        }
    }
}