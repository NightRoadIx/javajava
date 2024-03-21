import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.sound.sampled.*;

/**
 * Esta clase genera una interfaz gráfica de usuario para controlar la reproducción de un tono de audio.
 */
public class MainFrame2 extends JFrame implements ActionListener{
    private JLabel lblFrecuencia;
    private JTextField txtFrecuencia;
    private JButton btnInicioParo;
    private boolean reproduciendo;
    private Thread hiloReproduccion;

    /**
     * Constructor de la clase ReproductorAudio.
     */
    public MainFrame2() {
        // Colocar el nombre de la ventana
        super("Reproductor de Audio");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Etiqueta "Frecuencia"
        lblFrecuencia = new JLabel("Frecuencia:");
        add(lblFrecuencia);

        // Caja de texto para ingresar la frecuencia
        txtFrecuencia = new JTextField(10);
        add(txtFrecuencia);

        // Botón "Inicio/Paro"
        btnInicioParo = new JButton("Inicio");
        btnInicioParo.addActionListener(this);
        add(btnInicioParo);

        reproduciendo = false;
    }

    /**
     * Método de acción que se ejecuta cuando se hace clic en el botón "Inicio/Paro".
     * @param e El evento de acción.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Verificar si el botón está en estado "Reproduciendo"
        if (reproduciendo) {
            // Si está reproduciendo, detener la reproducción
            // Interrumpir el hilo de reproducción
            hiloReproduccion.interrupt();
            
            // Cambiar el texto del botón a "Inicio"
            btnInicioParo.setText("Inicio");
            
            // Actualizar el estado a "No Reproduciendo"
            reproduciendo = false;
        } else {
            // Si no está reproduciendo, iniciar la reproducción
            
            // Obtener la frecuencia ingresada en la caja de texto
            int frecuencia = Integer.parseInt(txtFrecuencia.getText());

            // Crear un nuevo hilo para reproducir el tono de audio con la frecuencia especificada
            // Genera una nueva instancia Thread
            // Luego en el constructor, se usa una expresión lambda,
            // que representa un objeto 'Runnable' que llama al método
            // reproducirTono()
            hiloReproduccion = new Thread(() -> reproducirTono(frecuencia));
            
            // Iniciar el hilo de reproducción
            hiloReproduccion.start();
            
            // Cambiar el texto del botón a "Paro"
            btnInicioParo.setText("Paro");
            
            // Actualizar el estado a "Reproduciendo"
            reproduciendo = true;
        }
    }

    /**
     * Método para reproducir un tono de audio con una frecuencia dada.
     * @param frecuencia La frecuencia del tono de audio.
     */
    private void reproducirTono(int frecuencia) {
        try {
            // Crear un tono de audio con la frecuencia especificada
            AudioFormat formato = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 44100, 16, 1, 2, 44100, false);
            SourceDataLine linea = AudioSystem.getSourceDataLine(formato);
            linea.open(formato);
            linea.start();

            // Generar el tono de audio
            byte[] buffer = new byte[44100];
            for (int i = 0; i < buffer.length; i++) {
                double angulo = 2.0 * Math.PI * i / (44100 / frecuencia);
                buffer[i] = (byte) (Math.sin(angulo) * 127.0);
            }

            // Reproducir el tono de audio
            linea.write(buffer, 0, buffer.length);
            linea.drain();
            linea.close();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método principal para ejecutar la aplicación.
     * @param args Los argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        // Invoca la creación y visualización de la interfaz gráfica en el hilo de despacho de eventos de Swing
        SwingUtilities.invokeLater(() -> {
            // Crea una nueva instancia del reproductor de audio
            MainFrame2 reproductor = new MainFrame2();
            // Hace visible la ventana del reproductor de audio
            reproductor.setVisible(true);
        });
    }
}
