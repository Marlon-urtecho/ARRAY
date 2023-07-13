package Heap_Sort;

import java.util.Scanner;

public class Heap_Sort_Main {

	public static void main(String[] args) {
		
		Scanner tecla = new Scanner(System.in);
		// Llame al método de la calse Help_Sort aquí
		Heap_Sort hs = new Heap_Sort();
		
		
		System.out.print("Ingrese el numero de elementos: ");
        int a = tecla.nextInt();
        int A[] = new int[a];
        System.out.println("Ingrese los elementos: ");
        for (int i = 0; i < a; i++) {
            A[i] = tecla.nextInt();
        }
        
        tecla.close();
        hs.sort(A);
        System.out.println("Arreglo Ordenado del Heap es:");
        for (int num : A) {
            System.out.print(num + " ");
        }

	}

}
