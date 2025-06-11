package exerciciosEstruturaDeControle.ex01;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        // Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número

        Scanner kbm = new Scanner(System.in);
        System.out.print("Digite um número positivo inteiro: ");
        int num = kbm.nextInt();
        kbm.close();

        for (int i = 0; i <= 10; i++) {
            if (i == 0){
                continue;
            }
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
    }
}
