package Paola;

import java.util.Scanner;

public class La�oCondicional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3, maior;
		
        Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro n�mero: ");
	    n1 = leia.nextInt();
	    
	    System.out.println("\nEntre com o segundo n�mero: ");
	    n2 = leia.nextInt();
	    
	    System.out.println("\nEntre com o terceiro n�mero: ");
	    n3 = leia.nextInt();
	    
	    maior = n1;
	    
	    if(maior>n2)
	    {
	    	maior = n2;
	    }
	    else if(maior<n3)
	    {
	    	maior = n3;
	    }
	    
	    	System.out.println("\nEste � o maior n�mero: "+maior);
	    

	}

}
