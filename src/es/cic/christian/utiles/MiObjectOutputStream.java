/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cic.christian.utiles;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

public class MiObjectOutputStream extends ObjectOutputStream {

    /**
     * Constructor que recibe OutputStream
     *
     * @param out
     * @throws java.io.IOException
     */
    public MiObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    /**
     * Constructor sin parámetros
     *
     * @throws java.io.IOException
     */
    protected MiObjectOutputStream() throws IOException, SecurityException {
        super();
    }

    /**
     * Redefinición del método de escribir la cabecera para que no haga nada.
     *
     * @throws java.io.IOException
     */
    @Override
    protected void writeStreamHeader() throws IOException {
        
    }
    
    private static final Logger LOG = Logger.getLogger(MiObjectOutputStream.class.getName());

}
