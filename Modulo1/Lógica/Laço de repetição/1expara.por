programa
{
	
	funcao inicio()
	{
		real salario, somasalario=0.0, mediasalario, mediafilhos, maiorsalario=0.0, percentual
		inteiro filhos, somafilhos=0, cont100=0, x, hab
		cadeia nome
		     
		     escreva("\nEscreva a quantidade de habitantes: ")
		     leia(hab)
		     escreva("\nEntre com o nome do habitante")
               leia(nome)
              

		para(x=1;x<=20;x++)
		{
			escreva("\nDigite seu salário: ")
			leia(salario)
			escreva("\nDigite a quantidade de filhos" )
			leia(filhos)

			somasalario = somasalario + salario
			somafilhos = somafilhos + filhos

			se(maiorsalario<salario)
			{
				maiorsalario = salario				
			}
			se(salario<=100)
			{
				cont100++
			}
			mediasalario = somasalario / 20
			mediafilhos = somafilhos / 20
			percentual = (cont100*100) / 20

			escreva("\nMédia salarial",mediasalario)
			escreva("\nMédia de filhos",mediafilhos)
			escreva("\nMaior salário",maiorsalario)
			escreva("\nPercentual de habitantes com até R$100,00 de renda",percentual)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 997; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */