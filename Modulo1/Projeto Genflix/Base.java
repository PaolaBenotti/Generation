package gen;

import java.util.*;
public class Base extends UserList{

    public static void main(String[] args) {

        //Inicialização do database de filmes
        ArrayList< ArrayList<Filme> > movieDB = new ArrayList< ArrayList<Filme> >(10);
        for(int i = 0; i < 10; i++){
            movieDB.add(new ArrayList<Filme>());
            for(int j = 0; j < 37; j++){
                //Consertar isso com aqui com todos os tipos de filmes
                if(i == 0) movieDB.get(0).add(new Animacao("Animação " + j, "Animação", 120, "Livre", 0, "Descrição Teste"));
                if(i == 1) movieDB.get(1).add(new Ficcao("Ficção  " + j, "Ficção Científica", 120, "Livre", 0, "Descrição Teste"));
                if(i == 2) movieDB.get(2).add(new Suspense("Suspense " + j, "Suspense", 120, "Livre", 0, "Descrição Teste"));
                if(i == 3) movieDB.get(3).add(new Terror("Terror " + j, "Terror", 120, "Livre", 0, "Descrição Teste"));
                if(i == 4) movieDB.get(4).add(new Aventura("Aventura " + j, "Aventura", 120, "Livre", 0, "Descrição Teste"));
                if(i == 5) movieDB.get(5).add(new Comedia("Comédia " + j, "Comédia", 120, "Livre", 0, "Descrição Teste"));
                if(i == 6) movieDB.get(6).add(new Romance("Romance " + j, "Romance", 120, "Livre", 0, "Descrição Teste"));
                if(i == 7) movieDB.get(7).add(new Acao("Ação " + j, "Ação", 120, "Livre", 0, "Descrição Teste"));
                if(i == 8) movieDB.get(8).add(new Drama("Drama " + j, "Drama", 120, "Livre", 0, "Descrição Teste"));
                if(i == 9) movieDB.get(9).add(new Documentarios("Documentário " + j, "Documentários", 120, "Livre", 0, "Descrição Teste"));
            }
        }

        //Apresentação
        movieDB.get(4).get(15).setNome("O Senhor dos Anéis - A Sociedade do Anel");
        movieDB.get(4).get(15).setCategoria("Aventura");
        movieDB.get(4).get(15).setDuracao(228);
        movieDB.get(4).get(15).setClassificacaoIndicativa("Não recomendado para menores de 12 anos");
        movieDB.get(4).get(15).setDescricao("Em uma terra fantástica e única, um hobbit recebe de presente de seu tio um anel mágico e maligno que precisa ser destruído antes \nque caia nas mãos do mal. Para isso, o hobbit Frodo tem um caminho árduo pela frente, onde encontra perigo, medo e seres bizarros.\n Ao seu lado para o cumprimento desta jornada, ele aos poucos pode contar com outros hobbits, um elfo, um anão, dois humanos e um mago, \ntotalizando nove seres que formam a Sociedade do Anel.");

        //Apresentação
        movieDB.get(1).get(15).setNome("Interestelar");
        movieDB.get(1).get(15).setCategoria("Aventura/Ficção Científica");
        movieDB.get(1).get(15).setDuracao(169);
        movieDB.get(1).get(15).setClassificacaoIndicativa("Não recomendado para menores de 10 anos");
        movieDB.get(1).get(15).setDescricao("As reservas naturais da Terra estão chegando ao fim e um grupo de astronautas recebe a missão de verificar possíveis planetas para \nreceberem a população mundial, possibilitando a continuação da espécie. Cooper é chamado para liderar o grupo e aceita a missão \nsabendo que pode nunca mais ver os filhos. Ao lado de Brand, Jenkins e Doyle, ele seguirá em busca de um novo lar.\n");


        //Inicialização do database de usuários
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

            // - Loop principal do menu de usuário
            while (true) {

                System.out.println("-----MENU DE USUÁRIO-----");
                System.out.println("Digite o que gostaria de fazer: ");
                System.out.println("1 - Iniciar filme atual");
                System.out.println("2 - Buscar Filmes");
                System.out.println("3 - Nossa indicação para você");
                System.out.println("4 - Pontos GenFlix");
                System.out.println("5 - Acessar configurações de usuário");
                System.out.println("6 - Sair");

                int x = user.checker(1, 6, "");
                user.clear();

                // - Iniciar o filme atual
                if (x == 1) {
                    if(movie == null) System.out.println("Você não selecionou um filme!\n\n");
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
                            System.out.println("4 - Deixar avaliação");
                            System.out.println("5 - Deixar comentário");
                            System.out.println("6 - Ver avaliações");

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
                                movie.getComentario().add("\n\"" + s + "\"\n   —— " + user.getNome());
                                System.out.println("Muito Obrigado! Sua opinião é muito importante para nós!");

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
                    System.out.println("0 - Animação");
                    System.out.println("1 - Ficção Científica");
                    System.out.println("2 - Suspense");
                    System.out.println("3 - Terror");
                    System.out.println("4 - Aventura");
                    System.out.println("5 - Comédia");
                    System.out.println("6 - Romance");
                    System.out.println("7 - Ação");
                    System.out.println("8 - Drama");
                    System.out.println("9 - Documentários");

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
                        System.out.println(cnt++ + " - Avançar");
                        System.out.println(cnt + " - Sair");
                        int z = user.checker(1, cnt, "");
                        user.clear();
                        if (z == cnt) break;
                        else if (z == cnt - 1) p = Math.min(p, movieDB.get(y).size() - 6);
                        else if (z == cnt - 2) p = Math.max(0, p - 12);
                        else {
                            //Apresentação
                            if(user.getLogin() == "brunologin" || user.getLogin() == "zinhafofinha") {
                                movie = movieDB.get(4).get(15);
                                movie.apresentarInfo();
                            }
                            else{
                                movie = movieDB.get(y).get(15);
                            }
                            break;
                        }
                    }

                }

                // - Assistir à recomendação
                else if (x == 3) {
                    int cat = (int) (Math.random() * 10);
                    int mov = (int) (Math.random() * movieDB.get(cat).size());
                    //Filme rec = movieDB.get(cat).get(mov);
                    //rec.apresentarInfo();
                    movie = movieDB.get(1).get(15);
                    movie.apresentarInfo();
                    System.out.println("Gostaria de assistir? (1 - Sim | 2 - Não)");

                    int y = user.checker(1, 2, "(1 - Sim | 2 - Não)");

                    //Apresentação
                }

                // - Sistema de Pontos
                else if (x == 4) {
                    System.out.println("A GenFlix é uma empresa socialmente consciente e para cada filme assistido, ela te presenteia "
                            + "\ncom pontos que podem ser convertidos em uma contribuição monetária para ONGs da sua escolha, com projetos como:");
                    System.out.println("- Proteção aos Jovens");
                    System.out.println("- Assistência a Mulheres");
                    System.out.println("- Reflorestamento");
                    System.out.println("- Apoio hospitalar");
                    System.out.println("- Auxílio a Idosos");
                    System.out.println("- Resgate de animais abandonados");
                    System.out.println("- Assessoria a defencientes");
                    System.out.println("\nNúmero de moedas GenFlix: " + user.getTotalWatched());
                    System.out.println();
                    System.out.println();
                    System.out.println();
                }

                // - Loop secundário das configurações de usuário
                else if (x == 5) {
                    while (true) {
                        System.out.println("-----MENU DE CONFIGURAÇÕES-----");
                        System.out.println("1 - Dados do Usuário");
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

