public class Animal {

    protected String apelido;
    protected int idade;
    protected double peso;
    protected String descricao;

    public Animal(String apelido, int idade, double peso, String descricao) {
        this.apelido = apelido;
        this.idade = idade;
        this.peso = peso;
        this.descricao = descricao;
    }

    public void infoGeral() {
        System.out.println(
                "Nome:<" + apelido + ">_Idade:<" + idade + ">_Peso:<" + peso + ">_Descricao:<" + descricao + ">");
    }

    protected void info() {
        System.out.println(
                "Nome:<" + apelido + ">\nIdade:<" + idade + ">\nPeso:<" + peso + ">\nDescricao:<" + descricao + ">");
    }

}