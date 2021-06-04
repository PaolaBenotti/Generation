package Paola;

import java.util.Scanner;

public class ExercicioEnquantoLR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		float x=0,menosv=0,maisc=0,cont=0,somamaisc=0,somamenosv=0,meio=0;
		int idade=0;
        Scanner leia = new Scanner(System.in);
		
		
		
		while(idade!=-99)
		{System.out.println("\nEntre com sua idade: ");
		idade = leia.nextInt();
		
		x++;
		
			if(idade<=21)
			{
				menosv++;
				System.out.printf("\nVocê tem até 21 anos! ");
				
			}
			else if (idade>=50)
			{
				maisc++;
				System.out.printf("\nVocê tem mais 50 anos! ");
			}
			else if (idade>=22 && idade<=49)
			{
				meio++;
				System.out.printf("\nSua idade está entre 22 e 49 anos! ");
			}
			System.out.println("\nEntre com sua idade: ");
			idade = leia.nextInt();
		}
		
		    System.out.println("\nTotal de pessoas: "+(x-1));
			System.out.println("\nTotal de pessoas com menos de 21 anos: "+menosv);
			System.out.println("\nTotal de pessoas com mais de 50 anos: "+maisc);		
		
		}
}


