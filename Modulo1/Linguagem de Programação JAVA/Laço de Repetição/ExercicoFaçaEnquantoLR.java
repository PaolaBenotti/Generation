package Paola;

import java.util.Scanner;

public class ExercicoFa�aEnquantoLR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num,media, soma=0;
		
        Scanner leia = new Scanner(System.in);
		
		
		
		do
		{
			System.out.println("\nEntre com um n�mero: ");
		    num = leia.nextFloat();
		    
		    soma += num;
		
		}
		while(num!=0);
				
		System.out.println("\nA soma dos n�meros digitados: "+soma);
		
			

	}

}
