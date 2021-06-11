package Paola;

public class Preguiça extends ClasseAnimal {
	
	public Preguiça()
	{
		super("Preguiça");
	}
	
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome da preguiça: "+nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal)
	{
		System.out.println("\nIdade: "+idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal)
	{
		System.out.println("\nO som emitido é: "+somAnimal);
	}
	
	public void subirArvores()
	{
		System.out.println("\nAs preguiças sobem em árvores.");
	}

}
