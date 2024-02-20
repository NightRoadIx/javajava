import java.util.Scanner;

public class Ejem004 {
    public static void main(String[] args){
        int a, b;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese valor a: ");
        a = entrada.nextInt();
        System.out.println("Ingrese valor b: ");
        b = entrada.nextInt();

        // Sentencia de decisión if() - else if() - else
        // Permite seleccionar entre tres opciones
        // Por ejemplo, comparar entre dos números
        if (a > b) {
            System.out.println("El número " + a + " es mayor que " + b);
        } else if (a < b) {
            System.out.println("El número " + b + " es mayor que " + a);
        } else {
            System.out.println("Ambos números son iguales");
        }

        // Operador ternario
        int edad;
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        // El operador ternario es resultado = (condicion) ? expresión_verdadera : expresión_falsa
        // En este caso se asigna una cadena de texto dependiendo del valor de edad
        // Esto sustituye a:
        /*
            if(condicion)
                resultado = expresión_verdadera
            else
                resultado = expresión_falsa

            Condensando el código fuente a su mínima expresión
        */
        String resultado = (edad < 18) ? "menor" : "mayor";
        System.out.println("Es " + resultado + " de edad");
    }
}
