package Paola;

import java.util.Scanner;

public class ExercicioParaLR {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num;
		int x,par=0,impar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (x=1;x<10;x++)
		{
		System.out.println("\nEntre com umn�meor:");
		num = leia.nextFloat();
		
		if(num % 2 == 0)
	    {
			par++;
	    }
	    else
	    {
	    	impar++;
	    }
		
		System.out.println("\nnOs n�meros pares s�o: "+impar);
		System.out.println("\nOs n�meros �mpares s�o: "+par);
		
	}
	
	}
}
