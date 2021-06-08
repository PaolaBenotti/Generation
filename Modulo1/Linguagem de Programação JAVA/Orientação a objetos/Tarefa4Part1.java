package Paola;

public class Tarefa4Part1 {
	
	private String nome;
	private String cargo;
	private String empresa;
	private int periodo;
	
	public Tarefa4Part1 (String nome,String cargo,String empresa,int periodo)
	{
		this.nome = nome;
		this.cargo = cargo;
		this.empresa = empresa;
		this.periodo = periodo;
		
	}
	public Tarefa4Part1(String nome,int perido)
	{
		this.nome = nome;
		this.periodo = perido;
	}
	public void imprimirInfo()
	{
		System.out.println(nome+" é "+cargo+" da "+empresa+" no periodo "+periodo);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	

}
