package gen;

import java.util.Scanner;

public class Suspense extends Filme {

    Scanner read = new Scanner(System.in);


    public Suspense (String nome, String categoria, int duracao, String classificacaoIndicativa,
                     int momento, String descricao)
    {
        super(nome,"Suspense",duracao,classificacaoIndicativa,momento,descricao);

    }
    @Override

    public void mensagemInicio() {

        int n = (int) (Math.random()*4.0);

        switch(n)
        {
            case 0:
                System.out.println ("As coisas que você possui acabam possuindo você.");
                break;
            case 1:
                System.out.println ("Pensa isso mesmo, ou é assim que eles querem que você pense?");
                break;
            case 2:
                System.out.println ("Creio no riso e nas lágrimas como antídotos contra o ódio e o terror...");
                break;
            default:
                System.out.println ("A mente é algo terrível de se desperdiçar.");

        }
    }


    @Override

    public void efeitoVisual() {

        int n = (int) (Math.random()*4.0);

        switch(n)
        {
            case 0:
                System.out.println (""
                        + " ________________________\r\n"
                        + "|.----------------------.|\r\n"
                        + "||                      ||\r\n"
                        + "||       ______         ||\r\n"
                        + "||     .;;;;;;;;.       ||\r\n"
                        + "||    /;;;;;;;;;;;\\     ||\r\n"
                        + "||   /;/`    `-;;;;; . .||\r\n"
                        + "||   |;|__  __  \\;;;|   ||\r\n"
                        + "||.-.|;| e`/e`  |;;;|   ||\r\n"
                        + "||   |;|  |     |;;;|'--||\r\n"
                        + "||   |;|  '-    |;;;|   ||\r\n"
                        + "||   |;;\\ --'  /|;;;|   ||\r\n"
                        + "||   |;;;;;---'\\|;;;|   ||\r\n"
                        + "||   |;;;;|     |;;;|   ||\r\n"
                        + "||   |;;.-'     |;;;|   ||\r\n"
                        + "||'--|/`        |;;;|--.||\r\n"
                        + "||;;;;    .     ;;;;.\\;;||\r\n"
                        + "||;;;;;-.;_    /.-;;;;;;||\r\n"
                        + "||;;;;;;;;;;;;;;;;;;;;;;||\r\n"
                        + "||jgs;;;;;;;;;;;;;;;;;;;||\r\n"
                        + "'------------------------'");
                break;
            case 1:
                System.out.println (" "
                        + "/\\                 /\\\r\n"
                        + "/ \\'._   (\\_/)   _.'/ \\\r\n"
                        + "|.''._'--(o.o)--'_.''.|\r\n"
                        + " \\_ / `;=/ \" \\=;` \\ _/\r\n"
                        + "   `\\__| \\___/ |__/`\r\n"
                        + "jgs     \\(_|_)/\r\n"
                        + "         \" ` \"");

                break;
            case 2:
                System.out.println (" "
                        + "          ;               ,           \r\n"
                        + "         ,;                 '.         \r\n"
                        + "        ;:                   :;        \r\n"
                        + "       ::                     ::       \r\n"
                        + "       ::                     ::       \r\n"
                        + "       ':                     :        \r\n"
                        + "        :.                    :        \r\n"
                        + "     ;' ::                   ::  '     \r\n"
                        + "    .'  ';                   ;'  '.    \r\n"
                        + "   ::    :;                 ;:    ::   \r\n"
                        + "   ;      :;.             ,;:     ::   \r\n"
                        + "   :;      :;:           ,;\"      ::   \r\n"
                        + "   ::.      ':;  ..,.;  ;:'     ,.;:   \r\n"
                        + "    \"'\"...   '::,::::: ;:   .;.;\"\"'    \r\n"
                        + "        '\"\"\"....;:::::;,;.;\"\"\"         \r\n"
                        + "    .:::.....'\"':::::::'\",...;::::;.   \r\n"
                        + "   ;:' '\"\"'\"\";.,;:::::;.'\"\"\"\"\"\"  ':;   \r\n"
                        + "  ::'         ;::;:::;::..         :;  \r\n"
                        + " ::         ,;:::::::::::;:..       :: \r\n"
                        + " ;'     ,;;:;::::::::::::::;\";..    ':.\r\n"
                        + "::     ;:\"  ::::::\"\"\"'::::::  \":     ::\r\n"
                        + " :.    ::   ::::::;  :::::::   :     ; \r\n"
                        + "  ;    ::   :::::::  :::::::   :    ;  \r\n"
                        + "   '   ::   ::::::....:::::'  ,:   '   \r\n"
                        + "    '  ::    :::::::::::::\"   ::       \r\n"
                        + "       ::     ':::::::::\"'    ::       \r\n"
                        + "       ':       \"\"\"\"\"\"\"'      ::       \r\n"
                        + "        ::                   ;:        \r\n"
                        + "        ':;                 ;:\"        \r\n"
                        + "-hrr-     ';              ,;'          \r\n"
                        + "            \"'           '\"            \r\n"
                        + "              '");
                break;
            default:
                System.out.println (" "
                        + "___    ___\r\n"
                        + "( _<    >_ )\r\n"
                        + "//        \\\\\r\n"
                        + "\\\\___..___//\r\n"
                        + " `-(    )-'\r\n"
                        + "   _|__|_\r\n"
                        + "  /_|__|_\\\r\n"
                        + "  /_|__|_\\\r\n"
                        + "  /_\\__/_\\\r\n"
                        + "   \\ || /  _)\r\n"
                        + "     ||   ( )\r\n"
                        + "Max  \\\\___//\r\n"
                        + "      `---' ");

        }
    }

}