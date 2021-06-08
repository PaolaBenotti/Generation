package Paola;

public class Tarefa1Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			Tarefa1Part1 cliente1 = new Tarefa1Part1("Augustinho"," Felis catus"," Bengal",5);
			
			cliente1.imprimirInfo();
			System.out.println("\nAlteração na raça");
			cliente1.setRaca(" Toyger");
			cliente1.imprimirInfo();

	}

}
