import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        System.out.println("Seja muito bem vindo a nossa lanchonete, já iremos apresentar nosso menu ao senhor(a).");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiramente, nos diga como gostaria de ser chamado(a): ");
        String nome = scanner.nextLine();

        System.out.println("Seja bem vindo ao nosso estabelecimento Sr(a) " + nome);

        double total = 0.0;

        ArrayList<String> carrinho = new ArrayList<>();

        boolean ContinuarPedindo = true;

        while (ContinuarPedindo) {
            System.out.println("Nós temos essas opcoes em nosso menu: ");
            System.out.println("1: Hamburguer com molho especial da casa, uma coca cola de 500ml e batata grande. R$ 35,90");
            System.out.println("2: Pizza de calabresa e 4 queijos, coca cola 1 litro e batata pequena. R$45,90");
            System.out.println("3: Sushi hotroll de salmao (10 pecas), com molho tare e molho especial do chefe. R$ 25,90");
            System.out.println("Escolha a opcao que deseja: ");

            int pedido = scanner.nextInt();

            switch (pedido) {
                case 1:
                    System.out.println("Voce escolheu a nossa primeira opcao, nossa cozinha já está avisada e assim que seu pedido for concluido iremos chamar pelo nome na tela, muito obrigado pela preferencia e volte sempre :)");
                    total += 35.90;
                    carrinho.add ("Hamburguer");
                    break;
                case 2:
                    System.out.println("Voce escolheu a nossa segunda opcao, nossa cozinha já está avisada e assim que seu pedido for concluido iremos chamar pelo nome na tela, muito obrigado pela preferencia e volte sempre :)");
                    total += 45.90;
                    carrinho.add("Pizza");
                    break;
                case 3:
                    System.out.println("Voce escolheu a nossa terceira opcao, nossa cozinha já está avisada e assim que seu pedido for concluido iremos chamar pelo nome na tela, muito obrigado pela preferencia e volte sempre :)");
                    total += 25.90;
                    carrinho.add("Sushi");
                    break;
                default:
                    System.out.println("Por favor, escolha uma das opcoes no menu, a escolhida nao existe.");
                    break;
            }
            System.out.println("Deseja algo mais? 1=Sim/2=Nao");
            int resposta = scanner.nextInt();

            if (resposta == 2) {
                ContinuarPedindo = false;
                System.out.println("- Nota Fiscal: ");
                for (String item : carrinho) {
                    System.out.println("- " + item);
                }
                System.out.printf("O valor final do pedido ficou: R$ %.2f %n ", total);
                System.out.println("Pedido encerrado. Obrigado pela preferencia " + nome + "! Volte sempre.");

            }
        }

        scanner.close();
    }
}
