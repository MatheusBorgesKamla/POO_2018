public class Contato {

    private int telefone;
    private String nome;
    private int idade;

    public Contato(String nome, int telefone, int idade) {
        this.telefone = telefone;
        this.nome = nome;
        this.idade = idade;
    }

    public String GetNome() {
        return this.nome;
    }

    public int GetTelefone() {
        return this.telefone;
    }

    public int GetIdade() {
        return this.idade;
    }

    public void SetNome(String nome) {
        this.nome = nome;
    }

    public void SetTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void SetIdade(int idade) {
        this.idade = idade;
    }

    public String toString(){
        String text = nome + " " + telefone + " " + idade;
        return(text);
    }

    public boolean equals(Contato aux){
        if ((aux.GetNome().equals(nome)) && (aux.GetTelefone() == telefone) && (aux.GetIdade() == idade)) {
            return true;
        }
        return false;
    }
}