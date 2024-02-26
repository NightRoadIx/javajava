import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejem012 {
  
    // Método main
    public static void main(String[] args) {
         // Cadenas de texto
         // Un arreglo de caracteres
         Scanner angel = new Scanner(System.in);
         System.out.println("Ingrese algo: ");
         String cadena = "Ola Alo,  ,cómo estás?";
         //String cadena = angel.nextLine();

         // Obtiene la longitut de la cadena
         System.out.println(cadena.length());
         // Obtiene un caracter en la posición dada
         System.out.println(cadena.charAt(2));
         // Obtiene una subcadena que inicia en 1 y termina en 4
         System.out.println(cadena.substring(1, 4));
         // Separar un texto en palabras
         String[] partes = cadena.split(" ");
         //System.out.println(cadena.split(" ")[0]);
         //System.out.println(cadena.split(" ")[1]);
         for(String tmp: partes){
            System.out.println(tmp);
         }

         // Recorrer un arreglo de enteros
         int[] vetor = {1, 2, 3, 4, 5, 6, 7};
         for(int dummy: vetor){
            System.out.println(dummy);
         }

         // Expresiones regulares
         // Crear un patrón que busca cualquier vocal (mayúscula o minúscula) en una cadena
         Pattern patron = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
         // Crear un objeto Matcher que buscará el patrón en la cadena
         Matcher machaca = patron.matcher(cadena);
         // Verificar si se encuentra al menos una coincidencia del patrón en la cadena
         if(machaca.find())
            System.out.println("Hallado");

         // Separar un texto en palabras, pero con crocodyle
         // Usando expresiones regulares (regex)
         // La expresión dice:
         // Considera todos los caracteres dentro de []
         // Posteriormente toma espacios \s
         // Y los signos de puntuación .,;:!?
         // Todo esto puede ocurrir una o más veces +
         String[] partes2 = cadena.split("[\\s,.;:!?]+");
         for(String tmp: partes2){
            System.out.println(tmp);
         }
    }    
}