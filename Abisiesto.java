package A_Bisiesto;
import java.util.Scanner;
public class Abisiesto {

	public static void main(String[] args) {
		
		// Calculando la entrada del usuario

		Scanner teclado = new Scanner (System.in);
		
		
		int n_1;
		
		System.out.println("Ingrese el year");
		n_1=teclado.nextInt();
		
		if (n_1 % 100 != 0) {
			
			if (n_1 %4 ==0)
			
				System.out.println("Este years es bisiesto");
		
		else 
			
			System.out.println("Este yeasr no es bisiesto");
			
		} else if(n_1 %400==0)
		
				System.out.println("Este yeasr es bisiesto");
		
			else 
				System.out.println("Este yeasr no es bisiesto");
	}

}
