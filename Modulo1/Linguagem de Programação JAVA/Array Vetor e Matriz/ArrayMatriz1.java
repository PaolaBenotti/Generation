package Paola;

import java.util.Scanner;

public class ArrayMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int linha = 3, coluna = 3;
		int[][] num = new int [linha][coluna]; //new int [3][3];
		int contmaior=0,l,c,maior=0;
		
		Scanner leia = new Scanner(System.in);
		for(l=0;l<linha;l++)
		{
			for(c=0;c<coluna;c++)
			{
				System.out.println("\nEntre com um número: ");
		        num[l][c] = leia.nextInt();
		        
		        if(num[l][c]>10)
		        {
		        	maior = maior + 1;
		        	
		        }
			}     
		}
		
		System.out.printf("\nValores maiores do que 10 é: "+maior);

	}

}
