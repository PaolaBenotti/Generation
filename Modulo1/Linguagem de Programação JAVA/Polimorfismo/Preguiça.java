package Paola;

public class Pregui�a extends ClasseAnimal {
	
	public Pregui�a()
	{
		super("Pregui�a");
	}
	
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome da pregui�a: "+nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal)
	{
		System.out.println("\nIdade: "+idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal)
	{
		System.out.println("\nO som emitido �: "+somAnimal);
	}
	
	public void subirArvores()
	{
		System.out.println("\nAs pregui�as sobem em �rvores.");
	}

}
