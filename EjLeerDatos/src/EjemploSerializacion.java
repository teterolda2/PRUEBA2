
import java.io.FileOutputStream;
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class EjemploSerializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        FileOutputStream fs = new FileOutputStream("serializacion.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fs);
        
        Persona p = new Persona("MARIA", "55549533333R");
        Persona p2= new Persona("PABLO", "22222222222P");
        Persona p3 = new Persona("JOSE", "33333333333X");
        Persona p4 = new Persona("JESUS", "444444444S");
        
        oos.writeObject(p);
        oos.writeObject(p2);
        oos.writeObject(p3);
        oos.writeObject(p4);
        
        FileInputStream fis = new FileInputStream("serializacion.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Persona p5 = (Persona)ois.readObject();
        Persona p6 = (Persona)ois.readObject();
        Persona p7 = (Persona)ois.readObject();  
        Persona p8 = (Persona)ois.readObject();
        
            System.out.println(p5+"\n"+p6+"\n"+p7+"\n"+p8);
        
        }catch(Exception e){
            System.out.println("Error de entrada/salida: "+ e.getMessage());
            }
    }
    
}
