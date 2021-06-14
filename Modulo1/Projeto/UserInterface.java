package Projeto;

import java.util.Scanner;
import java.util.ArrayList;

// - Classe destinada a intera��es do usu�rio com a plataforma
public class UserInterface extends Perfil {

    // - Propriedades
    Scanner in = new Scanner(System.in);
    private ArrayList<Filme> favs;
    private Filme selected;
    private String lastWatch;
    private int totalWatched;

    // - Construtor
    UserInterface(String nome, String email, String plano, String login, String senha) {

        super(nome, email, plano, login, senha);
        setFav(new ArrayList<Filme>());
        setSelected(null);
        setLastWatch("N/A");
        setTotalWatched(0);
    }

    // - Validador de entrada
    int checker(int a, int b, String c){
        int x = -1;
        while (x < a || x > b) {
            x = in.nextInt();
            if (x >= a && x <= b) break;
            System.out.printf("Op��o inv�lida! Digite um n�mero entre %d e %d: %s\n", a , b, c);
        }
        return x;
    }

    public void pause () {

        System.out.println(" "
                + " _______  _______  __   __  _______  _______  ______   _______ \r\n"
                + "|       ||   _   ||  | |  ||       ||   _   ||      | |       |\r\n"
                + "|    _  ||  |_|  ||  | |  ||  _____||  |_|  ||  _    ||   _   |\r\n"
                + "|   |_| ||       ||  |_|  || |_____ |       || | |   ||  | |  |\r\n"
                + "|    ___||       ||       ||_____  ||       || |_|   ||  |_|  |\r\n"
                + "|   |    |   _   ||       | _____| ||   _   ||       ||       |\r\n"
                + "|___|    |__| |__||_______||_______||__| |__||______| |_______|");

        System.out.println("Filme pausado.");

    }
    public void play (Filme mov) {

        mov.efeitoVisual();
        System.out.println("Filme rodando.");

    }

    // - M�todo para iniciar filme
    public void start (Filme mov) {

        System.out.println("\nO filme " + mov.getNome() + " j� ir� iniciar!");
        System.out.println("Selecione o idioma: (1 - PT | 2 - EN | 3 - ES)");

        int aux = checker(1, 3, "(1 - PT | 2 - EN | 3 - ES)");

        System.out.println("Gostaria de uma legenda? (1 - PT | 2 - EN | 3 - ES | 4 - Sem legenda)" );

        checker(1, 4, "(1 - PT | 2 - EN | 3 - ES | 4 - Sem legenda)");

        if (aux == 1) System.out.println("\nBom filme!\n ");
        if (aux == 2) System.out.println("\nHave a nice movie!\n ");
        if (aux == 3) System.out.println("\nBuena pel�cula!\n ");
    }

    // - M�todo para favoritar um filme
    public void addFavs(Filme mov) {
        System.out.println("O filme " + mov.getNome() + " foi adicionado aos seus favoritos. ");
        favs.add(mov);
    }

    // - M�todo para avaliar um filme
    // - USAR EXCEPTIONS
    public int rate(Filme mov) {
        System.out.println("Digite uma nota entre 0 e 5: ");
        int ret = checker(0, 5, "");
        System.out.println("Muito Obrigado! Sua opini�o � muito importante para n�s!");
        return ret;
    }

    public void showRating(Filme mov) {
        System.out.printf("Nota geral do filme: %.1f\n",mov.getNota()/(1.0*mov.getContaNota()));
    }

    // - M�todo para adicionar um coment�rio ap�s avaliar um filme
    String comment(){
        System.out.printf("Escreve um coment�rio: ");
        String s = in.nextLine();
        s = in.nextLine();
        return s;
    }

    public void clear(){ for(int i = 0; i<40; i++) System.out.println(); }

    // - Getters e Setters
    public ArrayList<Filme> getFav() { return favs; }
    public void setFav(ArrayList<Filme> fav) { this.favs = fav; }
    public Filme getSelected() { return selected; }
    public void setSelected(Filme selected) { this.selected = selected; }
    public String getLastWatch() { return lastWatch; }
    public void setLastWatch(String lastWatch) { this.lastWatch = lastWatch; }
    public int getTotalWatched() { return totalWatched; }
    public void setTotalWatched(int totalWatched) { this.totalWatched = totalWatched; }
}