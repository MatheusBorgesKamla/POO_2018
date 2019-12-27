public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa();
        Casa casa2 = new Casa("verde", 5);
        System.out.println("A casa1 possui ao todo " + casa1.totalDePortas() + " portas");
        System.out.println("A casa2 possui ao todo " + casa2.totalDePortas() + " portas");
        casa1.adicionaPorta(1);// adicionei uma porta aberta - adicionaPorta(0) para add fechada
        System.out.println("A casa1 possui ao todo " + casa1.totalDePortas() + " portas");
        casa1.abrePorta(2);
        System.out.println("A casa1 possui ao todo " + casa1.quantasPortasEstaoAbertas() + " portas abertas");
        System.out.println("A casa1 possui ao todo " + casa1.totalDePortas() + " portas");
        System.out.println("A casa1 possui a cor " + casa1.RetornaCor());
        casa1.pinta("azul");
        System.out.println("A casa1 possui a cor " + casa1.RetornaCor());
        casa1.fechaPorta(1);
        System.out.println("A casa1 possui ao todo " + casa1.quantasPortasEstaoAbertas() + " portas abertas");

        

    }
}