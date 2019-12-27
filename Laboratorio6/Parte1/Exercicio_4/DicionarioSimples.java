public class DicionarioSimples extends Dicionario {

    public DicionarioSimples() {
        Dicionario dicionario = new Dicionario();
    }

    public void mostrarTudo() {
        for (String palavra : dicionario.keySet()) {
            System.out.println(palavra + ":" + dicionario.get(palavra));
        }
    }

}