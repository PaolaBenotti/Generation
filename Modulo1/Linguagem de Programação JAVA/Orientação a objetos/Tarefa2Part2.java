package Paola;

public class Tarefa2Part2 {
	
	public static void main(String[] args) {
		
		Tarefa2Part1 pass1 = new Tarefa2Part1("Paola Benotti","São Paulo","Italia","14h",2022);
		
		pass1.imprimirInfo();
		System.out.println("\nAlteração da horário:");
		pass1.setHora("16:45");
		pass1.imprimirInfo();
		
	}

}
