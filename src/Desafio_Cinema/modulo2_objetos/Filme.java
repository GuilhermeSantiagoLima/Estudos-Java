package Desafio_Cinema.modulo2_objetos;

public class Filme {
    private String nome;
    private String genero;
    private double preco;

    public void setPreco(double novoPreco) {
        if (novoPreco < 0) {
            System.out.println("⚠️ ERRO: Preço não pode ser negativo! O valor foi ignorado.");
        }
        else {
            this.preco = novoPreco;
        }
    }


    public void setNome (String novoNome) {
        this.nome = novoNome;
    }

    public void setGenero (String novoGenero) {
        this.genero = novoGenero;
    }

    void exibirFichaTecnica() {
        System.out.println("------ Ficha do Filme ------");
        System.out.println("Titulo do filme: " + nome);
        System.out.println("Genero do filme: " + genero);

        if (preco > 40) {
            System.out.println("Preco R$: " + preco + "Lancamento!!!");
        }
        else {
            System.out.println("Preco R$: " + preco);
        }
    }

    void aplicarDesconto (double desconto) {
        preco = preco - desconto;
    }
}
