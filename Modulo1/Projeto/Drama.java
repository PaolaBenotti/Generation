package Projeto;

import java.util.Scanner;

public class Drama extends Filme {
	
	Scanner read = new Scanner(System.in);
	
	
	public Drama (String nome, String categoria, int duracao, String classificacaoIndicativa, 
			int momento, String descricao)
	{
		super(nome,"Drama",duracao,classificacaoIndicativa,momento,descricao);
		
	}
	
	@Override
	
	public void mensagemInicio() {
		
		int n = (int) (Math.random()*4.0);
		
		switch(n)
		{
		case 0:
			System.out.println ("Odeio não conseguir te odiar por mais que eu tente ou por menos que você faça...");
			break;
		case 1:
			System.out.println ("As vezes é preciso esquecer o passado para que se tenha um futuro.");
			break;
		case 2:
			System.out.println ("Okay?...Okay");
			break;
		default:	
			System.out.println ("A única coisa pela qual se vale a pena viver.");

		}
	}
	
	@Override
	 
	public void efeitoVisual() {
		
		int n = (int) (Math.random()*4.0);
		
		switch(n)
		{
		case 0:
			System.out.println (""	 __        ______   ____    ____  _______ 
					            + " |  |      /  __  \  \   \  /   / |   ____|
					            + " |  |     |  |  |  |  \   \/   /  |  |__   
					            + " |  |     |  |  |  |   \      /   |   __|  
					            + " |  `----.|  `--'  |    \    /    |  |____ 
					            + " |_______| \______/      \__/     |_______|
					            + "");
			break;
		case 1:
			System.out.println (""      _______   
				                 + "   /  /___ \  
				                 + "  /  /  __) | 
				                 + " <  <  |__ <  
				                 + "  \  \ ___) | 
				                 + "   \__\____/ "");

		}
	}

}
