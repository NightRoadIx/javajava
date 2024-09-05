public class Fibo {
    public static void main(String[] args) throws Exception {
        // Colocar una variable como hardcode
        int n = 6;

        // Declarar la variable de la serie
        int serie[] = new int[n];
        // Estos valores son los por defecto de la serie
        serie[0] = 0; serie[1] = 1;
        // Calcular los elementos de la serie
        for(int i = 0; i < n-2; i++)
            serie[i+2] = serie[i] + serie[i+1];
        // Mostrar los datos de la serie ya calculada
        for(int tmp :serie)
            System.out.print(tmp + ", ");
    }    
}
