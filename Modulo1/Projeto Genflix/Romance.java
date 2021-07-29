package gen;

import java.util.Scanner;

public class Romance extends Filme {


    Scanner read = new Scanner(System.in);


    public Romance(String nome, String categoria, int duracao, String classificacaoIndicativa, int momento, String descricao)
    {
        super(nome, "Romances", duracao, classificacaoIndicativa, momento, descricao);
        // TODO Auto-generated constructor stub
    }

    @Override

    public void efeitoVisual() {

        int n = (int) (Math.random()*4.0);

        switch(n)
        {
            case 0:
                System.out.println("   .,,,,,,,,,,.\r\n"
                        + "         ,;;;;;;;;;;;;;;,\r\n"
                        + "       ,;;;;;;;;;;;)));;(((,,;;;,,_\r\n"
                        + "      ,;;;;;;;;;;'      |)))))))))))\\\\\r\n"
                        + "      ;;;;;;/ )''    - /,)))((((((((((\\\r\n"
                        + "      ;;;;' \\        ~|\\  ))))))))))))))\r\n"
                        + "      /     /         |   ((((((((((((((\r\n"
                        + "    /'      \\      _/~'    ')|()))))))))\r\n"
                        + "  /'         `\\   />     o_/)))((((((((\r\n"
                        + " /          /' `~~(____ /  ()))))))))))\r\n"
                        + "|     ---,   \\        \\     ((((((((((\r\n"
                        + "          `\\   \\~-_____|      ))))))))\r\n"
                        + "            `\\  |      |_.---.  \\    ");
                break;

            case 1:
                System.out.println(""
                        + "        __  __                              \r\n"
                        + "     ,-'  `'  \\         _---``--    \r\n"
                        + "    /    _  _  ;      __        `. \r\n"
                        + "   /    / `' \\;        /`-----    )     \r\n"
                        + "  /  .-/    ,(         ),     \\-. ; \r\n"
                        + "  |  \\(       \\       /        )/; \r\n"
                        + "  |   -      _5       `7       -;  \r\n"
                        + " /    (  ___-'         `-____    | \r\n"
                        + "(   ___`-_                 \\ ____| \r\n"
                        + " \\ /   `,/ \\     _(\\__      /    \\ \r\n"
                        + "  \\      ;  \\  .' /'  `i.  /      | \r\n"
                        + "   |      \\ _-'( _\\__-/  `-       |\r\n"
                        + "   |       `   ,`     `_          | BP");

                break;
            case 2:
                System.out.println(",;;;;;;;,\r\n"
                        + "        ;;;;;;;;;;;,\r\n"
                        + "       ;;;;;'_____;'\r\n"
                        + "       ;;;(/))))|((\\\r\n"
                        + "       _;;((((((|))))\r\n"
                        + "      / |_\\\\\\\\\\\\\\\\\\\\\\\\\r\n"
                        + " .--~(  \\ ~))))))))))))\r\n"
                        + "/     \\  `\\-(((((((((((\\\\\r\n"
                        + "|    | `\\   ) |\\       /|)\r\n"
                        + " |    |  `. _/  \\_____/ |\r\n"
                        + "  |    , `\\~            /\r\n"
                        + "   |    \\  \\           /\r\n"
                        + "  | `.   `\\|          /\r\n"
                        + "  |   ~-   `\\        /\r\n"
                        + "   \\____~._/~ -_,   (\\\r\n"
                        + "    |-----|\\   \\    ';;\r\n"
                        + "   |      | :;;;'     \\\r\n"
                        + "  |  /    |            |\r\n"
                        + "  |       |            | -Tua Xiong\r\n"
                        + "   |      `.           /");


                break;
            default:
                System.out.println(",;;;;;,\r\n"
                        + "       ,;;;;;;;;,\r\n"
                        + "       ;;;'____ ;\r\n"
                        + "       ;;;(\\\\\\\\\\;\r\n"
                        + "       `/'((|||||\r\n"
                        + "    ___<  C))||||\r\n"
                        + "  ,'    \\__(((||),\r\n"
                        + "  |    \\  _)))))))\\,_\r\n"
                        + " /|    |/\"\\`\\`\"\"\"\"' |)\r\n"
                        + ";  \\    \\  ) \\_____/_|\r\n"
                        + "|  |\\    \\'    _.,-' |\r\n"
                        + "|  ' \\    \\.,-'   _./ |\r\n"
                        + "(  _,-\\      _.-''  |  ;\r\n"
                        + " \"'|___\\__.-'       ;  )\r\n"
                        + "    |----|   _.--,;'   ;\r\n"
                        + "   ,'  , | (     __.,-'\r\n"
                        + "   | ,' ,'  `\"\"''   `.\r\n"
                        + "   |    ;            )\r\n"
                        + "   `,   (            )\r\n"
                        + "    |   (           ,'\r\n"
                        + "    |   |           (\r\n"
                        + "    |   |           |\r\n"
                        + "    |   |           |\r\n"
                        + "    |   |___________|\r\n"
                        + "    |   |      |    |");
        }
    }

    @Override

    public void mensagemInicio() {

        int n = (int) (Math.random()*4.0);

        switch(n)
        {
            case 0:
                System.out.println ("Eu não faço o que as pessoas esperam. Pra que viver do modo que as pessoas esperam, se eu posso viver do meu.");
                break;

            case 1:
                System.out.println ("Não é sobre o que aconteceu no passado, ou o que você acha que pode acontecer no futuro. É sobre o passeio.");
                break;

            case 2:
                System.out.println ("Okay? okay.");
                break;

            default:
                System.out.println ("Como aquela nossa primeira vez...");

        }

    }
}