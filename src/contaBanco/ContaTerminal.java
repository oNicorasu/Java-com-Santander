package contaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // Desafio - https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe

        Scanner kbm = new Scanner(System.in);
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = kbm.nextInt();
        kbm.nextLine();
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = kbm.nextLine();
        System.out.print("Por favor, digite o seu Nome: ");
        String nome = kbm.nextLine();
        System.out.print("Por favor, digite o número do Saldo: ");
        double saldo = kbm.nextDouble();
        kbm.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",nome,agencia,numero,saldo);
    }
}
