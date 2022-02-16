package atividadesDeMetodos;

public class Calculadora {

    public static void soma(double valor1, double valor2){
        double resultado = valor1 + valor2;
        System.out.println("A soma entre " + valor1 + " e " + valor2 + " eh: " + resultado);
    }
    public static void subtacao(double valor1, double valor2){
        double resultado = valor1 - valor2;
        System.out.println("A subtacao entre " + valor1 + " e " + valor2 + " eh: " + resultado);
    }
    public static void multiplicacao(double valor1, double valor2){
        double resultado = valor1 * valor2;
        System.out.println("A multiplicacao entre " + valor1 + " e " + valor2 + " eh: " + resultado);
    }
    public static void divisao(double valor1, double valor2){
        double resultado = valor1 / valor2;
        System.out.println("A divisao entre " + valor1 + " e " + valor2 + " eh: " + resultado);
    }
}
