package Paola;

public class Tarefa2Part2 {
	
	public static void main(String[] args) {
		
		Tarefa2Part1 pass1 = new Tarefa2Part1("Paola Benotti","S�o Paulo","Italia","14h",2022);
		
		pass1.imprimirInfo();
		System.out.println("\nAltera��o da hor�rio:");
		pass1.setHora("16:45");
		pass1.imprimirInfo();
		
	}

}
