programa
{
	
	funcao inicio()
	{
		inteiro valor=0,valorsoma=0, valorcont=0,valormedia

		escreva("\nEntre com um valor:" )
		leia(valor)

		enquanto(valor>=0)
		{
			valorsoma = valorsoma + valor
			valorcont++
			escreva("\nEntre com o valor:")
			leia(valor)
		}
		se(valorcont==0)
		{
			escreva("\nNão é possivel dividir por zero!")
			
		}
		senao
		{
		
		valormedia = valorsoma / valorcont
		
		escreva("\nSomatório dos valores: ",valorsoma)
		escreva("\nQuantidade de valores: ",valorcont)
		escreva("\nMédia de valores: ",valormedia)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 552; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */