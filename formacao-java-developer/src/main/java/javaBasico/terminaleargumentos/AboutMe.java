package javaBasico.terminaleargumentos;

/**
    O algoritmo a seguir funciona similarmente ao Metodo Scanner
    sendo que executado diretamente ao terminal.

    1 - No terminal digite (java [o nome do arquivo que deseja executar].java) arg[0] arg[1] arg[2] arg[3]
    java AboutMe.java Thiago Vinicius 28 1.73
*/

public class AboutMe {
    public static void main(String[] args) {
        // os argumentos começam com o indice 0
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + " cm.");

    }
}