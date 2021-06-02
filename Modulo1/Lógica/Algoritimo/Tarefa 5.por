programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
	// 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final destealuno. 
	//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,respectivamente.
	
		cadeia nome = "Paola"
		real nota1,nota2,nota3,media
		inteiro peso = 5 
		

		escreva("\nA nota da aluna:",nome)
		escreva("\nO peso das notas é:" ,peso)

		escreva("\nEntre com a primeira nota:")
		leia(nota1)
		escreva("\nEntre com a segunda nota:")
		leia(nota2)
		escreva("\nEntre com a terceira nota:")
		leia(nota3)
		
		media = (nota1+nota2+nota3)/3

		escreva("\nMédia Ponderada foi de: ",mat.arredondar(media,2))
	

	

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 303; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */