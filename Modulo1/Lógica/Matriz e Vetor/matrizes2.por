programa
{
	
	funcao inicio()
	{
		inteiro numeros[3][3], soma=0, somadiag=0, linha, coluna, quantidadesoma=0

		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nEntre com um número: ")
				leia(numeros[linha][coluna])
				se(linha==coluna)
				{
					somadiag += numeros[linha][coluna]
				}
			}
		}
		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
										
				soma = soma + numeros[linha][coluna]
				quantidadesoma++
			}
			escreva("\nValor da soma diagonal ",somadiag)
			escreva("\nValor da soma dos valores: ",soma)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 429; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numeros, 6, 10, 7}-{soma, 6, 25, 4}-{somadiag, 6, 33, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */