package Paola;

import java.util.Scanner;

public class La�oCondicional3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3,ordem;
		
        Scanner leia = new Scanner(System.in);
		
        System.out.println("\nEntre com o primeiro n�mero: ");
	    n1 = leia.nextInt();
	    
	    System.out.println("\nEntre com o segundo n�mero: ");
	    n2 = leia.nextInt();
	    
	    System.out.println("\nEntre com o terceiro n�mero: ");
	    n3 = leia.nextInt();
	    
	    if(n3 < n1)
	    {
	    	ordem =n1; n1 = n3; n3 = ordem;
	    }
	    else if(n2 < n1)
	    {
	    	ordem =n1; n1 = n3; n2 = ordem;
	    }
	    else if(n3 < n2)
	    {
	    	ordem = n2; n2 = n3; n3 = ordem;
	    }
	    
	    System.out.println("\nA ordem crescente �; "+n1+" "+n2+" "+n3+"\n");

	}

}
