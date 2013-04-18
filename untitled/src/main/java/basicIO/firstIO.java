package basicIO;

import java.io.*;

/**
 * Project：studyIO
 * User: Administrator
 * Date: 13-4-16
 * Time: 下午9:11
 * Usage:
 */
public class firstIO {

    //inputStream
    private ByteArrayInputStream bais;
    private FilterInputStream filteris;
    private StringBufferInputStream sbis;
    private FileInputStream fileis;
    private PipedInputStream pis;
    private SequenceInputStream sis;

    private BufferedInputStream bis;
    private LineNumberInputStream lnis;
    private DataInputStream dis;
    private PrintStream ps;

    //outputStream
    private FilterOutputStream filteros;
    private ByteArrayOutputStream baos;
    private FileOutputStream fileos;
    private PipedOutputStream pos;


    /**
     *
     * @param args
     */
    public static void main(String[] args){
        System.out.println("hello IO");
        System.out.println("hello git");
    }
}
