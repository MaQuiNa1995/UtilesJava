package es.cic.christian.utiles;

import java.util.logging.Logger;

public class Validaciones {

    /**
     * Método para validar una cadena con un patrón dado
     *
     * @param palabraValidar palabra a validar
     * @param patron patron a usar
     * @return booleano con el exito de la operacion
     */
    public boolean validarCadena(String palabraValidar, String patron) {

        return palabraValidar.matches(patron);

    }
    private static final Logger LOG = Logger.getLogger(Validaciones.class.getName());

}
