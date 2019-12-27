public class DicionarioIP extends Dicionario {

    public DicionarioIP() {
        super();
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