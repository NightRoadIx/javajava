import java.awt.*;
import javax.swing.*;


public class MainFrame extends JFrame{
    // ATRIBUTOS
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);

    // MÉTODOS
    public void iniciar() {
        /* Panel de Formulario */
        // Crear las etiquetas
        JLabel lbNombre = new JLabel("Nombre: ");
        lbNombre.setFont(mainFont);

        JLabel lbAppelido = new JLabel("Apellido: ");
        lbAppelido.setFont(mainFont);        
        
        /* Panel principal */
        // Organiza los componentes del formulario en un panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128,128,255));

        // Agrega el panel principal a la ventana
        add(mainPanel);        

        // Configura la ventana principal
        setTitle("Bienvenido"); // Establece el título de la ventana
        setSize(500, 600); // Establece el tamaño inicial
        setMinimumSize(new Dimension(300, 400)); // Establece el tamaño mínimo
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Cierra la aplicación al cerrar la ventana
        setVisible(true); // Hace la ventana visible
    }

    public static void main(String[] args) {
        // Instanciar un objeto MainFrame
        MainFrame miPrimeraChamba = new MainFrame();
        miPrimeraChamba.iniciar();
    }
}
