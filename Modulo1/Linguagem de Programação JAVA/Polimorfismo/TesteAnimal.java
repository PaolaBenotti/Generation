package Paola;

import java.util.Scanner;

public class TesteAnimal {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner leia = new Scanner(System.in);
			
			Cachorro cachorro = new Cachorro();
			Cavalo cavalo = new Cavalo();
			Preguiça preguica = new Preguiça();
			
			ClasseAnimal animal = null;
			
			int x;
			do
			{
				System.out.println("\nQual o tipo do seu animal???\n\n1-Cachorro\n2-Cavalo\n3-Preguiça\n");
				x = leia.nextInt();
				if(x==1)
				{
					animal=cachorro;
					System.out.println("\nQual o nome do cachorro/cadela?");
					String nome = leia.next();
					System.out.println("\nQuantos anos ele/ela tem?");
					int idade = leia.nextInt();
					System.out.println("\nQual som ele/ela emite?");
					String som = leia.next();
					System.out.println("------------------------------------------------------");
					cachorro.Nome(nome);
					cachorro.Idade(idade);
					cachorro.Som(som);
					cachorro.Corre();
				}
				else if(x==2)
				{
					animal=cavalo;
					System.out.println("\nQual o nome do(a) cavalo/égua?");
					String nome = leia.next();
					System.out.println("\nQuantos anos ele/ela tem?");
					int idade = leia.nextInt();
					System.out.println("\nQual som ele/ela emite?");
					String som = leia.next();
					System.out.println("------------------------------------------------------");
					cavalo.Nome(nome);
					cavalo.Idade(idade);
					cavalo.Som(som);
					cavalo.Corre();
				}
				else if(x==3)
				{
					animal=preguica;
					System.out.println("\nQual o nome da do bicho-preguiça?");
					String nome = leia.next();
					System.out.println("\nQuantos anos ele/ela tem?");
					int idade = leia.nextInt();
					System.out.println("\nQual som ele/ela emite?");
					String som = leia.next();
					System.out.println("------------------------------------------------------");
					preguica.Nome(nome);
					preguica.Idade(idade);
					preguica.Som(som);
					preguica.subirArvores();
				}
				else
				{
					System.out.println("\nInválido");
				}
			}
			while(x<=0 || x>=4);
		}

	}

