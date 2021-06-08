package Paola;

public class Tarefa1Part1 {
	
	//declaração dos atributos
	private String nome;
	private String especie;
	private String raca;
	private int idade;
	
	public Tarefa1Part1(String nome,String especie,String raca,int idade)
	{
		this.nome = nome;
		this.especie = especie;
		this.raca = raca;
		this.idade = idade;
		
	}
	public Tarefa1Part1(String nome,int idade)
	{
		this.nome = nome;
		this.idade = idade;
	}
	public void imprimirInfo()
	{
		System.out.println(nome+" é um(a)"+ especie +" da raça "+raca+" com "+idade+" anos");
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
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
