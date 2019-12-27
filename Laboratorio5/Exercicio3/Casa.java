import java.util.ArrayList;

public class Casa {

    private String cor;
    private int totalDePortas;
    private ArrayList<Porta> portas = new ArrayList<Porta>();

    public Casa() { // construtor que determina variáveis do objeto por default
        cor = "branco";
        totalDePortas = 3;
        for (int i = 0; i < totalDePortas; i++) {
            portas.add(new Porta()); // defino todas as portas como fechadas
        }
    }

    public Casa(String cor, int totalDePortas) {
        this.cor = cor;
        this.totalDePortas = totalDePortas;
        for (int i = 0; i < totalDePortas; i++) {
            portas.add(new Porta()); // defino todas as portas como fechadas
        }
    }

    public void pinta(String s) {
        this.cor = s;
    }

    public int totalDePortas() {
        return portas.size();
    }

    public void adicionaPorta(int estado) {
        totalDePortas++;
        portas.add(new Porta(estado)); // Permite adicionar uma porta já fechada ou aberta
    }

    public void abrePorta(int portas_abertas) {
        int cont = 0;
        for (int i = 0; i < portas.size(); i++) {
            if (!portas.get(i).SeAberta()) {// testo se está fechada para poder abrir
                portas.set(i, new Porta(1));// abro uma porta
                cont++;
            }
            if (cont == portas_abertas)// se já tiver aberto o número que queria paro
                break;
        }
        if (cont < portas_abertas)// retorno uma mensagem caso não tenha conseguido abrir todas
            System.out.println("So foi possivel abrir " + (portas_abertas - cont));
    }

    public void fechaPorta(int portas_fechadas) {
        int cont = 0;
        for (int i = 0; i < portas.size(); i++) {
            if (portas.get(i).SeAberta()) {// testo se está aberta para poder fechar
                portas.set(i, new Porta(0));// abro uma porta
                cont++;
            }
            if (cont == portas_fechadas)// se já tiver aberto o número que queria paro
                break;
        }
        if (cont < portas_fechadas) // retorno uma mensagem caso não tenha conseguido fechar todas
            System.out.println("So foi possivel fechar " + (portas_fechadas - cont));
    }

    public int quantasPortasEstaoAbertas() {
        int cont = 0;
        for (Porta aux : portas) {
            if (aux.SeAberta())
                cont++;
        }
        return cont;
    }

    public String RetornaCor() {
        return cor;
    }

}