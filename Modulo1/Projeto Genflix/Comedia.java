package gen;

import java.util.Scanner;

public class Comedia extends Filme{
    Scanner read = new Scanner(System.in);


    public Comedia(String nome, String categoria, int duracao, String classificacaoIndicativa, int momento, String descricao)
    {
        super(nome, "Comedia", duracao, classificacaoIndicativa, momento, descricao);
        // TODO Auto-generated constructor stub
    }

    @Override

    public void efeitoVisual() {

        int n = (int) (Math.random()*4.0);

        switch(n)
        {
            case 0:
                System.out.println("    ,,,,,,,,,,,,,\r\n"
                        + "    .;;;;;;;;;;;;;;;;;;;,.\r\n"
                        + "  .;;;;;;;;;;;;;;;;;;;;;;;;,\r\n"
                        + ".;;;;;;;;;;;;;;;;;;;;;;;;;;;;.\r\n"
                        + ";;;;;@;;;;;;;;;;;;;;;;;;;;;;;;' .............\r\n"
                        + ";;;;@@;;;;;;;;;;;;;;;;;;;;;;;;'.................\r\n"
                        + ";;;;@@;;;;;;;;;;;;;;;;;;;;;;;;'...................\r\n"
                        + "`;;;;@;;;;;;;;;;;;;;;@;;;;;;;'.....................\r\n"
                        + " `;;;;;;;;;;;;;;;;;;;@@;;;;;'..................;....\r\n"
                        + "   `;;;;;;;;;;;;;;;;@@;;;;'....................;;...\r\n"
                        + "     `;;;;;;;;;;;;;@;;;;'...;.................;;....\r\n"
                        + "        `;;;;;;;;;;;;'   ...;;...............;.....\r\n"
                        + "           `;;;;;;'        ...;;..................\r\n"
                        + "              ;;              ..;...............\r\n"
                        + "              `                  ............\r\n"
                        + "             `                      ......\r\n"
                        + "            `                         ..\r\n"
                        + "           `                           '\r\n"
                        + "          `                           '\r\n"
                        + "         `                           '\r\n"
                        + "        `                           `\r\n"
                        + "        `                           `,\r\n"
                        + "        `\r\n"
                        + "         `\r\n"
                        + "           `.");
                break;

            case 1:
                System.out.println(  "a@@@@@@@@a  a@@@@@@a  a@@@@@@@a a@@@@@@@@a a@@a.  .a@@a  a@@a \r\n"
                        + "@@@@  @@@@ @@@@  @@@@ @@@@  @@@ @@@@@@@@@@ @@@@a  a@@@@  @@@@ \r\n"
                        + "@@@@  @@@@ @@@@  @@@@ @@@@  @@@    @@@@    `@@@@  @@@@'  @@@@ \r\n"
                        + "@@@@@@@@@@ @@@@@@@@@@ @@@@@@@@'    @@@@      `@@@@@@'    @@@@ \r\n"
                        + "@@@@@@@@@' @@@@@@@@@@ @@@@@@@@a    @@@@        @@@@      `@@' \r\n"
                        + "@@@@       @@@@  @@@@ @@@@ @@@@    @@@@        @@@@ \r\n"
                        + "@@@@       @@@@  @@@@ @@@@ @@@@    @@@@        @@@@       @@");

                break;
            case 2:
                System.out.println(""
                        + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$'               `$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  \r\n"
                        + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$'                   `$$$$$$$$$$$$$$$$$$$$$$$$$$$$\r\n"
                        + "$$$'`$$$$$$$$$$$$$'`$$$$$$!                       !$$$$$$'`$$$$$$$$$$$$$'`$$$\r\n"
                        + "$$$$  $$$$$$$$$$$  $$$$$$$                         $$$$$$$  $$$$$$$$$$$  $$$$\r\n"
                        + "$$$$. `$' \\' \\$`  $$$$$$$!                         !$$$$$$$  '$/ `/ `$' .$$$$\r\n"
                        + "$$$$$. !\\  i  i .$$$$$$$$                           $$$$$$$$. i  i  /! .$$$$$\r\n"
                        + "$$$$$$   `--`--.$$$$$$$$$                           $$$$$$$$$.--'--'   $$$$$$\r\n"
                        + "$$$$$$L        `$$$$$^^$$                           $$^^$$$$$'        J$$$$$$\r\n"
                        + "$$$$$$$.   .'   \"\"~   $$$    $.                 .$  $$$   ~\"\"   `.   .$$$$$$$\r\n"
                        + "$$$$$$$$.  ;      .e$$$$$!    $$.             .$$  !$$$$$e,      ;  .$$$$$$$$\r\n"
                        + "$$$$$$$$$   `.$$$$$$$$$$$$     $$$.         .$$$   $$$$$$$$$$$$.'   $$$$$$$$$\r\n"
                        + "$$$$$$$$    .$$$$$$$$$$$$$!     $$`$$$$$$$$'$$    !$$$$$$$$$$$$$.    $$$$$$$$\r\n"
                        + "$JT&yd$     $$$$$$$$$$$$$$$$.    $    $$    $   .$$$$$$$$$$$$$$$$     $by&TL$\r\n"
                        + "                                 $    $$    $\r\n"
                        + "                                 $.   $$   .$\r\n"
                        + "                                 `$        $'\r\n"
                        + "                                  `$$$$$$$$'");


                break;
            default:
                System.out.println(""
                        + "                            _          _\r\n"
                        + "                           (c)___c____(c)\r\n"
                        + "                            \\ ........../\r\n"
                        + "                             |.........|\r\n"
                        + "                              |.......|\r\n"
                        + "                              |.......|\r\n"
                        + "                              |=======|\r\n"
                        + "                              |=======|\r\n"
                        + "                             __o)\"\"\"\"::?\r\n"
                        + "                            C__    c)::;\r\n"
                        + "                               >--   ::     /\\\r\n"
                        + "                               (____/      /__\\\r\n"
                        + "                               } /\"\"|      |##|\r\n"
                        + "                    __/       (|V ^ )\\     |##|\r\n"
                        + "                    o | _____/ |#/ / |     |##|\r\n"
                        + "           @        o_|}|_____/|/ /  |     |##|\r\n"
                        + "                          _____/ /   |     ~!!~\r\n"
                        + "              ======ooo}{|______)#   |     /`'\\\r\n"
                        + "          ~~~~ ;    ;          ###---|8     \"\"\r\n"
                        + "        ____;_____;____        ###====     /:|\\\r\n"
                        + "       (///0///@///@///)       ###@@@@|\r\n"
                        + "       |~~~~~~~~~~~~~~~|       ###@@@@|\r\n"
                        + "        \\             /        ###@@@@|               +\r\n"
                        + "         \\___________/         ###xxxxx      /\\      //\r\n"
                        + "           H H   H  H          ###|| |      /  \\    //\r\n"
                        + "           H H   H  H           | || |     /____\\  /~_^_\r\n"
                        + "           H H   H  H           C |C |     _|@@|_ /__|#|_\r\n"
                        + "           H H   H  H            || ||    /_|@@|_/___|#|/|\r\n"
                        + " v    \\/   H(o) (o) H            || ::   |:::::::::::::|#|\r\n"
                        + " ~    ~~  (o)      (o)        Ccc__)__)  |ROMAN CANDLES|#|\r\n"
                        + "  \\|/      ~   @* & ~                    |:::::::::::::|/  \\|/\r\n"
                        + "   ~           \\|/        !!        \\ !/  ~~~~~~~~~~~~~    ~~~\r\n"
                        + "               ~~~        ~~         ~~           ~~\r\n"
                        + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

    @Override

    public void mensagemInicio() {

        int n = (int) (Math.random()*4.0);

        switch(n)
        {
            case 0:
                System.out.println ("Ah, você está tendo um dia ruim. Por acaso você morreu? Então seu dia está ótimo.");
                break;

            case 1:
                System.out.println ("A vida em primeiro lugar é sempre emocionante.");
                break;

            case 2:
                System.out.println ("Jesus às vezes se disfarça de mendigo pra testar a bondade dos homens");
                break;

            default:
                System.out.println ("Ambos precisam do que o outro tem. Isso os mantém unidos.");
        }

    }

}