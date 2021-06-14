package Projeto;

import java.util.*;

public class Base extends UserList{

    public static void main(String[] args) {

        //Inicializa��o do database de filmes
        ArrayList< ArrayList<Filme> > movieDB = new ArrayList< ArrayList<Filme> >(10);
        for(int i = 0; i < 10; i++){
            movieDB.add(new ArrayList<Filme>());
            for(int j = 0; j < 37; j++){
                //Consertar isso com aqui com todos os tipos de filmes
                if(i == 0) movieDB.get(0).add(new Animacao("Anima��o " + j, "Anima��o", 120, "Livre", 0, "Descri��o Teste"));
                if(i == 1) movieDB.get(1).add(new Ficcao("Fic��o  " + j, "Fic��o Cient�fica", 120, "Livre", 0, "Descri��o Teste"));
                if(i == 2) movieDB.get(2).add(new Suspense("Suspense " + j, "Suspense", 120, "Livre", 0, "Descri��o Teste"));
                if(i == 3) movieDB.get(3).add(new Terror("Terror " + j, "Terror", 120, "Livre", 0, "Descri��o Teste"));
                if(i == 4) movieDB.get(4).add(new Aventura("Aventura " + j, "Aventura", 120, "Livre", 0, "Descri��o Teste"));
                if(i == 5) movieDB.get(5).add(new Comedia("Com�dia " + j, "Com�dia", 120, "Livre", 0, "Descri��o Teste"));
                if(i == 6) movieDB.get(6).add(new Romance("Romance " + j, "Romance", 120, "Livre", 0, "Descri��o Teste"));
                if(i == 7) movieDB.get(7).add(new Acao("A��o " + j, "A��o", 120, "Livre", 0, "Descri��o Teste"));
                if(i == 8) movieDB.get(8).add(new Drama("Drama " + j, "Drama", 120, "Livre", 0, "Descri��o Teste"));
                if(i == 9) movieDB.get(9).add(new Documentarios("Document�rio " + j, "Document�rios", 120, "Livre", 0, "Descri��o Teste"));
            }
        }

        //Inicializa��o do database de usu�rios
        ArrayList<Perfil> userDB = new ArrayList<Perfil>();
        userDB.add(Bruno);
        userDB.add(Ed);
        userDB.add(Esdras);
        userDB.add(Paola);
        userDB.add(Zinha);


        while(true) {

            Filme movie = null;

            // - Login
            Inicio init = new Inicio(userDB);
            Perfil profile = init.IniciarSessao();
            UserInterface user = new UserInterface(profile.getNome(), profile.getEmail(), profile.getPlano(), profile.getLogin(), profile.getSenha());

            // - Loop principal do menu de usu�rio
            while (true) {

                System.out.println("-----MENU DE USU�RIO-----");
                System.out.println("Digite o que gostaria de fazer: ");
                System.out.println("1 - Iniciar filme atual");
                System.out.println("2 - Buscar Filmes");
                System.out.println("3 - Nossa indica��o para voc�");
                System.out.println("4 - Pontos GenFlix");
                System.out.println("5 - Acessar configura��es de usu�rio");
                System.out.println("6 - Sair");

                int x = user.checker(1, 6, "");
                user.clear();

                // - Iniciar o filme atual
                if (x == 1) {
                    if(movie == null) System.out.println("Voc� n�o selecionou um filme!\n\n");
                    else{
                        user.start(movie);
                        movie.efeitoVisual();
                        movie.mensagemInicio();

                        boolean playing = false;

                        while (true) {

                            System.out.println("\n-----MENU DE FILME-----");
                            System.out.println("Digite o que gostaria de fazer: ");
                            System.out.println("1 - Continuar / Pausar");
                            System.out.println("2 - Parar");
                            System.out.println("3 - Favoritar");
                            System.out.println("4 - Deixar avalia��o");
                            System.out.println("5 - Deixar coment�rio");
                            System.out.println("6 - Ver avalia��es");

                            int y = user.checker(1, 6, "");
                            user.clear();

                            if (y == 1) {
                                user.clear();
                                if (!playing) user.pause();
                                else user.play(movie);
                                playing = !playing;

                            }
                            if (y == 2) {
                                user.setTotalWatched(user.getTotalWatched() + 1);
                                break;
                            }

                            if (y == 3) user.addFavs(movie);

                            if (y == 4) {
                                movie.setNota(movie.getNota() + user.rate(movie));
                                movie.setContaNota(movie.getContaNota() + 1);
                            }
                            if (y == 5) {
                                String s = user.comment();
                                movie.getComentario().add("\n\"" + s + "\"\n   �� " + user.getNome());
                                System.out.println("Muito Obrigado! Sua opini�o � muito importante para n�s!");

                            }
                            if (y == 6) {
                                user.showRating(movie);
                                for (int j = 0; j < movie.getComentario().size(); j++) {
                                    System.out.println(movie.getComentario().get(j));

                                }

                            }

                        }
                    }


                }

                // - Procurar por um filme
                else if (x == 2) {
                    System.out.println("-----ESCOLHA UMA CATEGORIA-----");
                    System.out.println("0 - Anima��o");
                    System.out.println("1 - Fic��o Cient�fica");
                    System.out.println("2 - Suspense");
                    System.out.println("3 - Terror");
                    System.out.println("4 - Aventura");
                    System.out.println("5 - Com�dia");
                    System.out.println("6 - Romance");
                    System.out.println("7 - A��o");
                    System.out.println("8 - Drama");
                    System.out.println("9 - Document�rios");

                    int y = user.checker(0, 9, "");
                    user.clear();

                    int p = 0;
                    // - Loop para iterar pelos filmes da categoria
                    while (p < movieDB.get(y).size()) {
                        int cnt = 0;
                        // - Loop para printar os filmes da categoria
                        System.out.println("Selecione um filme: ");
                        while (cnt++ < 6 && p < movieDB.get(y).size()) {
                            System.out.println(cnt + " - " + movieDB.get(y).get(p++).getNome());
                        }
                        System.out.println(cnt++ + " - Voltar");
                        System.out.println(cnt++ + " - Avan�ar");
                        System.out.println(cnt + " - Sair");
                        int z = user.checker(1, cnt, "");
                        user.clear();
                        if (z == cnt) break;
                        else if (z == cnt - 1) p = Math.min(p, movieDB.get(y).size() - 6);
                        else if (z == cnt - 2) p = Math.max(0, p - 12);
                        else {
                            movie = movieDB.get(y).get(15);
                            movie.apresentarInfo();
                            break;
                        }
                    }

                }

                // - Assistir � recomenda��o
                else if (x == 3) {
                    int cat = (int) (Math.random() * 10);
                    int mov = (int) (Math.random() * movieDB.get(cat).size());
                    Filme rec = movieDB.get(cat).get(mov);
                    rec.apresentarInfo();
                    System.out.println("Gostaria de assistir? (1 - Sim | 2 - N�o)");

                    int y = user.checker(1, 2, "(1 - Sim | 2 - N�o)");

                    movie = rec;

                }

                // - Sistema de Pontos
                else if (x == 4) {
                    System.out.println("A GenFlix � uma empresa socialmente consciente e para cada filme assistido, ela te presenteia "
                            + "\ncom pontos que podem ser convertidos em uma contribui��o monet�ria para ONGs da sua escolha, com projetos como:");
                    System.out.println("- Prote��o aos Jovens");
                    System.out.println("- Assist�ncia a Mulheres");
                    System.out.println("- Reflorestamento");
                    System.out.println("- Apoio hospitalar");
                    System.out.println("- Aux�lio a Idosos");
                    System.out.println("- Resgate de animais abandonados");
                    System.out.println("- Assessoria a defencientes");
                    System.out.println("N�mero de moedas GenFlix: " + user.getTotalWatched());
                    System.out.println();
                    System.out.println();
                    System.out.println();
                }

                // - Loop secund�rio das configura��es de usu�rio
                else if (x == 5) {
                    while (true) {
                        System.out.println("-----MENU DE CONFIGURA��ES-----");
                        System.out.println("1 - Dados do Usu�rio");
                        System.out.println("2 - Alterar Email");
                        System.out.println("3 - Alterar Senha");
                        System.out.println("4 - Alterar Plano");
                        System.out.println("5 - Verificar Dados");
                        System.out.println("6 - Voltar");

                        int y = user.checker(1, 6, "");

                        user.clear();
                        if (y == 1) profile.apresentarDados();
                        else if (y == 2) profile.alterarEmail();
                        else if (y == 3) profile.alterarSenha();
                        else if (y == 4) profile.alterarPlano();
                        else if (y == 5) profile.validarDados();
                        else break;
                    }

                } else break;

            }

        }

    }

}