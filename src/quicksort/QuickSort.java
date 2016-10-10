/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Stack;

/**
 *
 * @author Antonio
 */
public class QuickSort {
    static int pInicial, pFinal, aux, pivote;
    static int[] array = { -2, -4, 125, 2, 1, 0, 9 };
    static Stack s = new Stack();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimirArray();
        QuickSort(array, 0, (array.length - 1));
        imprimirArray();

    }

    public static void QuickSort(int[] array, int pInicial, int pFinal) {
        int i = pInicial, f = pFinal;
        pivote = array[(i + f) / 2];
        while (i <= f) {
            while (array[i] < pivote) {
                i++;
            }
            while (array[f] > pivote) {
                f--;
            }
            if (i <= f) {
                aux = array[i];
                array[i] = array[f];
                array[f] = aux;
                i++;
                f--;
            }
        }

        if (pInicial < f) {
            QuickSort(array, pInicial, f);
        } 
        
        if (pFinal > i) {
            QuickSort(array, i, pFinal);
        }
    }
    
    public static void imprimirArray() {
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println("");
    }
}
