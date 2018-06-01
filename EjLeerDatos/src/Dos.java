/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import javax.swing.*;
/**
 *
 * @author alumno
 */
public class Dos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreFich = JOptionPane.showInputDialog("En que puedo ayudarle");
        String texto = JOptionPane.showInputDialog("Introduzca el texto");
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(nombreFich, true);
            for (int i = 0; i < texto.length(); i++) {
                fos.write(texto.charAt(i));
            }
            fos.close();
        }catch(FileNotFoundException e){
            System.out.println("Fichero no encontrado: "+e.getMessage());
        }catch(IOException e){
            System.out.println("Exception de E-S: "+e.getMessage());
        }
    }
    
}
