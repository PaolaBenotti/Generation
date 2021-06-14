package gen;

import java.util.Scanner;

public class Aventura extends Filme {

    Scanner read = new Scanner(System.in);


    public Aventura (String nome, String categoria, int duracao, String classificacaoIndicativa,
                     int momento, String descricao)
    {
        super (nome,"Aventura",duracao,classificacaoIndicativa,momento,descricao);

    }
    @Override

    public void mensagemInicio() {

        int n = (int) (Math.random()*4.0);

        switch(n)
        {
            case 0:
                System.out.println ("Agora vou transformar o milagre em rotina, o incrível será visto todos os dias.");
                break;
            case 1:
                System.out.println ("A aventura está lá fora...");
                break;
            case 2:
                System.out.println ("Não vale a pena viver sonhando e se esquecer de viver. ..");
                break;
            default:
                System.out.println ("Ela lhe contou histórias, ele a ensinou a voar... Amavam-se, mas ele não queria crescer..");

        }
    }
    @Override

    public void efeitoVisual() {

        int n = (int) (Math.random()*4.0);

        switch(n)
        {
            case 0:
                System.out.println (""
                        + "                    __\r\n"
                        + "                    \",'.\r\n"
                        + "                      \",\\\r\n"
                        + "                      / Y\r\n"
                        + "     ,             _,'--.\\\r\n"
                        + "     \\_-(         ;--(/\\ )\r\n"
                        + "       \\'.         )6,6 /)\r\n"
                        + "        \\ \\_       \\ _, |_\r\n"
                        + "         ', '--/'---'- /_/'-._\r\n"
                        + "           '-'-L._  -|/      /-._     /\r\n"
                        + "                  |      |-~'--._'-._/(,\r\n"
                        + "                 ,_/>   /         ''--~\r\n"
                        + "                 /\\<_ _/\r\n"
                        + "                // \"-'-'\\\r\n"
                        + "               ,~-.   ._ )\r\n"
                        + "               /   \\_/  '\\\r\n"
                        + "              /   /   \\   |\r\n"
                        + "             /  /`    _\\  |\r\n"
                        + "            ( ,/  _.-' __.'\r\n"
                        + "           / /  [((---'\r\n"
                        + "          / /   ) )\r\n"
                        + "         / /    \\/\r\n"
                        + "        K=/\r\n"
                        + "snd    / _>\r\n"
                        + "      )_/\r\n"
                        + "1245");

                break;
            case 1:
                System.out.println (""
                        + "           _\r\n"
                        + "        .-' '-.\r\n"
                        + "       /       \\\r\n"
                        + "      |,-,-,-,-,|\r\n"
                        + "     ___   |\r\n"
                        + "    _)_(_  |\r\n"
                        + "    (/ \\)  |\r\n"
                        + "    _\\_/_  /)\r\n"
                        + "   / \\_/ \\//\r\n"
                        + "   |(   )\\/\r\n"
                        + "   ||)_( \r\n"
                        + "   |/   \\\r\n"
                        + "   n|   |\r\n"
                        + "  / \\   |\r\n"
                        + "  |_|___|\r\n"
                        + "     \\|/\r\n"
                        + "jgs _/L\\_");

                break;
            case 2:
                System.out.println (""
                        + "     .-\"\"\"-\"\"\"-\"\"\"--.--\"\"\"-\"\"\"-\"\"\"\"-.\r\n"
                        + "   -\"  I   I   I  I    I   I  I    I  \"-.\r\n"
                        + "  \"   MMMMMMMMMMn)))).(((((nMMMMMMMMM    \"\r\n"
                        + " \"   M .-''''-. \"MMM    MMM\" .-'''-. M    \"\r\n"
                        + "I   M' .-'''''-. -MM   MM- .'.-''''-. M    I\r\n"
                        + "I  M  'MMMMMMMMM .'''''. 'MMMMMMMMM'  M    I\r\n"
                        + "I  M  M  M$M  MM       :  MM  M$M  M  M    I\r\n"
                        + "I      M MMM  M   -\"\".\"\"-   M MMM  M       I\r\n"
                        + "I       \"\"\"\"\"\"   MMMMMMMMM   \"\"\"\"\"\"   .    I\r\n"
                        + " I     '-....-' : MMMMMMM  :  '-...-'.'   I\r\n"
                        + "  \" .  '-....-'    -   -     '-...-'     \"\r\n"
                        + "   , '.        :                     .'\"\r\n"
                        + "    \"  '....'                  '.....' \"\r\n"
                        + "     \"-'...;' :             :  '....'-\"\r\n"
                        + "       \"-     \".-----....--.\"      -\"\r\n"
                        + "         \"-                 .   -\"\r\n"
                        + "           \"-     '-...- '.'   -\"\r\n"
                        + "             \"-.; '-....-'  .-\"\r\n"
                        + "                 I\"-......I\"\r\n"
                        + "                 I        I\r\n"
                        + "                 I '-- --'I\r\n"
                        + "                 I        I\r\n"
                        + "                 I '-- --'I\r\n"
                        + "                 I        I\r\n"
                        + "                 I '-- --'I\r\n"
                        + "                 I        I         TAG\r\n"
                        + "                 I '-- --'I");
                break;
            default:
                System.out.println (""
                        + "                       ---                                     \r\n"
                        + "                    -        --                             \r\n"
                        + "                --( /     \\ )XXXXXXXXXXXXX                   \r\n"
                        + "            --XXX(   O   O  )XXXXXXXXXXXXXXX-              \r\n"
                        + "           /XXX(       U     )        XXXXXXX\\               \r\n"
                        + "         /XXXXX(              )--   XXXXXXXXXXX\\             \r\n"
                        + "        /XXXXX/ (      O     )   XXXXXX   \\XXXXX\\\r\n"
                        + "        XXXXX/   /            XXXXXX   \\   \\XXXXX----        \r\n"
                        + "        XXXXXX  /          XXXXXX         \\  ----  -         \r\n"
                        + "---     XXX  /          XXXXXX      \\           ---        \r\n"
                        + "  --  --  /      /\\  XXXXXX            /     ---=         \r\n"
                        + "    -        /    XXXXXX              '--- XXXXXX         \r\n"
                        + "      --\\/XXX\\ XXXXXX                      /XXXXX         \r\n"
                        + "        \\XXXXXXXXX                        /XXXXX/\r\n"
                        + "         \\XXXXXX                         /XXXXX/         \r\n"
                        + "           \\XXXXX--  /                -- XXXX/       \r\n"
                        + "            --XXXXXXX---------------  XXXXX--         \r\n"
                        + "               \\XXXXXXXXXXXXXXXXXXXXXXXX-            \r\n"
                        + "                 --XXXXXXXXXXXXXXXXXX-\r\n"
                        + "1184");

        }
    }

}