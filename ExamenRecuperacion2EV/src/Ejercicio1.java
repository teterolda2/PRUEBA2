
import java.util.*;

public class Ejercicio1 {

    
    public static void main(String[] args) {
        int aux, numero, pos=0;
        int count=0;
        int[] num = {5,6,8,2,1,4,7,3,6,9};
        System.out.println("USAMOS EL METODO BURBUJA.");
        System.out.println("Array sin ordenar:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        
   
        
        System.out.println(" ");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < num.length-1; i++) {
            System.out.println("Pasada numero: "+(i+1));
            for (int j = 0; j < num.length-i-1; j++) {
                if (num[j]<=num[j+1]) {
                    aux=num[j+1];
                    num[j+1]=num[j];
                    num[j]=aux;
                }
            }
            for (int j = 0; j < num.length; j++) {
                System.out.print("["+num[j]+"]");
            }
            System.out.println(" ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEl array ordenado descendentemente es: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("¿Que valor desea buscar?");
        numero=sc.nextInt();
        
        for (int i = 0; i < num.length; i++) {
            if (numero==num[i]) {
                count++;
                pos=i;
            }
        }
        
        if (count==0) {
            System.out.println("No existe este numero en el array");
        }else{
        System.out.println("Se ha/n encontrado "+count+" numero/s igual/es");
        System.out.println("El numero encontrado es: "+numero+" en la posicion: "+pos);
        
            if (count>1) {
                System.out.println("Se ha señalado la primera coincidencia del numero");
            }
        }
        //METODO BURBUJA
        //METODO BURBUJA
        //METODO BURBUJA
        //METODO BURBUJA
        //METODO BURBUJA
        //METODO BURBUJA
        //METODO BURBUJA
        //METODO BURBUJA
        //METODO BURBUJA
        //METODO BURBUJA
        //METODO BURBUJA
        //METODO BURBUJA
        
    }
    
}
