package Paola;

public abstract class ClasseAnimal  {
	
private String tipoAnimal;
	
	abstract public void Nome(String nomeAnimal);
	abstract public void Idade(int idadeAnimal);
	abstract public void Som(String somAnimal);
	
	public ClasseAnimal(String tipoAnimal)
	{
		this.tipoAnimal = tipoAnimal;
	}
	
	public String getTipoAnimal() {
		return tipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
	
}
