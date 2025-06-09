package exerciciosJavaFund.ex02;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        // Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
        //  fórmula: área = lado X lado

        Scanner kbm = new Scanner(System.in);
        System.out.print("Digite o tamanho do lado: ");
        double lado = kbm.nextDouble();
        kbm.close();

        double area = lado * lado;

        System.out.println("Area do quadrado de lado " + lado + " é: " + area);
    }

}
