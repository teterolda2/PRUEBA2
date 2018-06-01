
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class ejemplo2 {

    public static String leerCadena(){
        String cad = "";
        BufferedReader br;
        br = new BufferedReader (new InputStreamReader(System.in));
        
        try{
            cad = br.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        return cad;
    }
    
    
    public static void main(String[] args) {
        String cad;
        System.out.println("Este mensaje hace eco hasta que pongas para");
        do{
            cad = leerCadena();
            System.out.println(cad);
        }while(!cad.equals("para"));


    }
    
}
