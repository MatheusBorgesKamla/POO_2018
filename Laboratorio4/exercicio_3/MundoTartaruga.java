/*
     Matheus Borges Kamla 10277015 - implementação da classe MundoTartaruga no mesmo molde do MundoYoshi
*/
public class MundoTartaruga {

    private Tartaruga tartaruga1, objeto1, objeto2, objeto3, objeto4;
    private TartarugaMensageira objeto5;

    public MundoTartaruga() {
        tartaruga1 = new Tartaruga();
        objeto1 = new Tartaruga("yellow", 13, 10);
        objeto2 = new Tartaruga("red", 0, 1);
        objeto3 = new Tartaruga("blue", 4, 7);
        objeto4 = new Tartaruga("green", 0, 0);
        objeto5 = new TartarugaMensageira("green", 2, 3);
    }

    public void cenario() {
        tartaruga1.setColor("green");
        tartaruga1.irParaAbaixo(3);
        tartaruga1.irParaAbaixo(5);
        objeto1.irParaDireita(1);
        objeto1.irParaCima(4);
        objeto1.irParaEsquerda(10);
        objeto2.irParaAbaixo(5);
        objeto2.irParaDireita(7);
        objeto2.irParaEsquerda(3);
        objeto2.irParaAbaixo(3);
        objeto2.irParaDireita(4);
        objeto3.irParaEsquerda(3);
        objeto3.irParaAbaixo(5);
        objeto3.irParaDireita(8);
        objeto3.irParaCima(6);
        objeto4.irParaDireita(10);
        objeto4.irParaAbaixo(14);
        objeto4.irParaEsquerda(4);
        objeto4.irParaCima(6);
        objeto4.irParaDireita(4);
        System.out.println(tartaruga1.getColor() + "," + tartaruga1.getPosicaoX() + "," + tartaruga1.getPosicaoY());
        System.out.println(objeto1.getColor() + "," + objeto1.getPosicaoX() + "," + objeto1.getPosicaoY());
        System.out.println(objeto2.getColor() + "," + objeto2.getPosicaoX() + "," + objeto2.getPosicaoY());
        System.out.println(objeto3.getColor() + "," + objeto3.getPosicaoX() + "," + objeto3.getPosicaoY());
        System.out.println(objeto4.getColor() + "," + objeto4.getPosicaoX() + "," + objeto4.getPosicaoY());
        objeto5.leva_mensagem("Olá eu sou o Yoshi", 7, 11);
    }
}
