package MenuLogin;

import java.util.Scanner;

public class EjercicioMenu {

	public static void main(String[] args) {
	//Este programa tiene un usuario que permite accerder a un menu
    Scanner tec = new Scanner(System.in);
		
	//Declarando variables	
     String user = "sistemas";
	 int pass = 2023;	
	 String temU;
	 int temP;	
	 int count = 1;	
	 char menu;	
	 int cash = 0 ;
     int aux, total = 0;
     
	 
	 //leer la info del usuario
	do {
	  System.out.println("Ingrese el nombre del usuario");
	  temU = tec.nextLine();
		
	  
	  System.out.println("Ingrese la contraseña");
	  temP = tec.nextInt();
	  tec.nextLine(); //salto de linea
	  
	  if(temU.equals(user) && temP == pass)//comparando para validar
	  {
          System.out.println("Acceso concedido!");
         
       //mostrando el menu de opcones 
   
        System.out.println("menu de opciones");
        System.out.println("a.Registrar");  
        System.out.println("b.Realizar tramite");  
        System.out.println("c.imprimir factura"); 
        System.out.println("d.salir del menu"); 
        
       do {
        //leyendo la opcion del ususario
    	 System.out.println("**************************");
           
    	 System.out.println("Ingresa una opcion del menu");
        
        menu = tec.nextLine().charAt(0);       
        System.out.println(" "); 
         	
        switch(menu)
        {
        	
        case 'a':	
        	System.out.println("Registrar cantidad de efectivo");
        	cash = tec.nextInt();
        
        case 'b':	
        	System.out.println("cuantas unidades de telefonos desea comprar");
            aux = tec.nextInt();
            tec.nextLine();	
  
        total = aux * 200;             	
        cash = cash-total;   
        break;
        
        case 'c':		
        	System.out.println("El monto total es: " + total);
        	System.out.println("cambio o credito: " + cash);
        	break;
        
        case 'd':	
        	System.out.println("ha salido del programa");
            menu = 'd';
        break;  
       
        default:	
        	System.out.println("Opción inválida, intenta de nuevo");
        
        }
            
     }while(menu != 'd');
        
        return; 
	  }
	    System.out.println("los datos no son validos ingresar de nuevo la contraseña");
        count++;
      }while (count <= 3); //  Para después de 3 intentos el programa se detiene
       System.out.println("Ha execido los intentos");
     }

	
		
	}

