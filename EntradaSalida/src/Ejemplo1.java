
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = new String ("Hola");
        s = s + " que tal";
        s = s + " bien";
        
        char[] arr = new char [s.length()];
        int car = 0;
        StringReader flujoinput=new StringReader(s);
        CharArrayWriter flujooutput = new CharArrayWriter();
        try{
            while((car = flujoinput.read()) != -1){
                flujooutput.write(car);
            }
            arr = flujooutput.toCharArray();
            System.out.println(arr);
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            flujoinput.close();
            flujooutput.close();
        }
    }
    
}
