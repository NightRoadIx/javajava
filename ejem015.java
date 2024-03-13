// AWT (Abstract Window Toolkit)
// proporciona clases y métodos para construir 
// aplicaciones gráficas y manipular elementos de la interfaz de usuario.
import java.awt.*;
// Estas dos si se importan específicamente
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// es una extensión de java.awt que proporciona 
// componentes gráficos adicionales y mejora la flexibilidad y funcionalidad de la interfaz de usuario.
import javax.swing.*;

public class MainFrame extends JFrame{
    // ATRIBUTOS
    // Define una fuente global para la interfaz
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
  
    // Variables para los componentes de la interfaz
    JTextField tfNombre, tfApellido;
    JLabel lbWelcome;

    // MÉTODOS
    public void iniciar() {
        /* Panel de Formulario */
        // Crear las etiquetas
        JLabel lbNombre = new JLabel("Nombre: ");
        lbNombre.setFont(mainFont);
        // y los campos de texto
        tfNombre = new JTextField();
        tfNombre.setFont(mainFont);

        JLabel lbAppelido = new JLabel("Apellido: ");
        lbAppelido.setFont(mainFont);
        tfApellido = new JTextField();
        tfApellido.setFont(mainFont);

        // Organiza los componentes del formulario en un panel
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5)); // GridLayout distribuye los componentes en una cuadrícula
        formPanel.add(lbNombre);
        formPanel.add(tfNombre);
        formPanel.add(lbAppelido);
        formPanel.add(tfApellido);

        /* Etiqueta de bienvenida */
        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);        

        /* Panel para los botones */
        // Crea los botones
        // Generar un botón con etiqueta OK
        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);
        // Le añade funcionalidad al botón
        // Se genera un objeto ActionListener que 
        // contiene directamente varios métodos
        btnOK.addActionListener(new ActionListener() {
            // Implementación del método actionPerformed, que se ejecuta cuando se hace clic en el botón
            // La etiqueta @Override le indica al compilador que el 
            // método se está sobrecargando (polimorfismo) de la clase
            // que se está usando, esto para darle funcionalidad
            // específica; este mecanismo proporciona claridad y evita errores
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtiene el texto ingresado en los campos de texto tfNombre y tfApellido
                String firstName = tfNombre.getText();
                String lastName = tfApellido.getText();
                // Actualiza el texto de la etiqueta lbWelcome
                lbWelcome.setText("Hallo " + firstName + " " + lastName); // Muestra un mensaje de saludo
            }
        });
    
        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpia los campos de texto
                tfNombre.setText(""); 
                tfApellido.setText("");
                lbWelcome.setText("");
            }
        });
    
        // Organiza los botones en un panel
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5)); // Distribuye los botones en dos columnas
        buttonsPanel.setOpaque(false); // Hace que el panel sea transparente
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);

        /* Panel principal */
        // Organiza los componentes del formulario en un panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout()); // BorderLayout permite colocar componentes en puntos cardinales
        mainPanel.setBackground(new Color(128, 128, 255)); // Establece el color de fondo
        mainPanel.add(formPanel, BorderLayout.NORTH); // Coloca el formulario en la parte superior
        mainPanel.add(lbWelcome, BorderLayout.CENTER); // Coloca la etiqueta de bienvenida en el centro
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH); // Coloca los botones en la parte inferior

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
