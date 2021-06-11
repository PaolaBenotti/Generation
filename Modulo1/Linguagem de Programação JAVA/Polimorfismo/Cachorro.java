package Paola;

public class Cachorro extends ClasseAnimal {
	
	public Cachorro()
	{
		super("Cachorro");
	}
	
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome do cachorro/cadela: "+nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal)
	{
		System.out.println("\nIdade: "+idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal)
	{
		System.out.println("\nO som que ele/ela emite: "+somAnimal);
	}
	
	public void Corre()
	{
		System.out.println("\nCachorros amam correr!");
	}
}

