package exerciciosEstruturaDeControle.ex04;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        /*
              Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números,
              a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente
              de 0 na divisão, números menores que o primeiro número devem ser ignorados
         */

        Scanner kbm = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = kbm.nextInt();
        int num2;
        do {
            System.out.print("Digite outro numero: ");
            num2 = kbm.nextInt();
            if (num2 < num) {
                num2 = num;
                continue;
            }
        } while (num2 % num == 0);
        kbm.close();
    }
}
