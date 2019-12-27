/*
     Matheus Borges Kamla 10277015 - implementação de um classe que herda o turtle e realiza os 
                                      mesmos métodos que o Yoshi faz só que para o Turtle 
*/
public class Tartaruga extends Turtle {
    private double posicao_x;
    private double posicao_y;
    private String color;

    Tartaruga() {
        this.posicao_x = 0;
        this.posicao_y = 0;
        this.color = "green";
        this.penSize(10);// defino o tamanho de pixels do traço
        this.speed(500);// defino a velocidade em milisegundos para realiçar as operações
        this.penColor("green");
        this.goTo(0, 0);
    }

    Tartaruga(String color, double posicao_x, double posicao_y) {
        this.posicao_x = posicao_x;
        this.posicao_y = posicao_y;
        this.color = color;
        this.penSize(10);
        this.speed(500);
        this.penColor(color);
        this.goTo(posicao_x, posicao_y);
    }

    public void setColor(String color) {
        this.color = color;
        this.penColor(color);
    }

    public String getColor() {
        return this.color;
    }

    public double getPosicaoX() {
        return this.posicao_x;
    }

    public double getPosicaoY() {
        return this.posicao_y;
    }

    public void irParaAbaixo(double distancia) {
        this.posicao_y -= distancia;
        this.goTo(this.posicao_x, this.posicao_y);
    }

    public void irParaCima(double distancia) {
        this.posicao_y += distancia;
        this.goTo(this.posicao_x, this.posicao_y);
    }

    public void irParaDireita(double distancia) {
        this.posicao_x += distancia;
        this.goTo(this.posicao_x, this.posicao_y);
    }

    public void irParaEsquerda(double distancia) {
        this.posicao_x -= distancia;
        this.goTo(this.posicao_x, this.posicao_y);
    }

}