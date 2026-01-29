package Desafio_Cinema.modulo2_objetos;

public class Filme {
    String nome;
    String genero;
    double preco;

    void exibirFichaTecnica() {
        System.out.println("----- Ficha do Filme -----");
        System.out.println("Titulo do filme: " + nome);
        System.out.println("Genero do filme: " + genero);

        if (preco > 40) {
            System.out.println("Preco R$: " + preco + "Lancamento!!!");
        }
        else {
            System.out.println("Preco R$: " + preco);
        }
    }
}
