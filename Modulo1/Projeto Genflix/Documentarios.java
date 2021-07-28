package gen;

import java.util.Scanner;

public class Documentarios extends Filme {

    Scanner read = new Scanner(System.in);


    public Documentarios(String nome, String categoria, int duracao, String classificacaoIndicativa, int momento, String descricao)
    {
        super(nome, "Documentários", duracao, classificacaoIndicativa, momento, descricao);

    }
    @Override

    public void mensagemInicio() {

        int n = (int) (Math.random()*4.0);

        switch(n)
        {
            case 0:
                System.out.println ("A maioria das coisas positivas e negativas que trazem mudanças à civilizção humana "
                        + "começam com alguém. Uma pessoa. E uma pessoa não consegue fazer tudo, mas cada uma pode fazer uma parte.");
                break;

            case 1:
                System.out.println ("Cowspiracy talvez seja o mais importante filme para inspirar a salvar o planeta.\r\n"
                        + "Louie Psihoyos, diretor do documentário The Cove, ganhador do Oscar");
                break;

            case 2:
                System.out.println ("\"Nós nos contentamos com o mundo como é ou trabalhamos para um mundo como ele deveria ser?\" - Michelle Obama");
                break;

            default:
                System.out.println ("\"É crucial proteger nossas democracias\"");
        }

    }
    @Override

    public void efeitoVisual() {

        int n = (int) (Math.random()*4.0);

        switch(n)
        {
            case 0:
                System.out.println("                                        |\r\n"
                        + "                                      \\ _ /\r\n"
                        + "                                    -= (_) =-\r\n"
                        + "   .\\/.                               /   \\\r\n"
                        + ".\\\\//o\\\\                      ,\\/.      |              ,~\r\n"
                        + "//o\\\\|,\\/.   ,.,.,   ,\\/.  ,\\//o\\\\                     |\\\r\n"
                        + "  |  |//o\\  /###/#\\  //o\\  /o\\\\|                      /| \\\r\n"
                        + "^^|^^|^~|^^^|' '|:|^^^|^^^^^|^^|^^^\"\"\"\"\"\"\"\"(\"~~~~~~~~/_|__\\~~~~~~~~~~\r\n"
                        + " .|'' . |  '''\"\"'\"''. |`===`|''  '\"\" \"\" \" (\" ~~~~ ~ ~======~~  ~~ ~\r\n"
                        + " jgs^^   ^^^ ^ ^^^ ^^^^ ^^^ ^^ ^^ \"\" \"\"\"( \" ~~~~~~ ~~~~~  ~~~ ~");
                break;

            case 1:
                System.out.println ("   ,     ,\r\n"
                        + "                  ___('-&&&-')__\r\n"
                        + "                 '.__./     \\__.'\r\n"
                        + "     _     _     _ .-'  6  6 \\\r\n"
                        + "   /` `--'( ('--` `\\         |\r\n"
                        + "  /        ) )      \\ \\ _   _|\r\n"
                        + " |        ( (        | (0_._0)\r\n"
                        + " |         ) )       |/ '---'\r\n"
                        + " |        ( (        |\\_\r\n"
                        + " |         ) )       |( \\,\r\n"
                        + "  \\       ((`       / )__/\r\n"
                        + "   |     /:))\\     |   d\r\n"
                        + "   |    /:((::\\    |\r\n"
                        + "   |   |:::):::|   |\r\n"
                        + "   /   \\::&&:::/   \\\r\n"
                        + "   \\   /;U&::U;\\   /\r\n"
                        + "    | | | u:u | | |\r\n"
                        + "    | | \\     / | |\r\n"
                        + "jgs | | _|   | _| |\r\n"
                        + "    / \\\"\"`   `\"\"/ \\\r\n"
                        + "   | __|       | __|\r\n"
                        + "   `\"\"\"`       `\"\"\"`");

                break;
            case 2:
                System.out.println("      -o#&&*''''?d:>b\\_\r\n"
                        + "          _o/\"`''  '',, dMF9MMMMMHo_\r\n"
                        + "       .o&#'        `\"MbHMMMMMMMMMMMHo.\r\n"
                        + "     .o\"\" '         vodM*$&&HMMMMMMMMMM?.\r\n"
                        + "    ,'              $M&ood,~'`(&##MMMMMMH\\\r\n"
                        + "   /               ,MMMMMMM#b?#bobMMMMHMMML\r\n"
                        + "  &              ?MMMMMMMMMMMMMMMMM7MMM$R*Hk\r\n"
                        + " ?$.            :MMMMMMMMMMMMMMMMMMM/HMMM|`*L\r\n"
                        + "|               |MMMMMMMMMMMMMMMMMMMMbMH'   T,\r\n"
                        + "$H#:            `*MMMMMMMMMMMMMMMMMMMMb#}'  `?\r\n"
                        + "]MMH#             \"\"*\"\"\"\"*#MMMMMMMMMMMMM'    -\r\n"
                        + "MMMMMb_                   |MMMMMMMMMMMP'     :\r\n"
                        + "HMMMMMMMHo                 `MMMMMMMMMT       .\r\n"
                        + "?MMMMMMMMP                  9MMMMMMMM}       -\r\n"
                        + "-?MMMMMMM                  |MMMMMMMMM?,d-    '\r\n"
                        + " :|MMMMMM-                 `MMMMMMMT .M|.   :\r\n"
                        + "  .9MMM[                    &MMMMM*' `'    .\r\n"
                        + "   :9MMk                    `MMM#\"        -\r\n"
                        + "     &M}                     `          .-\r\n"
                        + "      `&.                             .\r\n"
                        + "        `~,   .                     ./\r\n"
                        + "            . _                  .-\r\n"
                        + "              '`--._,dd###pp=\"\"'");


                break;
            default:
                System.out.println(""
                        + "        _________   _________\r\n"
                        + "   ____/      452\\ /     453 \\____\r\n"
                        + " /| ------------- |  ------------ |\\\r\n"
                        + "||| ------------- | ------------- |||\r\n"
                        + "||| ------------- | ------------- |||\r\n"
                        + "||| ------- ----- | ------------- |||\r\n"
                        + "||| ------------- | ------------- |||\r\n"
                        + "||| ------------- | ------------- |||\r\n"
                        + "|||  ------------ | ----------    |||\r\n"
                        + "||| ------------- |  ------------ |||\r\n"
                        + "||| ------------- | ------------- |||\r\n"
                        + "||| ------------- | ------ -----  |||\r\n"
                        + "||| ------------  | ------------- |||\r\n"
                        + "|||_____________  |  _____________|||\r\n"
                        + "L/_____/--------\\\\_//W-------\\_____\\J");
        }
    }


}