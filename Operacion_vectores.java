package Arreglos;

import java.util.Scanner;

public class Operacion_vectores {

	public static void main(String[] args) {
   // TODO Auto-generated method stub
   Scanner tc = new Scanner(System.in); 
		
	int[] pvector;	
	int [] svector;
	int n = 0, valor = 0 ; 
    int  producto = 0;
	double mod =0, z =0;
	//rellenamdo arreglos 
	
    //para vector 1 
    System.out.println("Ingrese la cantiadad de valores del primer vector");
	n = tc.nextInt();
	pvector = new int [n];
	
	for(int i = 0;i < n; i++ )
	{
		System.out.println("Ingrese valores");
		valor=tc.nextInt(); 
		pvector[i]=valor;
	}
	
	//para vector 2 
	System.out.println("Ingrese la cantiadad de valores del segundo  vector");
	n = tc.nextInt();
	svector = new int [n];	
	
	for(int i = 0;i < n; i++ )
	{
		System.out.println("Ingrese valores");
		valor=tc.nextInt(); 
		svector[i]=valor;
	}
	
	//determi9nar producto punto
	for(int i = 0;i < n; i++ )
	{	
	 producto = producto+(pvector[i]*svector[i]);
	
	double potencia =  Math.pow(pvector[i], 2)+Math.pow(svector[i], 2) ;
	 mod = Math.sqrt(potencia);
	 double Z = producto/mod;
	}
	System.out.println("el producto del vector es:"+producto);
	System.out.println("el producto delos modulos es:"+mod);
	System.out.println("el valor de z es:"+z);
	
	
	
		
	}

}
