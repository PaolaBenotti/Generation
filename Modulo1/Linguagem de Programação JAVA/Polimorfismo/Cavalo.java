package Paola;

public class Cavalo extends ClasseAnimal {
	
	public Cavalo()
	{
		super("Cavalo");
	}
	
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome do cavalo: "+nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal)
	{
		System.out.println("\nIdade: "+idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal)
	{
		System.out.println("\nO som que o seu animal emite é o: "+somAnimal);
	}
	
	public void Corre()
	{
		System.out.println("\nCavalos/Éguas correm rápido");
	}
	

}
