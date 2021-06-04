package Paola;

import java.util.Scanner;

public class LaçoCondicional2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int categoria, idade;
		
        Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a idade: ");
	    idade = leia.nextInt();
	    
	    if(idade>=10 && idade<=14)
	    {
	    	System.out.println("\nA sua categoria é Infantil: ");
	    }
	    else if(idade>=15 && idade<=17)
	    {
	    	System.out.println("\nA sua categoria é Juvenil: ");
	    }
	    else if(idade>=18 && idade>=25)
	    {
	    	System.out.println("\nA sua categoria é Adulta: ");
	    }
	    
	}

}
