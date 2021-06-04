package Paola;

import java.util.Scanner;

public class LaçoCondicional3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3,ordem;
		
        Scanner leia = new Scanner(System.in);
		
        System.out.println("\nEntre com o primeiro número: ");
	    n1 = leia.nextInt();
	    
	    System.out.println("\nEntre com o segundo número: ");
	    n2 = leia.nextInt();
	    
	    System.out.println("\nEntre com o terceiro número: ");
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
	    
	    System.out.println("\nA ordem crescente é; "+n1+" "+n2+" "+n3+"\n");

	}

}
