package Paola;

public class ClasseAnimal  {
	
	private String nome;
	private String especie;
	private String cor;
	private int idade;
	
	public ClasseAnimal(String nome, String especie,String cor,int idade)
	{
		super();
		this.especie = especie;
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	

}
