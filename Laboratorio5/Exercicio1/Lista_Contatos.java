import java.util.ArrayList;

public class Lista_Contatos {

    private ArrayList<Contato> lista_contato;

    public Lista_Contatos() {
        lista_contato = new ArrayList<Contato>();
    }

    public boolean AdicionaContato(String nome, int telefone) {
        Contato contato = new Contato(nome, telefone);
        return lista_contato.add(contato);
    }

    public int BuscarContato(String name) {
        for (Contato contato : lista_contato) {
            if (contato.GetNome().equals(name))
                return contato.GetTelefone();
        }
        System.out.println("nao existe");
        return -1;
    }

    public int NumeroContatos() {
        return lista_contato.size();
    }

    public void EscreveContatos() {
        for (Contato contato : lista_contato) {
            System.out.println(contato.GetNome() + " " + contato.GetTelefone());
        }
    }

}