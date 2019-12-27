import java.util.ArrayList;
import java.util.HashMap;

public class BancoDicionarios extends Dicionario {
    private ArrayList<Dicionario> banco;

    public BancoDicionarios() {
        banco = new ArrayList<Dicionario>();
    }

    /* Checa se o conteúdo de dois dicionarios sao iguais */
    private boolean ComparaDicionario(HashMap<String, String> dic1, HashMap<String, String> dic2) {
        int cont = 0;
        for (String aux1 : dic1.keySet()) {
            for (String aux2 : dic2.keySet()) {
                if (aux1.equals(aux2)) {
                    if (dic1.get(aux1).equals(dic2.get(aux2))) {
                        cont++;
                    }

                }
            }
        }
        if (cont == dic1.size())
            return true;
        else
            return false;
    }

    /* Checa se o banco já contém um dicionário de mesmo conteúdo */
    private boolean contemDicionario(Dicionario dicionario) {
        for (Dicionario aux : banco) {
            if (ComparaDicionario(aux.Getdicionario(), dicionario.Getdicionario()))
                return true;
        }
        return false;
    }

    public boolean adicionarDicionario(Dicionario dic) {
        if (!contemDicionario(dic)) {
            banco.add(dic);
            return true;
        } else {
            return false;
        }
    }

    public void mostrarConteudoDicionarios() {
        for (Dicionario aux : banco) {
            aux.mostrarTudo();
        }
    }

}