package Desafio_Cinema;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Olá, seja muito bem vindo(a) ao CineJava!!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Seja muito bem vindo(a), " + nome);
        double total = 0.0;

        ArrayList<String> carrinho = new ArrayList<>();

        boolean ContinuarPedindo = true;

        while (ContinuarPedindo){

            mostrarCartaz();

            int pedido = scanner.nextInt();
            switch (pedido) {

                case 1:
                    System.out.println("Voce escolheu o filme: Homem Aranha. R$30,00");
                    total += 30.00;
                    carrinho.add("Homem aranha");
                    break;
                case 2:
                    System.out.println("Voce escolheu o filme: Barbie. R$25,00");
                    total += 25.00;
                    carrinho.add("Barbie");
                    break;
                case 3:
                    System.out.println("Voce escolheu o filme: Oppenheimer. R$35,00");
                    total += 35.00;
                    carrinho.add("Oppenheimer");
                    break;
            }

            System.out.println("Deseja algo mais? 1=Sim/2=Nao");

            int resposta = scanner.nextInt();

            if (resposta == 2) {
                ContinuarPedindo = false;

                imprimirNotaFiscal(carrinho, total);

                System.out.println("Qual o valor entregue pelo cliente?");
                double valorPago = scanner.nextDouble();

                double trocoFinal = calcularTroco(valorPago, total);

                System.out.printf("O valor do troco será de: R$ %.2f %n", trocoFinal);
                System.out.println("Ingressos comprados, muito obrigado Sr(a) " + nome + "!!");

            }
        }

        scanner.close();
    }

    public static void mostrarCartaz () {
        System.out.println("-----Filmes-----");
        System.out.println("1 - Homem Aranha - R$ 30,00");
        System.out.println("2 - Barbie - R$ 25,00");
        System.out.println("3 - Oppenheimer - R$ 35,00");

    }

    public static void imprimirNotaFiscal (ArrayList<String> listaDeItens, double valorFinal) {
        for (String item: listaDeItens){
            System.out.println("- " + item);
        }
        System.out.printf("Valor total: R$ %.2f %n", valorFinal);
        System.out.println("--------------------------");
    }

    public static double calcularTroco ( double valorEntregue, double valorDoPedido) {
        double troco = valorEntregue - valorDoPedido;

        return troco;
    }
}
