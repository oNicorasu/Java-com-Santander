package exerciciosEstruturaDeControle.ex02;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        /*
        Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura))
        e seja exibida a mensagem de acordo com o resultado:

            Se for menor ou igual a 18,5 "Abaixo do peso";
            Se for entre 18,6 e 24,9 "Peso ideal";
            Se for entre 25,0 e 29,9 "Levemente acima do peso";
            Se for entre 30,0 e 34,9 "Obesidade Grau I";
            Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
            Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
         */

        Scanner kbm = new Scanner(System.in);
        System.out.println("Digite sua altura em metros: ");
        double altura = kbm.nextDouble();
        System.out.println("Digite seu peso em kilos: ");
        double peso = kbm.nextDouble();
        kbm.close();

        double imc = peso / (altura * altura);

        if (imc >= 40) {
            System.out.println("Obesidade III (Mórbida) IMC: " + imc);
        }else if (imc >= 35) {
            System.out.println("Obesidade Grau II (Severa) IMC: " + imc);
        }else if (imc >= 30) {
            System.out.println("Obesidade Grau I IMC: " + imc);
        }else if (imc >= 25) {
            System.out.println("Levemente acima do peso IMC: " + imc);
        }else if (imc >= 18.6) {
            System.out.println("Peso ideal IMC: " + imc);
        }else {
            System.out.println("Abaixo do peso IMC: " + imc);
        }
    }
}
