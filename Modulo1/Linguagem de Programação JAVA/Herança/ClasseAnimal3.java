package Paola;

public class ClasseAnimal3 extends ClasseAnimal {

	private String adotado;
	private String porte;
	
	public ClasseAnimal3(String nome, String especie,String cor,int idade,String adotado,String porte)
	{
		super(nome,especie,cor,idade);
		this.adotado = adotado;
		this.porte = porte;
		
	}

	public String getAdotado() {
		return adotado;
	}

	public void setAdotado(String adotado) {
		this.adotado = adotado;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	public void imprimirInfo()
	 
	{
		System.out.println(getNome()+" é um(a)"+ getEspecie() +" com coloração "+getCor()+" de "+getIdade()+" anos. "+adotado+ "\nDia da adoção"+porte+"porte");
	}
}
