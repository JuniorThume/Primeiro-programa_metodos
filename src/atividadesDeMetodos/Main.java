package atividadesDeMetodos;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercicio da Calculadora");
        Calculadora.soma(14,20);
        Calculadora.subtacao(10,23);
        Calculadora.divisao(14,7);
        Calculadora.multiplicacao(8,3);


        System.out.println("/n/nExercicio da Mensagem");
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(23);
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(25);


        System.out.println("/n/nExercicio da Emprestimo");
        Emprestimo.calcula(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcula(2000,Emprestimo.getTresParcelas());
        Emprestimo.calcula(3000,Emprestimo.getDuasParcelas());
        Emprestimo.calcula(4000,Emprestimo.getTresParcelas());
    }
}
