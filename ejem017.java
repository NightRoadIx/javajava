class Contador extends Thread {
    private boolean ejecutar;
    // Constructor
    // Strč prst skrz krk 
    public Contador() {
        // Iniciar la variable ejecutar a true
        this.ejecutar = true;
        System.out.println(this.ejecutar);
    }
    // Método para detener el contador
    public void detener() {
        this.ejecutar = false;
        System.out.println(this.ejecutar);
    }
    public void run(){
        int i = 1;
        while(this.ejecutar) {
            System.out.println("Contador : " + i);
            i++;
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e){
                System.out.println("Subproceso interruptus");
                System.out.println(e.getMessage());
            }
        }
    }

}

public class Multitarea {
    public static void main(String[] args){
        Contador contador = new Contador();
        contador.start();

        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        contador.detener();
    }
}
