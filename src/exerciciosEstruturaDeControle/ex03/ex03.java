package exerciciosEstruturaDeControle.ex03;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        /*
            Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e
            escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares
            (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados
            e em ordem decrescente;
         */

        Scanner kbm = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = kbm.nextInt();
        System.out.print("Digite um segundo numero maior que o anterior: ");
        int num2 = kbm.nextInt();
        System.out.print("Escolha entre 1 para impar ou 2 para par: ");
        int escolha = kbm.nextInt();
        switch (escolha) {
            case 1:
                for (int i = num; i <= num2; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
                break;
            case 2:
                for (int i = num; i <= num2; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
                break;
        }
        kbm.close();
    }
}
