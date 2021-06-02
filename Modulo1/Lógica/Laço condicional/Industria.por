programa
{
	
	funcao inicio()
	{ 
	     real indice

	     escreva("\nIndique o indice de poluição da indústria")
	     leia(indice)

	     se(indice >= 0.05 e indice <= 0.25)
		{
			escreva("\nÍndice de poluição aceitavel")
		}
		senao se (indice <= 0.3)
		{
			escreva("\nSua indústria faz parte do 1º grupo, será intimada a suspender as atividades")
		}
		senao se (indice <= 0.4)
		{
			escreva("\nSua indústria faz parte do 1º e 2º grupo, será intimada a suspender as atividades")
		}
		senao se (indice <= 0.5)
		{
			escreva("\nTodos os grupos (1º, 2º e 3º grupo) devem suspender as atividades")
		}
	   
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 515; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */