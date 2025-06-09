package exerciciosJavaFund.ex01;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        // Escreva um código que receba o nome e o ano de nascimento de alguém e
        // imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos

        Scanner kbm = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = kbm.nextLine();
        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = kbm.nextInt();
        kbm.close();
        int anoAtual = 2025;
        int idade = anoAtual - anoNascimento;

        System.out.println("Olá " + nome + " você tem " + idade + " anos.");
    }
}
