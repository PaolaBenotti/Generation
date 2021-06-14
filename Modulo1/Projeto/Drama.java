package gen;

import java.util.Scanner;

public class Drama extends Filme {

    Scanner read = new Scanner(System.in);


    public Drama (String nome, String categoria, int duracao, String classificacaoIndicativa,
                  int momento, String descricao)
    {
        super(nome,"Drama",duracao,classificacaoIndicativa,momento,descricao);

    }

    @Override

    public void mensagemInicio() {

        int n = (int) (Math.random()*4.0);

        switch(n)
        {
            case 0:
                System.out.println ("Odeio não conseguir te odiar por mais que eu tente ou por menos que você faça...");
                break;
            case 1:
                System.out.println ("Às vezes é preciso esquecer o passado para que se tenha um futuro.");
                break;
            case 2:
                System.out.println ("Okay?...Okay");
                break;
            default:
                System.out.println ("A única coisa pela qual se vale a pena viver.");

        }
    }

    @Override

    public void efeitoVisual() {

        int n = (int) (Math.random()*4.0);

        switch(n)
        {
            case 0:
                System.out.println (""
                        + ".------..------..------..------.\r\n"
                        + "|L.--. ||O.--. ||V.--. ||E.--. |\r\n"
                        + "| :/\\:|| :/\\:|| :(): || (\\/)|\r\n"
                        + "| (__) || :\\/:|| ()() || :\\/:|\r\n"
                        + "| '--'L|| '--'O|| '--'V|| '--'E|\r\n"
                        + "`------'`------'`------'`------'");
                break;
            case 1:
                System.out.println (""
                        + "               _.-'                   `-.\r\n"
                        + "             .'                          `.\r\n"
                        + "            /                              \\\r\n"
                        + "           /           `  ._        .       `\r\n"
                        + "         .'         )   `   `------' `---    |\r\n"
                        + "        |           |    `._  `-----..       |\r\n"
                        + "        | `         `-  ____.----' '   `.   '|\r\n"
                        + "        |   .         .'                 `--'|\r\n"
                        + "        |`   `-.  `._/                  .|--'|\r\n"
                        + "        | `      -. /   .=====._     .===| _.|\r\n"
                        + "        |   `   |  '   \" <(@)>  ,  (/(@)>|  /\r\n"
                        + "        \\ `     \\               '  |     |_/\r\n"
                        + "         \\  `    %>                |    |\r\n"
                        + "          \\      |   |      . . .  |    |\r\n"
                        + "           `._   |       ..'  `.__.'   /\r\n"
                        + "              `-| \\      ``---------  /\r\n"
                        + "               /|  `.      `..___..' /\r\n"
                        + "              / `-   `-_     `---'  /\r\n"
                        + "            _.    `-.   `-._      .'\r\n"
                        + "         _.'         `-.    `----'_\r\n"
                        + "     __.'               `-._    .'|\r\n"
                        + "__.-'                       `-.'  |\r\n"
                        + "                              @   `.\r\n"
                        + "                              |     `-.\r\n"
                        + "                              |        `-._\r\n"
                        + "                              |            `-._\r\n"
                        + "                              |                `\r\n"
                        + "                              |");
                break;
            case 2:
                System.out.println (""
                        + "                            .--.\r\n"
                        + "                          _/_._|--.\r\n"
                        + "                       _.;/ 7 ;\\-'\r\n"
                        + "                          )o(o /\r\n"
                        + "                         _'./= /\\___\r\n"
                        + "                        /  |'-'>    \\\r\n"
                        + "                      _/  /(><)\\     \\\r\n"
                        + "                     / '.||   /|     |\r\n"
                        + "                    ( '  | \\_/ \\     |\r\n"
                        + "                     |;. /`-,   \\    |\r\n"
                        + "          ___        |'| |-'    /   /\r\n"
                        + "         2\"\"\"s;   ||| \\    |    |\r\n"
                        + "        2) 6,6 22     |:|  \\  |     |\r\n"
                        + "       S2\\ = /22     |:   |   |     \\\r\n"
                        + "       sS_)   S2s     |    |   |     |\r\n"
                        + "      /} /    |2sS    \\   |   |     |\r\n"
                        + "     | \\(-Y- / S s.    |  |   |     |\r\n"
                        + "     / /\\\\_/ /'-._\\__ |       _|____\\_____\r\n"
                        + "____/_/__}_\\_\\____',~'-------'          /\r\n"
                        + " \\_                                   _/-\r\n"
                        + "   \\                  _.=._.-=,__.=-=' '\r\n"
                        + " =' '-_.='=-,_.=-,--='         _\r\n"
                        + "    -'          _.=._        -' '=-\r\n"
                        + "  snd        .='     '");
                break;
            default:
                System.out.println ("                                         ^^\r\n"
                        + "    ^^      ..                                       ..\r\n"
                        + "            []                                       []\r\n"
                        + "          .:[]:_          ^^                       ,:[]:.\r\n"
                        + "        .: :[]: :-.                             ,-: :[]: :.\r\n"
                        + "      .: : :[]: : :`._                       ,.': : :[]: : :.\r\n"
                        + "    .: : : :[]: : : : :-._               _,-: : : : :[]: : : :.\r\n"
                        + "_..: : : : :[]: : : : : : :-._________.-: : : : : : :[]: : : : :-._\r\n"
                        + "_:_:_:_:_:_:[]:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:[]:_:_:_:_:_:_\r\n"
                        + "!!!!!!!!!!!![]!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!![]!!!!!!!!!!!!!\r\n"
                        + "^^^^^^^^^^^^[]^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^[]^^^^^^^^^^^^^\r\n"
                        + "            []                                       []\r\n"
                        + "            []                                       []\r\n"
                        + "            []                                       []\r\n"
                        + " ~~^-~^_~^~/  \\~^-~^~_~^-~_^~-^~_^~~-^~_~^~-~_~-^~_^/  \\~^-~_~^-~~-\r\n"
                        + "~ _~~- ~^-^~-^~~- ^~_^-^~~_ -~^_ -~_-~~^- _~~_~-^_ ~^-^~~-_^-~ ~^\r\n"
                        + "   ~ ^- _~~_-  ~~ _ ~  ^~  - ~~^ _ -  ^~-  ~ _  ~~^  - ~_   - ~^_~\r\n"
                        + "     ~-  ^_  ~^ -  ^~ _ - ~^~ _   _~^~-  _ ~~^ - _ ~ - _ ~~^ -\r\n"
                        + "jgs     ~^ -_ ~^^ -_ ~ _ - _ ~^~-  _~ -_   ~- _ ~^ _ -  ~ ^-\r\n"
                        + "            ~^~ - _ ^ - ~~~ _ - _ ~-^ ~ __- ~_ - ~  ~^_-\r\n"
                        + "                ~ ~- ^~ -  ~^ -  ~ ^~ - ~~  ^~ - ~\r\n"
                        + "");

        }
    }
}