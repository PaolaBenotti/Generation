programa
{
	
	funcao inicio()
	{ // 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
      //expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		
		inteiro horas,minutos,segundos,ts

		escreva("\nEntre com o total de segundos do evento: ")
		leia(ts)

		horas = ts / 3600
		minutos = (ts % 3600) / 60
		segundos = (ts % 3600) % 60

		escreva("\nHoras: ",horas,"\nMinutos: ",minutos,"\nSegundos: ",segundos)
		


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 470; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */