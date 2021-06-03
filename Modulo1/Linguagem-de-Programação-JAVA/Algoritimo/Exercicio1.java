package Paola; //1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
                //dias e mostre-a expressa apenas em dias.

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anos, meses,dias = 0,totald;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a quantidade de anos: ");
		anos = (int) leia.nextFloat();
		System.out.println("\nEntre com a quantidade de meses: ");
		meses = (int) leia.nextFloat();
		
		totald = anos*365 + meses*30 + dias;
		
		System.out.println("\nTotal de dias vividos: "+totald);
				

	}

}
