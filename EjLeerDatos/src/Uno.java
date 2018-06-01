/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author alumno
 */
public class Uno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f1 = new File(JOptionPane.showInputDialog("Introduce la direccion"));
        FileInputStream in = null;
        
        
            try{
                in = new FileInputStream(f1);
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
                try{
                    
                in.close();
                }catch(IOException e){
                    e.getMessage();
                }
            
            
            
            
//            System.out.println("El directorio existe: "+f1.getName());
//        }else{
//            System.out.println("El directorio no existe"+f1.getName());
//        }
//        
//         if (f1.canRead()){
//            System.out.println("El directorio existe y tiene permiso de lectura");
//        }else{
//             System.out.println("El directorio existe y no tiene permisos de lectura");
//         }
    }
    }
    }

