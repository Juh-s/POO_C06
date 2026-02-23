package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var quantidadeInteiro = 8;
        var quantidadeMeia = 5;
        var quantidade = (quantidadeMeia + quantidadeInteiro);
        var valorInteiro = 30;
        var valorMeia = 15;
        var arrecadadoInteiro = (quantidadeInteiro * valorInteiro);
        var arrecadadoMeia = (quantidadeMeia * valorMeia);
        var arrecadadoTotal = (arrecadadoMeia + arrecadadoInteiro);
        var valorMedio = (arrecadadoTotal/quantidade);

        System.out.println("Valor arrecadado de ingressos: Inteiros--> " + arrecadadoInteiro + " Meia-entrada--> " + arrecadadoMeia);
        System.out.println("Valor total arrecadado: " + arrecadadoTotal);
        System.out.println("Valor médio pago por ingresso: " + valorMedio);
    }
}