package Paola; // 2.Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dias, anos, meses, totalDias, totalAnos, totalMeses;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre coma quantidade de dias: ");
	    dias = leia.nextInt();
	    System.out.println("\nEntre coma quantidade de meses: ");
	    meses = leia.nextInt();
	    System.out.println("\nEntre coma quantidade de anos: ");
	    anos = leia.nextInt();
	    
	    totalDias = anos* + meses*30 + dias;
	    
	    System.out.println("\nTotal de dias: "+totalDias);
	    
	    totalMeses = anos*12;
	    
	    System.out.println("\nTotal de Meses: "+totalMeses);
	    
	    totalAnos = dias/365;
	    
	    System.out.println("\nTotal de Anos: "+totalAnos);
	    	

	}

}
