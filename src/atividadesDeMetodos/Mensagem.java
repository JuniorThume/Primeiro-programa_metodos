package atividadesDeMetodos;

public class Mensagem {

    public static void obterMensagem(int hora){
        if(hora < 24 && hora > 0){
            if(hora >= 5 && hora <= 12){
                mensagemBomDia();
            }else if(hora >=13 && hora <=18){
                mensagemBoaTarde();
            }else mensagemBoaNoite();
        }else mensagemHoraInvalida();
    }
    public static void mensagemBomDia(){
        System.out.println("Boa Dia");
    }
    public static void mensagemBoaTarde(){
        System.out.println("Boa Tarde");
    }
    public static void mensagemBoaNoite(){
        System.out.println("Boa Noite");
    }
    public static void mensagemHoraInvalida(){
        System.out.println("Que tipo de horas sao essas, nao sou capaz de lhe informar");
    }
}
