
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yo
 */
public class Tres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FileReader f1=null;
        try {
            f1 = new FileReader(JOptionPane.showInputDialog("Introduce la direccion"));
            BufferedReader in = new BufferedReader(f1);
                String s="";
                int i = 0;
                
                while ((i=in.read())!=-1){
                    s=s+(char)i;
                }
                JOptionPane.showMessageDialog(null, s);
            }catch(FileNotFoundException e){
                JOptionPane.showMessageDialog(null, "No se ha encontrado el fichero");
            }catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error de entrada/salida");
            }finally{
                 
                
    }
    }

}