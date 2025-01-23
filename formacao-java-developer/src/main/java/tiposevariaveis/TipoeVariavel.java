package tiposevariaveis;

public class TipoeVariavel {

    /*float pi = 3.14;*/ /* Para definir uma variavel do tipo float é importante sempre por o F,
    no final do valor, se não, a variavel será confundida com o tipo double, veja o exemplo a baixo seguir.*/
    float pi = 3.14F;

    /*Java é fortemente tipado*/

    /*
    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = numeroNormal; // respeita muito os bytes de memorias de cada variavel.
    */

    short numeroCurto = 1;          //  tamanho(2 byte)
    int numeroNormal = numeroCurto; //     ""  (4 bytes)
    short numeroCurto2 = (short) numeroNormal; //caso seja necessario, utilize o cast(short).
    //Que significa que você estará responsavel com oque acontecer em seu resultado.

    /*
        int numero = 5;
        numero = 10;

        final double PI = 3.14; // final == Constante.
        PI = 4; //  Gera um error...

    */
}
