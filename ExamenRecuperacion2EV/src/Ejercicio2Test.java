
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Ejercicio2Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double suma=0; int exc=0;
        Charanga c1 = new Charanga("Parque Placentero", 20, LocalDate.now(), "Concierto de Quasimodo", 200, "El Retiro - Caravaca", false);
        Grupo g1 = new Grupo(5, Grupo.Estilo.Soul, LocalDate.now(), "Concierto: Grupo de musica en contra del Maltrato Animal", 100, "El Retiro - Caravaca", false);
        Grupo g2 = new Grupo(15, Grupo.Estilo.Funky, LocalDate.now(), "Concierto: Grupo de musica Quasimodo Somos Todos", 150, "Pueblo Tomate - Caravaca", false);
        Almuerzo a1 = new Almuerzo(Almuerzo.Tipo.Mediodia, "Macarrones con Tomate", 2000, 50, LocalDate.now(), "Comida de la Parroquia", 300, "Parroquia de Quasimodo", false);
    
        
        
       
        ArrayList<Gasto> conjunto = new ArrayList();
        
        conjunto.add(a1);
        conjunto.add(g2);
        conjunto.add(g1);
        conjunto.add(c1);
        
        
        
        
//                      COMENTADA POR FALTA DE TIEMPO
//    try {
//
//    }catch(Error DemasiadoGastoException){
//        System.out.println("Demasiados gastos del mismo tipo");
//    }


           
        for (int i = 0; i < conjunto.size(); i++) {
            
           suma += conjunto.get(i).getImporte();
            
        }
        System.out.println("El importe de todos los gastos es: "+suma);
        
        Charanga c2 = new Charanga("Pisos Picados", 10, LocalDate.now(), "Semana del culto a Quasimodo", 50, "Cementerio de Caravaca - Caravaca", false);
        conjunto.add(c2);
        
        suma = 0;
        for (int i = 0; i < conjunto.size(); i++) {
            suma += conjunto.get(i).getImporte();
        }
        
        System.out.println("El importe ha cambiado al añadir/pagar Gastos, el nuevo importe es: "+suma);
        
        c1.pagar();
        c2.pagar();
        
        Almuerzo a2 = new Almuerzo(Almuerzo.Tipo.Cena, "Pizza", 20, 2, LocalDate.now(), "Cumpleaños del Monaguillo Jonás", 50, "Iglesia", true);
        conjunto.add(a2);
        suma = 0;
        for (int i = 0; i < conjunto.size(); i++) {
            suma += conjunto.get(i).getImporte();
        }
        System.out.println("El importe ha cambiado al añadir/pagar Gastos, el nuevo importe es: "+suma);
        System.out.println("\n\n");
        
    
        for (int i = 0; i < conjunto.size(); i++) {
            if (i>4){
            System.out.println("¡¡¡ATENCION!!! HAN SIDO AÑADIDOS 5 GASTOS O MAS");
        }
            
            System.out.println("<----------------- Gastos añadidos ----------------->");
            System.out.println(conjunto.get(i).toString());
            
        }
        
    }
    
    
}
