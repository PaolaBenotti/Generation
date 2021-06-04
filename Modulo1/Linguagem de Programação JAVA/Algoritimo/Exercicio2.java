package Paola; //3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
                //expressa em segundos e mostre-o expresso em horas, minutos e segundos.

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int horas,minutos,segundos,ts;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com os segundos: ");
		ts = leia.nextInt();
		
		horas = ts/3600;
		minutos = (ts%3600)/60;
		segundos = (ts%3600)%60;
		
		System.out.println("\nHoras: "+minutos+"\nSegundos"+segundos );
		ts = leia.nextInt();
		
	
	}
}
