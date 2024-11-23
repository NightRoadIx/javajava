import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Ejemplo de operaciones CRUD con una base de datos relacional utilizando SQLite.
 * CRUD: Create (Crear), Read (Leer), Update (Actualizar), Delete (Borrar).
 */
public class App {

    /**
     * Método principal que ejecuta las operaciones CRUD.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        try (
            // Conexión a la base de datos SQLite de forma local
            // Esto esta preparado para conectar con BD en línea
            // por lo tanto el parámetro esperado es una URL (Localizador de Recurso Unificado)
            Connection connection = DriverManager.getConnection("jdbc:sqlite:estonoesunexcel.sqlite");
        ) {
            Statement statement = connection.createStatement();
            // Tiempo máximo para las consultas SQL (30 segundos)
            // Esto da un tiempo de 30 s para esperar a que la BD responda
            statement.setQueryTimeout(30); 

            // Llamada a las operaciones CRUD
            createTable(statement); // Crear la tabla
            insertData(statement); // Insertar datos en la tabla
            readData(statement);   // Leer datos de la tabla
            updateData(statement); // Actualizar datos en la tabla
            readData(statement);   // Leer datos de nuevo para verificar los cambios
            deleteData(statement); // Borrar un registro
            readData(statement);   // Leer datos para verificar el registro eliminado
        } catch (SQLException e) {
            e.printStackTrace(System.err); // Manejo de excepciones SQL
        }
    }

    /**
     * Crea una tabla llamada "usuario" en la base de datos.
     * Si la tabla ya existe, se elimina primero.
     * 
     * @param statement Objeto Statement para ejecutar consultas SQL.
     * @throws SQLException Si ocurre un error durante la ejecución de la consulta.
     */
    public static void createTable(Statement statement) throws SQLException {
        System.out.println("Creando la tabla...");
        statement.executeUpdate("drop table if exists usuario"); // Eliminar tabla si ya existe
        statement.executeUpdate("create table usuario (id integer, nombre string, contrasena string)"); // Crear tabla
        System.out.println("Tabla 'usuario' creada con éxito.\n");
    }

    /**
     * Inserta datos de ejemplo en la tabla "usuario".
     * 
     * @param statement Objeto Statement para ejecutar consultas SQL.
     * @throws SQLException Si ocurre un error durante la ejecución de la consulta.
     */
    public static void insertData(Statement statement) throws SQLException {
        System.out.println("Insertando datos...");
        statement.executeUpdate("insert into usuario values(1, 'valeria', 'airelav')");
        statement.executeUpdate("insert into usuario values(2, 'enrique', 'fierro')");
        statement.executeUpdate("insert into usuario values(3, 'almamariarico', 'arim')");
        System.out.println("Datos insertados con éxito.\n");
    }

    /**
     * Lee y muestra todos los datos de la tabla "usuario".
     * 
     * @param statement Objeto Statement para ejecutar consultas SQL.
     * @throws SQLException Si ocurre un error durante la ejecución de la consulta.
     */
    public static void readData(Statement statement) throws SQLException {
        System.out.println("Leyendo datos de la tabla...");
        ResultSet resultSet = statement.executeQuery("select * from usuario"); // Leer todos los registros
        while (resultSet.next()) {
            System.out.println("ID: " + resultSet.getInt("id") + 
                               ", Nombre: " + resultSet.getString("nombre") + 
                               ", Contraseña: " + resultSet.getString("contrasena"));
        }
        System.out.println("Lectura de datos completada.\n");
    }

    /**
     * Actualiza el registro de un usuario en la tabla "usuario".
     * Cambia el nombre y la contraseña de un usuario con ID = 1.
     * 
     * @param statement Objeto Statement para ejecutar consultas SQL.
     * @throws SQLException Si ocurre un error durante la ejecución de la consulta.
     */
    public static void updateData(Statement statement) throws SQLException {
        System.out.println("Actualizando datos...");
        statement.executeUpdate("update usuario set nombre = 'valeria_actualizada', contrasena = 'nuevacontra' where id = 1");
        System.out.println("Datos actualizados con éxito.\n");
    }

    /**
     * Elimina un registro de la tabla "usuario".
     * Borra el usuario con ID = 2.
     * 
     * @param statement Objeto Statement para ejecutar consultas SQL.
     * @throws SQLException Si ocurre un error durante la ejecución de la consulta.
     */
    public static void deleteData(Statement statement) throws SQLException {
        System.out.println("Eliminando datos...");
        statement.executeUpdate("delete from usuario where id = 2");
        System.out.println("Datos eliminados con éxito.\n");
    }
}
