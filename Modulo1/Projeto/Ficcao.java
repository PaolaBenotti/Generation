package Projeto;

import java.util.Scanner;

public class Ficcao extends Filme {


    Scanner read = new Scanner(System.in);

    public Ficcao (String nome, String categoria, int duracao, String classificacaoIndicativa,
                   int momento, String descricao)
    {
        super(nome,"Fic��o Cient�fica",duracao,classificacaoIndicativa,momento,descricao);

    }
    @Override

    public void mensagemInicio() {

        int n = (int) (Math.random()*4.0);

        switch(n)
        {
            case 0:
                System.out.println ("Luke, eu sou seu pai!");
                break;
            case 1:
                System.out.println ("Hasta la vista, baby!");
                break;
            case 2:
                System.out.println ("Que a for�a esteja com voc�!");
                break;
            default:
                System.out.println ("Vida longa e pr�spera!");

        }
    }

    @Override

    public void efeitoVisual() {

        int n = (int) (Math.random()*4.0);

        switch(n)
        {
            case 0:
                System.out.println (""
                        + "                                              _______----_______\r\n"
                        + "                                   ___---~~~~~.. ... .... ... ..~~~~~---___\r\n"
                        + "                             _ ==============================================\r\n"
                        + " __________________________ - .. ..   _--~~~~~-------____-------~~~~~\r\n"
                        + "(______________________][__)____     -\r\n"
                        + "   /       /______---~~~.. .. ..~~-_~\r\n"
                        + "  <_______________________________-\r\n"
                        + "      ~~~~~~~-----__           __-\r\n"
                        + "                    ~~~~~~~~~~~\r\n"
                        + "\r\n"
                        + "                                _____.-----._____\r\n"
                        + "                   ___----~~~~~~. ... ..... ... .~~~~~~----___\r\n"
                        + "                =================================================\r\n"
                        + "                   ~~~-----......._____________.......-----~~~\r\n"
                        + "                    (____)          \\   |   /          (____)\r\n"
                        + "                      ||           _/   |   \\_           ||\r\n"
                        + "                       \\\\_______--~  //~~~\\\\  ~--_______//\r\n"
                        + "                        `~~~~---__   \\\\___//   __---~~~~'\r\n"
                        + "                                  ~~-_______-~~\r\n"
                        + "\r\n"
                        + "                U S S   E N T E R P R I S E   N C C - 1 7 0 1 - D");

                break;
            case 1:
                System.out.println (""
                        + "           __\r\n"
                        + ".-.__      \\ .-.  ___  __\r\n"
                        + "|_|  '--.-.-(   \\/\\;;\\_\\.-._______.-.\r\n"
                        + "(-)___     \\ \\ .-\\ \\;;\\(   \\       \\ \\\r\n"
                        + " Y    '---._\\_((Q)) \\;;\\\\ .-\\     __(_)\r\n"
                        + " I           __'-' / .--.((Q))---'    \\,\r\n"
                        + " I     ___.-:    \\|  |   \\'-'_          \\\r\n"
                        + " A  .-'      \\ .-.\\   \\   \\ \\ '--.__     '\\\r\n"
                        + " |  |____.----((Q))\\   \\__|--\\_      \\     '\r\n"
                        + "    ( )        '-'  \\_  :  \\-' '--.___\\\r\n"
                        + "     Y                \\  \\  \\       \\(_)\r\n"
                        + "     I                 \\  \\  \\         \\,\r\n"
                        + "     I                  \\  \\  \\          \\\r\n"
                        + "     A                   \\  \\  \\          '\\\r\n"
                        + "     |              snd   \\  \\__|           '\r\n"
                        + "                           \\_:.  \\\r\n"
                        + "                             \\ \\  \\\r\n"
                        + "                              \\ \\  \\\r\n"
                        + "                               \\_\\_|\r\n"
                        + "");

                break;
            case 2:
                System.out.println (""
                        + "         __.,,------.._\r\n"
                        + "      ,'\"   _      _   \"`.\r\n"
                        + "     /.__, ._  -=- _\"`    Y\r\n"
                        + "    (.____.-.`      \"\"`   j\r\n"
                        + "     VvvvvvV`.Y,.    _.,-'       ,     ,     ,\r\n"
                        + "        Y    ||,   '\"\\         ,/    ,/    ./\r\n"
                        + "        |   ,'  ,     `-..,'_,'/___,'/   ,'/   ,\r\n"
                        + "   ..  ,;,,',-'\"\\,'  ,  .     '     ' \"\"' '--,/    .. ..\r\n"
                        + " ,'. `.`---'     `, /  , Y -=-    ,'   ,   ,. .`-..||_|| ..\r\n"
                        + "ff\\\\`. `._        /f ,'j j , ,' ,   , f ,  \\=\\ Y   || ||`||_..\r\n"
                        + "l` \\` `.`.\"`-..,-' j  /./ /, , / , / /l \\   \\=\\l   || `' || ||...\r\n"
                        + " `  `   `-._ `-.,-/ ,' /`\"/-/-/-/-\"'''\"`.`.  `'.\\--`'--..`'_`' || ,\r\n"
                        + "            \"`-_,',  ,'  f    ,   /      `._    ``._     ,  `-.`'//         ,\r\n"
                        + "          ,-\"'' _.,-'    l_,-'_,,'          \"`-._ . \"`. /|     `.'\\ ,       |\r\n"
                        + "        ,',.,-'\"          \\=) ,`-.         ,    `-'._`.V |       \\ // .. . /j\r\n"
                        + "        |f\\\\               `._ )-.\"`.     /|         `.| |        `.`-||-\\\\/\r\n"
                        + "        l` \\`                 \"`._   \"`--' j          j' j          `-`---'\r\n"
                        + "         `  `                     \"`,-  ,'/       ,-'\"  /\r\n"
                        + "                                 ,'\",__,-'       /,, ,-'\r\n"
                        + "                                 Vvv'            VVv'");

                break;
            default:
                System.out.println (""
                        + "                                             ,--,  ,.-.\r\n"
                        + "               ,                   \\,       '-,-`,'-.' | ._\r\n"
                        + "              /|           \\    ,   |\\         }  )/  / `-,',\r\n"
                        + "              [ ,          |\\  /|   | |        /  \\|  |/`  ,`\r\n"
                        + "              | |       ,.`  `,` `, | |  _,...(   (      .',\r\n"
                        + "              \\  \\  __ ,-` `  ,  , `/ |,'      Y     (   /_L\\\r\n"
                        + "               \\  \\_\\,``,   ` , ,  /  |         )         _,/\r\n"
                        + "                \\  '  `  ,_ _`_,-,<._.<        /         /\r\n"
                        + "                 ', `>.,`  `  `   ,., |_      |         /\r\n"
                        + "                   \\/`  `,   `   ,`  | /__,.-`    _,   `\\\r\n"
                        + "               -,-..\\  _  \\  `  /  ,  / `._) _,-\\`       \\\r\n"
                        + "                \\_,,.) /\\    ` /  / ) (-,, ``    ,        |\r\n"
                        + "               ,` )  | \\_\\       '-`  |  `(               \\\r\n"
                        + "              /  /```(   , --, ,' \\   |`<`    ,            |\r\n"
                        + "             /  /_,--`\\   <\\  V /> ,` )<_/)  | \\      _____)\r\n"
                        + "       ,-, ,`   `   (_,\\ \\    |   /) / __/  /   `----`\r\n"
                        + "      (-, \\           ) \\ ('_.-._)/ /,`    /\r\n"
                        + "      | /  `          `/ \\\\ V   V, /`     /\r\n"
                        + "   ,--\\(        ,     <_/`\\\\     ||      /\r\n"
                        + "  (   ,``-     \\/|         \\-A.A-`|     /\r\n"
                        + " ,>,_ )_,..(    )\\          -,,_-`  _--`\r\n"
                        + "(_ \\|`   _,/_  /  \\_            ,--`\r\n"
                        + " \\( `   <.,../`     `-.._   _,-`");

        }
    }

}