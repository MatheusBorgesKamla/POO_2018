import java.util.HashMap;

public class Dicionario {
    protected HashMap<String, String> dicionario;

    public Dicionario() {
        dicionario = new HashMap<String, String>();
    }

    public boolean adicionar(String palavra, String significado) {
        if (dicionario.containsKey(palavra)) {
            return false;
        } else {
            dicionario.put(palavra, significado);
            return true;
        }
    }

    public String buscar(String palavra) {
        if (dicionario.containsKey(palavra)) {
            return dicionario.get(palavra);
        } else {
            return "";
        }
    }

    public HashMap<String,String> Getdicionario(){
        return dicionario;
    }

    public void mostrarTudo() {
        for (String palavra : dicionario.keySet()) {
            System.out.println(palavra + ":" + dicionario.get(palavra));
        }
    }
}