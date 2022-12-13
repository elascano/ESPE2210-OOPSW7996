
package ec.edu.espe.vinylrecord.controller;

import java.io.*;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class MiObjectOutputStream extends ObjectOutputStream
{
    protected void writeStreamHeader() throws IOException{
        
    }
    public MiObjectOutputStream() throws IOException
    {
        super();
    }
    public MiObjectOutputStream(OutputStream out) throws IOException{
        super(out);
    }
}
