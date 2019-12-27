public class Contato {

    private int telefone;
    private String nome;

    public Contato(String nome, int telefone) {
        this.telefone = telefone;
        this.nome = nome;
    }

    public String GetNome() {
        return this.nome;
    }

    public int GetTelefone() {
        return this.telefone;
    }

    public void SetNome(String nome) {
        this.nome = nome;
    }

    public void SetTelefone(int telefone) {
        this.telefone = telefone;
    }

}