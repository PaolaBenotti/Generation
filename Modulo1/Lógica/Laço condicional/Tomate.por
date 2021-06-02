programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro P, E = 0.0, M =0.0
		

		escreva("\nEntre com o peso os tomates em quilos: ")
		leia(P)

		se(P>50)
		{
			escreva("\nPeso em excesso, você deverá pagar uma multa de R$4,00 por quilo excedente")
			E = P-50
			M = E*4.0
		}
		senao se (P<=50)
		{
			escreva("\nPeso aceital")
		}

		     escreva("\nExcesso de ",E, "kg")
		     escreva("\nMulta de R$", M)
	}
}


		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 197; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */