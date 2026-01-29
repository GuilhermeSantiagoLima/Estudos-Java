package Desafio_Cinema.modulo2_objetos;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();

        filme1.nome = "Avatar 2";
        filme1.genero = "Ficcao";
        filme1.preco = 45.00;

        Filme filme2 = new Filme();

        filme2.nome = "Homem aranha";
        filme2.genero = "Ficcao";
        filme2.preco = 35.00;

        filme1.exibirFichaTecnica();
        filme2.exibirFichaTecnica();
}
}
