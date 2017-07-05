package es.cic.christian.utiles;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Logger;

/**
 * Clase para la gestion de ficheros
 *
 * @author cmunoz
 */
public class GestionFicheros {

    /**
     * Log genérico de la clase
     */
    private static final Logger LOG = Logger.getLogger(GestionFicheros.class.getName());

    /**
     * Método para escribir cadenas con saltos de línea en fichero
     *
     * @param contenido contenido a escribir en el fichero
     * @param rutaFichero Contiene la ruta del fichero y extension
     * @param sobreEscribir Controla si el nuevo contenido sobreescribirá o se
     * añadirá al fichero
     */
    public void escribirFichero(String contenido,
            String rutaFichero,
            boolean sobreEscribir) {

        try (FileWriter escribirFichero = new FileWriter(rutaFichero, sobreEscribir)) {

            escribirFichero.write(contenido + "\n");

        } catch (IOException error) {
            LOG.warning("Error al escribir en el fichero: ".concat(error.getMessage()));
        }

    }

    public void leerFichero(String NombreFichero) {
        try (BufferedReader leerFichero = new BufferedReader(new FileReader(NombreFichero))) {

            String lineaLeida;

            while ((lineaLeida = leerFichero.readLine()) != null) {
                System.out.println(lineaLeida);
            }

        } catch (IOException error) {
            LOG.warning("Error al leer el fichero: ".concat(error.getMessage()));
        }

    }

    public void escribirObjetoFichero(String rutaArchivo,
            Object objeto,
            boolean sobreEscribir) {

        try (FileOutputStream fos = new FileOutputStream(rutaArchivo, sobreEscribir);
                ObjectOutputStream oos = new MiObjectOutputStream(fos)) {

            oos.writeObject(objeto);

        } catch (IOException error) {
            LOG.warning("Error al meter objeto en el fichero: ".concat(error.getMessage()));
        }

    }

}
