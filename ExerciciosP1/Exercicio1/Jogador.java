public class Jogador {

    private Dado dado;
    private String nome;

    public Jogador(String nome, Dado dado) {
        this.nome = nome;
        this.dado = dado;
    }

    public Jogador(String nome) {
        this.nome = nome;
        this.dado = new Dado();
    }

    public void SetNome(String Nome) {
        this.nome = nome;
    }

    public void SetDado(int face) {
        dado.SetFace(face);
    }

    public String GetNome() {
        return nome;
    }

    public int GetDado() {
        return dado.GetFace();
    }

    public int JogadorJoga() {
        int dado1 = dado.JogarDado();
        int dado2 = dado.JogarDado();
        int soma = dado1 + dado2;
        System.out.println("" + dado1 + " + " + dado2 + " = " + soma);
        return soma;
    }

}