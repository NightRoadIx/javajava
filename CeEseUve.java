import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

public class CeEseUve {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {
        // URL del archivo CSV
        String csvUrl = "https://covid.ourworldindata.org/data/owid-covid-data.csv";

        try (
            // Crear un lector para leer el archivo CSV desde la URL
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                    new URL(csvUrl).openStream(), StandardCharsets.UTF_8)
                    );
            // Crear un analizador CSV que interprete el contenido del lector
            CSVParser csvParser = new CSVParser(
                reader, 
                CSVFormat.DEFAULT.withFirstRecordAsHeader()
                );
            )
        {
            // Obtener los encabezados de las columnas del CSV
            String[] headers = csvParser.getHeaderMap().keySet().toArray(new String[0]);
            System.out.println("Encabezado de la tabla");
            for(String header : headers)
                System.out.print(header + "\t\t");

            // Crear un escritor para escribir en un nuevo archivo CSV
            BufferedWriter writer = new BufferedWriter(new FileWriter("coreanovirus.csv"));

            // Obtener los primeros 5 encabezados
            String[] headers5 = new String[5];
            for(int i = 0; i < 5; i++)
            {
                headers5[i] = headers[i];
                System.out.println(headers5[i]);
            }
            // Escribir los encabezados en el nuevo archivo
            writer.write(String.join(",",headers5)+"\n");

            // Escribir las primeras 5 columnas de todas las filas
            for (CSVRecord record : csvParser) {
                for (int i = 0; i < 5; i++) {
                    writer.write(record.get(i));
                    if (i < 4) {
                        writer.write(",");
                    }
                }
                writer.write("\n");
            }
            // Cerrar el escritor después de escribir en el archivo
            writer.close();
            // Mensaje de éxito
            System.out.println("\nArchivo coreanovirus.csv creado exitosamente");

        }
        // Manejar cualquier excepción
        catch(Exception e)
        {
            // Mostrar mensaje de error
            System.out.println("Error mortal");
            System.out.println(e.getMessage());
        }
    }
}
