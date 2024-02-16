// Librería Math para funciones matemáticas
import java.lang.Math;

public class Ejem003 {
    public static void main(String[] args){
        /*
         * Operadores en java
         * Se realizan en la unidad aritmético-lógica
         * por lo que se pueden dividir en operaciones
         * Aritméticas (+ - * / % ++ --)
         * Lógicas (& | ^ !)
         * Adicionalmente:
         * Comparación (> < == !=)
         * Desplazamiento de bits (>> <<)
         */
        // Operadores aritméticos
        System.out.println(5 + 9);  // suma
        System.out.println(5 - 9);  // resta
        System.out.println(5 * 9);  // multiplicación
        System.out.println(5 / 9);  // división
        System.out.println(5 % 9);  // módulo
        // Se puede utilizar +=, -=, *=, /=, %= para operar y asignar sobre una variable
        // Además, se usan ++, -- para incrementar o decrementar en 1

        // Operadores lógicos(comparación)
        System.out.println(5 < 9);          // menor que
        System.out.println(5 > 9);          // mayor que
        System.out.println(5 == 9);         // igual que
        System.out.println(5 != 9);         // diferente que
        System.out.println(true && true);   // y (and)
        System.out.println(true || true);   // o (or)
        System.out.println(!true);          // no (not)

        // Operadores lógicos a nivel de bits
        System.out.println(true & true);    // and
        System.out.println(12 & 10);    // and
        System.out.println(12 | 10);    // or
        System.out.println(12 ^ 10);    // xor

        // Operadores desplazamiento de bits
        System.out.println(12 >> 2);    // bits a la derecha
        System.out.println(12 << 2);    // bits a la izquierda

        // Funciones matemáticas externas
        System.out.println(Math.pow(2, 8)); // Potencia
        System.out.println(Math.sqrt(121));   // Raíz cuadrada
        System.out.println(Math.exp(1));      // Exponente
        System.out.println(Math.log10(1000)); // Logaritmo base 10
        System.out.println(Math.log(5.42));   // Logaritmo natural
        System.out.println(Math.PI);            // Valor de pi
        // Formatear para ciertos dígitos decimales
        System.out.println( String.format("%.04f" ,Math.PI) );
    }
}
