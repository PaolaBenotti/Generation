package Projeto;

import java.util.Scanner;

public class Animacao extends Filme {


    Scanner read = new Scanner(System.in);

    public Animacao (String nome, String categoria, int duracao, String classificacaoIndicativa,
                     int momento, String descricao)
    {
        super(nome,"Animação",duracao,classificacaoIndicativa,momento,descricao);

    }

    @Override
    public void mensagemInicio() {

        int n = (int) (Math.random()*4.0);

        switch(n)
        {
            case 0:
                System.out.println ("Como diz o Buzz Lightyear: ao infinito e além!");
                break;
            case 1:
                System.out.println ("Se podemos sonhar, também podemos tornar nossos sonhos realidade.");
                break;
            case 2:
                System.out.println ("Hakuna matata... é lindo dizer!");
                break;
            default:
                System.out.println ("Por isso: necessário, somente o necessário...o extraordinário é demais!!!");

        }
    }

    @Override
    public void efeitoVisual() {

        int n = (int) (Math.random()*4.0);

        switch(n)
        {
            case 0:
                System.out.println (""
                        + "            _._                           _._\r\n"
                        + "           ||||                           ||||\r\n"
                        + "           ||||_           ___           _||||\r\n"
                        + "           |  ||        .-'___`-.        ||  |\r\n"
                        + "           \\   /      .' .'_ _'. '.      \\   /\r\n"
                        + "           /~~|       | (| b d |) |       |~~\\\r\n"
                        + "          /'  |       |  |  '  |  |       |  `\\\r\n"
                        + ",        /__.-:      ,|  | `-' |  |,      :-.__\\       ,\r\n"
                        + "|'-------(    \\-''\"\"/.|  /\\___/\\  |.\\\"\"''-/    )------'|\r\n"
                        + "|         \\_.-'\\   /   '-._____.-'   \\   /'-._/        |\r\n"
                        + "|.---------\\   /'._| _    .---. ===  |_.'\\   /--------.|\r\n"
                        + "'           \\ /  | |\\_\\ _ \\=v=/  _   | |  \\ /          '\r\n"
                        + "             `.  | | \\_\\_\\ ~~~  (_)  | |  .'\r\n"
                        + "               `'\"'|`'--.__.^.__.--'`|'\"'`\r\n"
                        + "                   \\                 /\r\n"
                        + "                    `,..---'\"'---..,'\r\n"
                        + "                      :--..___..--:    TO INFINITY...\r\n"
                        + "                       \\         /  \r\n"
                        + "                       |`.     .'|       AND BEYOND!\r\n"
                        + "                       |  :___:  |\r\n"
                        + "                       |   | |   |\r\n"
                        + "                       |   | |   |\r\n"
                        + "                       |.-.| |.-.|\r\n"
                        + "                       |`-'| |`-'|\r\n"
                        + "                       |   | |   |\r\n"
                        + "                      /    | |    \\\r\n"
                        + "                     |_____| |_____|\r\n"
                        + "                     ':---:-'-:---:'\r\n"
                        + "                     /    |   |    \\\r\n"
                        + "                jgs /.---.|   |.---.\\\r\n"
                        + "                    `.____;   :____.'\r\n"
                        + "");
                break;
            case 1:
                System.out.println (""
                        + "           .-\"-.                          .-\"-.\r\n"
                        + "          \"     \"--.                 ((((\"     \"\r\n"
                        + "           \".. ( ()()_O            O_()() ) ..\"\r\n"
                        + "        .-\"-./( \\_____)            (_____/ )\\.-\"-.\r\n"
                        + "       \"     \\_______/              \\_______/     \"\r\n"
                        + "        \"...\"___|__\\____           ___/  |__ \"...\"\r\n"
                        + "           /\\__||__||__/\\         /\\_ \\__/ _/\\\r\n"
                        + "           \\\\ /_    _\\ //         \\\\/      \\//\r\n"
                        + "          _/_)(_)  (_)(_\\_       _/_)//////(_\\_\r\n"
                        + "              \\__/\\__/           (_(_(_()_)_)_)\r\n"
                        + "               //  \\\\               (__)(__)\r\n"
                        + "            .-.\\\\  //.-.          .-.||  ||.-.\r\n"
                        + "-Dana'97-  (_____)(_____)        (____)  (____)\r\n"
                        + "");
                break;
            case 2:
                System.out.println (""
                        + "      .--..--..--..--..--..--.\r\n"
                        + "    .' \\  (`._   (_)     _   \\\r\n"
                        + "  .'    |  '._)         (_)  |\r\n"
                        + "  \\ _.')\\      .----..---.   /\r\n"
                        + "  |(_.'  |    /    .-\\-.  \\  |\r\n"
                        + "  \\     0|    |   ( O| O) | o|\r\n"
                        + "   |  _  |  .--.____.'._.-.  |\r\n"
                        + "   \\ (_) | o         -` .-`  |\r\n"
                        + "    |    \\   |`-._ _ _ _ _\\ /\r\n"
                        + "    \\    |   |  `. |_||_|   |\r\n"
                        + "    | o  |    \\_      \\     |     -.   .-.\r\n"
                        + "    |.-.  \\     `--..-'   O |     `.`-' .'\r\n"
                        + "  _.'  .' |     `-.-'      /-.__   ' .-'\r\n"
                        + ".' `-.` '.|='=.='=.='=.='=|._/_ `-'.'\r\n"
                        + "`-._  `.  |________/\\_____|    `-.'\r\n"
                        + "   .'   ).| '=' '='\\/ '=' |\r\n"
                        + "   `._.`  '---------------'\r\n"
                        + "           //___\\   //___\\\r\n"
                        + "             ||       ||\r\n"
                        + "    LGB      ||_.-.   ||_.-.\r\n"
                        + "            (_.--__) (_.--__)");
                break;
            default:
                System.out.println (""
                        + "              /\\_.----._\r\n"
                        + "             .\" _,=<'\"=. \",/|\r\n"
                        + "            /,-'    \"=.`.   (\r\n"
                        + "           //         \\ |    \\\r\n"
                        + "          /,    _.,.   |      \\    (|\r\n"
                        + "        ,\" |   ,\\'v/', |       \\  _)(\r\n"
                        + "       /   |   !>(\")<|/         \\ c_ \\\r\n"
                        + "    _-/     \\  '=,Z\\\\7           . C. \\\r\n"
                        + "_,-\" V  /    '-._,>*\"     \\      |   \\ \\\r\n"
                        + "\\  <\"|  )\\ __ __ ____ _    Y     |    \\ \\\r\n"
                        + " \\ \\ |   >._____________.< |     \"-.   \\ \\\r\n"
                        + "  \\ \\|   \\ \\/\\/\\/\\/\\/\\/ /' /    =_  '-._) \\\r\n"
                        + "   \\ (    \\            /         |\"*=,_   /\r\n"
                        + "    \\ \\    \\_/\\/\\/\\/\\_/         /      \"\"\"\r\n"
                        + "    _).^     \"******\"          /\r\n"
                        + "   (()!|\\                     /\r\n"
                        + "    *==\" \",                 ,\"\r\n"
                        + "           \",_            ,\"\r\n"
                        + "              \\\"*<==> ,=*\"\r\n"
                        + "               \\ \\ / /\r\n"
                        + "           _____>_V /\r\n"
                        + "          f  .-----\"\r\n"
                        + "          |  \\    \\ \\\r\n"
                        + "          |   \\    \\ '-.\r\n"
                        + "          J    \\    \\   \\\r\n"
                        + "         (  \\ \\ \\ _.-J   )\r\n"
                        + "          \\V)V)=*.','  ,'\r\n"
                        + "   jjs        (V(V)(V)/");

        }
    }

}