/*
    Matheus Borges Kamla 10277015 - implementação de uma classe que herda o turtle e realiza os 
                                    mesmos métodos que o YoshiMensageiro faz só que para o Turtle
*/

public class TartarugaMensageira extends Turtle {
    private double posicao_x;
    private double posicao_y;
    private String color;
    private double distPercorrida;

    TartarugaMensageira() {
        this.posicao_x = 0;
        this.posicao_y = 0;
        this.distPercorrida = 0;
        this.color = "green";
        this.penSize(10);
        this.speed(500);
        this.penColor("green");
        this.goTo(0, 0);
    }

    TartarugaMensageira(String color, double posicao_x, double posicao_y) {
        this.posicao_x = posicao_x;
        this.posicao_y = posicao_y;
        this.distPercorrida = 0;
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

    public void leva_mensagem(String mensagem, double x_final, double y_final) {
        double x_percorrido = x_final - this.posicao_x;
        double y_percorrido = y_final - this.posicao_y;
        this.distPercorrida = x_percorrido + y_percorrido;
        if (x_percorrido < 0) {
            this.irParaEsquerda(x_percorrido);
        } else {
            this.irParaDireita(x_percorrido);
        }
        if (y_percorrido < 0) {
            this.irParaAbaixo(y_percorrido);
        } else {
            this.irParaCima(y_percorrido);
        }
        System.out.println(this.distPercorrida + ", " + mensagem + ", " + this.getColor() + ", " + this.getPosicaoX()
                + ", " + this.getPosicaoY() + ", " + x_final + ", " + y_final);

    }

}