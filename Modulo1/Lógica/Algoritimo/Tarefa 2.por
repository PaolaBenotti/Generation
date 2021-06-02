programa
{
	
	funcao inicio()
	{ // 2.Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
		
		inteiro dias, anos, meses, totalDias, totalAnos, totalMeses

		escreva("\nEntre com a quantidade de dias ")
		leia(dias)
		escreva("\nEntre com a qauntidade de meses ")
		leia(meses)
		escreva("\nEntre com a qauntidade de anos ")
		leia(anos)

		totalDias = anos*365 + meses*30 + dias

		escreva("\nTotal de dias: ",totalDias)

		totalMeses = anos*12 

		escreva("\nTotal de meses: ",totalMeses)

		totalAnos = dias/365

		escreva("\nTotal de anos: ",totalAnos)




	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 572; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */