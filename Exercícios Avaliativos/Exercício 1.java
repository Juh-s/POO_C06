package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a quantidade de ingressos inteiros: ");
        int QuantidadeInteiro = teclado.nextInt();

        System.out.println("Valor do ingresso inteiro: ");
        String ValorStingInteiro = teclado.next().replace(",", ".");
        double ValorInteiro = Double.parseDouble(ValorStingInteiro);

        System.out.println("Digite a quantidade de ingressos meia-entrada:");
        int QuantidadeMeia = teclado.nextInt();

        System.out.println("Valor do ingresso meia-entrada: ");
        String ValorStingMeia = teclado.next().replace(",", ".");
        double ValorMeia = Double.parseDouble(ValorStingMeia);

        double TotalInteiro = ValorInteiro * QuantidadeInteiro;
        double TotalMeia = ValorMeia * QuantidadeMeia;
        double Total = TotalInteiro + TotalMeia;

        double ValorMedio = Total/(QuantidadeMeia + QuantidadeInteiro);

        System.out.printf("Valor total arrecadado com ingressos inteiros: R$ %.2f\n", TotalInteiro);
        System.out.printf("Valor total arrecadado com meia-entrada: R$ %.2f\n", TotalMeia);
        System.out.printf("Valor total arrecadado na sessão: R$ %.2f\n", Total);
        System.out.printf("Valor médio pago por ingresso: R$ %.2f\n", ValorMedio);
    }
}
