package exerciciosJavaFund.ex03;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        // Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela
        // fórmula: área=base X altura

        Scanner kbm = new Scanner(System.in);
        System.out.print("Digite o tamanho da altura do retângulo: ");
        double altura = kbm.nextDouble();
        System.out.print("Digite o tamanho da base do retângulo: ");
        double base = kbm.nextDouble();
        kbm.close();
        double area = base * altura;

        System.out.println("A área do retângula de base " + base + " e altura " + altura + " é: " + area);


    }
}
