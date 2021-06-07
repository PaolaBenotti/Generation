package Paola;

import java.util.Scanner;

public class ArrayVetor2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float [] num = new float[7];
		float impar=0,somapar=0,contpar=0,contimpar=0;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<7;x++)
		{
			System.out.println("\nEntre com um número: ");
		    num[x] = leia.nextInt();
		    
		    if(x%2 ==0)
		    {
		    	somapar = somapar + num[x];
		    	contpar++;
		    }
		    else
		    {
		    	contimpar++;
		    	impar = impar + num[x];
		    
		    }
		}
		
		System.out.println("\nNúmeros pares digitados "+contpar+ " e a soma dos números pares é: "+somapar);
        System.out.println("\nNúmeros impares digitados "+contimpar+ " e a quantidade é: "+impar);
    }
}

