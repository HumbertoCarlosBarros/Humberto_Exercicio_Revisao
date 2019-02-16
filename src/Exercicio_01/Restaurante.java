package Exercicio_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args){
        DecimalFormat f = new DecimalFormat("#,###.##");
        final double GORJETA = 0.1;
        Scanner S = new Scanner(System.in);

        System.out.print("Valor da conta:");

        double conta = S.nextDouble();
        double resultado = conta*GORJETA + conta;

        System.out.println("Valor da conta:       R$-" + f.format(conta));
        System.out.println("Valor da Gorjeta:     R$-" + f.format(conta*GORJETA));
        System.out.println("Valor total da conta: R$-" + f.format(resultado));
    }
}

