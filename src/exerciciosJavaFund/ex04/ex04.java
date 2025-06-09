package exerciciosJavaFund.ex04;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        // Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas

        Scanner kbm = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = kbm.nextLine();
        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = kbm.nextInt();

        kbm.nextLine(); // apenas para pegar o "\n" do nextInt que fica no buffer e assim limpar para a próxima execução

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = kbm.nextLine();
        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = kbm.nextInt();

        if (idade1 > idade2) {
            double diferenca = idade1 - idade2;
            System.out.println(nome1 + " é mais velho(a) que " + nome2 + " em " + diferenca + " ano(s)");
        } else {
            double diferenca = idade2 - idade1;
            System.out.println(nome2 + " é mais velho(a) que " + nome1 + " em " + diferenca + " ano(s)");
        }
        kbm.close();
    }
}
