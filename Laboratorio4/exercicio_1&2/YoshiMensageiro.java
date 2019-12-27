/**
 * Criado por Matheus Kamla - 10277015 Disciplina de Programação Orientada a
 * Objetos Laboratório 4 (14 Set 2018)
 */

public class YoshiMensageiro extends Yoshi {
    private int distPercorrida;

    /**
     * Cria um objeto com posicao e cor de acordo com os parâmetros
     */
    public YoshiMensageiro(String color, int posicao_x, int posicao_y) {
        this.setColor(color);
        this.setPosicaoX(posicao_x);
        this.setPosicaoY(posicao_y);
    }

    /**
     * Método que move o objeto para posição passada como parâmetro e printa uma
     * mensagem
     */
    public void leva_mensagem(String mensagem, int x_final, int y_final) {
        int x_percorrido = x_final - this.getPosicaoX();
        int y_percorrido = y_final - this.getPosicaoY();
        this.distPercorrida = x_percorrido + y_percorrido;
        if (x_percorrido < 0) {
            this.irParaEsquerda(x_percorrido);
        } else {
            this.irParaDireita(x_percorrido);
        }
        if (y_percorrido < 0) {
            this.irParaCima(y_percorrido);
        } else {
            this.irParaAbaixo(y_percorrido);
        }
        System.out.println(this.distPercorrida + ", " + mensagem + ", " + this.getColor() + ", " + this.getPosicaoX()
                + ", " + this.getPosicaoY() + ", " + x_final + ", " + y_final);

    }
}