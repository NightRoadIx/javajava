import java.util.Scanner;

public class Ejem005 {
    public static void main(String[] args){
        // Variable que indica el día de la semana
        int diaSemana;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el día de la semana [1, 7]");
        diaSemana = entrada.nextInt();

        // Instrucción de selección múltiple switch()
        // Debe considerarse que la variable que se pondra a prueba
        // será exactamente igual a cualquiera de las expresiones que se
        // colocan en los casos
        // De preferencia se utilizan valores enteros
        switch (diaSemana) {
            case 1:     // Esto sería como if(diaSemana == 1)
                System.out.println("Hoy es Lunes");
                break;   // Esta sentencia rompe el switch y lleva el flujo del programa al fin del switch
            case 2:     // if(diaSemana == 2)
                System.out.println("Hoy es Martes");
                break;
            case 3:     // if(diaSemana == 3)
                System.out.println("Hoy es Miércoles");
                break;
            case 4:
                System.out.println("Hoy es Jueves");
                break;
            case 5:
                System.out.println("Hoy es Viernes");
                break;
            case 6:
                System.out.println("Hoy es Sábado");
                break;
            case 7:
                System.out.println("Hoy es Domingo");
                break;
            default:   // Este valor aparece cuando ningún otro elemento es parecido
                System.out.println("Error Mortal en el día seleccionado");
                break;
        }
    }
}
