import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> lista_contato;

    public Agenda() {
        lista_contato = new ArrayList<Contato>();
    }

    public boolean AdicionaContato(String nome, int telefone, int idade) {
        for (Contato aux : lista_contato) {
            if (aux.GetNome().equals(nome) && aux.GetTelefone() == telefone)
                return false; // Está tentando adicionar um contato de mesmo nome e numero
        }
        Contato contato = new Contato(nome, telefone, idade);
        if (lista_contato.size() <= 10)
            return lista_contato.add(contato);
        else
            return false; // Estarei ultrapassando a capacidade
    }

    public ArrayList<Contato> BuscaContato(String nome) {
        ArrayList<Contato> encontrados = new ArrayList<Contato>();
        for (Contato atual : lista_contato) {
            if (atual.GetNome().equals(nome))
                encontrados.add(atual);
        }
        if (encontrados.isEmpty()) { // Se não encontrei ninguém meu ArrayList encontrados está vazio
            System.out.println("Contato nao existe");
            return null;
        } else {
            return encontrados;
        }

    }

    public void EscreveTodosContatos() {
        for (Contato contato : lista_contato) {
            System.out.println(contato);
        }
    }

    public void EscreveContato(String nome) {
        ArrayList<Contato> contato = new ArrayList<Contato>();
        contato = BuscaContato(nome);
        for (Contato atual : contato) {
            System.out.println(atual);
        }
    }

    public boolean RemoveContato(String nome, int telefone, int idade) {
        Contato aux = new Contato(nome, telefone, idade);
        for (int i = 0; i < lista_contato.size(); i++) {
            if (aux.equals(lista_contato.get(i))) {
                lista_contato.remove(i);
                return true;
            }
        }
        return false;
    }
}