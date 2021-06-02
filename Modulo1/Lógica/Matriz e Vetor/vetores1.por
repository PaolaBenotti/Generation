programa
{
	
	funcao inicio()
	{
		real leitura[5], maiorpont=0.0
		inteiro x

		para(x=0;x<5;x++)
		{
			escreva("\nEntre com uma pontuação: ")
			leia(leitura[x])

			se(leitura[x]>maiorpont)
			{
				maiorpont = leitura[x]
			}
			
		}
		limpa()
		para(x=0;x<5;x++)
		{
			escreva("\nPontuação [",(x+1), "] =",leitura[x])
		}

			escreva("\nA maior pontuação é: ",maiorpont)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 335; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */