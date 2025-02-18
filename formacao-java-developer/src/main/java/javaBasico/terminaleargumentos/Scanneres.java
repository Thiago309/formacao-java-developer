package javaBasico.terminaleargumentos;

import java.util.Locale;
import java.util.Scanner;

public class Scanneres {
    public static void main(String[] args) {
    // Criando o Objeto Scanner informando que a linguagem padrão é americana.
    Scanner input = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome");
    String nome = input.next();

    System.out.println("Digite seu sobrenome");
    String sobrenome = input.next();

    System.out.println("Digite sua idade");
    int idade = input.nextInt();

    System.out.println("Digite seu altura");
    double altura = input.nextDouble();

    System.out.println("Ola, me chamo " + nome + " " + sobrenome);
    System.out.println("Tenho " + idade + " anos.");
    System.out.println("Minha altura é " + altura + " cm.");
    }
}