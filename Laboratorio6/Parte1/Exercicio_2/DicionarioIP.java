import java.util.HashMap;

public class DicionarioIP {

    private HashMap<String, String> dicionario;

    public DicionarioIP() {
        dicionario = new HashMap<String, String>();
    }

    public boolean adicionar(String palavra, String sinonimos) {
        if (dicionario.containsKey(palavra)) {
            return false;
        } else {
            dicionario.put(palavra, sinonimos);
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

    public void mostrarTudo() {
        String[] sinonimos;
        for (String palavra : dicionario.keySet()) {
            sinonimos = dicionario.get(palavra).split(" ");
            System.out.print(palavra + ":" + sinonimos[0]);
            for (int i = 1; i < sinonimos.length; i++) {
                System.out.print("," + sinonimos[i]);
            }
            System.out.print("\n");
        }
    }

}