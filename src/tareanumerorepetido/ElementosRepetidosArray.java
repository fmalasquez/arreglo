/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareanumerorepetido;

/**
 *
 * @author Usuario
 */
import java.util.Arrays;
import java.util.Random;
 
public class ElementosRepetidosArray {
     
    public static void main(String[] args) {
        System.out.println();
        int numeros[] = new int[10];
        llenarArray(numeros);
        visualizar(numeros);
        mostrarRepetidos(numeros);
    }
     
    static void mostrarRepetidos(int[] pArray){
        for(int i=0;i<pArray.length-1;i++){
            for(int j=i+1;j<pArray.length;j++){
                if(pArray[i]==pArray[j]){
                    System.out.println("Elemento repetido: " + pArray[i]);
                }
            }
        }
    }
    static void visualizar(int[] pArray){
        System.out.println(Arrays.toString(pArray));
    }
     
    static void llenarArray(int[] pArray){
        Random r = new Random();
        for(int i=0;i<pArray.length;i++){
            pArray[i] = r.nextInt(20) + 1;
        }
    }
}
