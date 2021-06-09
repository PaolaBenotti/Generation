package Paola;

public class ClasseAnimal2 extends ClasseAnimal {

	private String porte;
	
	
	
	public ClasseAnimal2(String nome, String especie,String cor,int idade,String porte)
	{
		super(nome,especie,cor,idade);
		this.porte = porte;
		
	}
        
		public String getPorte() {
		return porte;
	}

	    public void setPorte(String porte) {
		this.porte = porte;
	}


	public void imprimirInfo()
 
	{
		System.out.println(getNome()+" � um(a)"+ getEspecie() +" com colora��o "+getCor()+" de "+getIdade()+" anos e porte "+getPorte());
	}


}
