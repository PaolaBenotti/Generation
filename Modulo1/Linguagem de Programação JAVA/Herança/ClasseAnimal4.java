package Paola;

public class ClasseAnimal4 extends ClasseAnimal{
	
	private String resgatado;

	
	public ClasseAnimal4(String nome, String especie,String cor,int idade,String resgatado)
	{
		super(nome,especie,cor,idade);
		this.resgatado = resgatado;
		
	}


	public String getResgatado() {
		return resgatado;
	}


	public void setResgatado(String resgatado) {
		this.resgatado = resgatado;
	}
	
	public void imprimirInfo()
	 
	{
		System.out.println(getNome()+" é um(a)"+ getEspecie() +" com coloração "+getCor()+" de "+getIdade()+" anos. \nMês do resgate:"+resgatado);
	}

	
}
