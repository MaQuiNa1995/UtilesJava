package es.cic.christian.utiles;

import javax.swing.JOptionPane;

public class OutputBox {

    /**
     * Muestra un Cuadro De Dialogo
     *
     * @param titulo titulo a mostrar
     * @param contenido contenido a mostrar
     * @param tipoPanel tipo de panel a usar
     */
    public void mostrarModal(String titulo, String contenido, int tipoPanel) {
        JOptionPane.showMessageDialog(null, contenido, titulo, tipoPanel);
    }

    /**
     * Método que pide al usuario algo a traves de un modal
     * 
     * @param titulo titulo a mostrar
     * @param contenido contenido a mostrar
     * @return respuesta del usuario
     */
    public String pedirString(String titulo, String contenido) {

        String cadenaRecibida = JOptionPane.showInputDialog(null, contenido, titulo, 1);

        return cadenaRecibida;
    }

}
