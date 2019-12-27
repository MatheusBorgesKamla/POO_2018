public class DicionarioSimples extends Dicionario {

    public DicionarioSimples() {
        super();
    }

    

    public void mostrarTudo() {
        for (String palavra : dicionario.keySet()) {
            System.out.println(palavra + ":" + dicionario.get(palavra));
        }
    }

}