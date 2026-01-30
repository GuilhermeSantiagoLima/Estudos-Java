package Desafio_Cinema.modulo2_objetos;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();

        filme1.setNome("Avatar 2");
        filme1.setGenero("Aventura");
        filme1.setPreco(45.00);

        System.out.println("Tentando definir preço -500...");
        filme1.setPreco(-500.00);

        System.out.println("Tentando definir preço 45...");
        filme1.setPreco(45.00);

        Filme filme2 = new Filme();

        filme2.setNome("Homem Aranha");
        filme2.setGenero("Aventura");
        filme2.setPreco(35.00);

        System.out.println("--- Precos Originais ---");
        filme1.exibirFichaTecnica();
        filme2.exibirFichaTecnica();

        filme1.aplicarDesconto(15.00);

        System.out.println("\n--- Depois da Promocao ---");
        System.out.println("O preco do avatar caiu!!!");

        filme1.exibirFichaTecnica();
        filme2.exibirFichaTecnica();
}
}
