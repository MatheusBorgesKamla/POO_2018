public class Pessoa {

    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }

    public String GetNome() {
        return nome;
    }

    public int GetIdade() {
        return idade;
    }

    public Pessoa GetPai() {
        return pai;
    }

    public Pessoa GetMae() {
        return mae;
    }

    public boolean equals(Pessoa teste) {
        if (teste == null)
            return false;
        if (nome.equals(teste.GetNome()) && idade == teste.GetIdade())
            return true;
        else
            return false;
    }

    public String toString() {
        String texto = nome + ", " + idade + " anos";
        return texto;
    }
}