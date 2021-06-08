package Paola;

public class Tarefa2Part1 {
	
	//declaração dos atributos
		private String nomePassageiro;
		private String origem;
		private String destino;
		private String hora;
		private int data;
		

		public Tarefa2Part1(String nomePassageiro, String origem,String destino,String hora,int data)
		
		{
			this.nomePassageiro = nomePassageiro;
			this.origem = origem;
			this.destino = destino;
			this.hora = hora;
			this.data = data;
			
		}
		public Tarefa2Part1(String nomePassageiro,int data)
		{
			this.nomePassageiro = nomePassageiro;
			this.data = data;
		}
		public void imprimirInfo()
		{
			System.out.println(nomePassageiro+" possui uma passagem de "+ origem +" para: "+destino+" às "+hora+" em "+data);
		}
		public String getNomePassageiro() {
			return nomePassageiro;
		}
		public void setNomePassageiro(String nomePassageiro) {
			this.nomePassageiro = nomePassageiro;
		}
		public String getOrigem() {
			return origem;
		}
		public void setOrigem(String origem) {
			this.origem = origem;
		}
		public String getDestino() {
			return destino;
		}
		public void setDestino(String destino) {
			this.destino = destino;
		}
		public String getHora() {
			return hora;
		}
		public void setHora(String hora) {
			this.hora = hora;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		

}
