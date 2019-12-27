/**
 * Yoshi
 *
 * @author  Pedro Shiguihara
 * @version 1.0  (29 Mar 2012)
 */
/**
 * Modificado por Matheus Kamla - 10277015
 *Disciplina de Programação Orientada a Objetos
 *Laboratório 4 (14 Set 2018)
 */
class Yoshi
{
    private int posicao_x;
    private int posicao_y;
    private String color;
    private String direcao;

	private Boolean isShowed;

    /**
     * Cria um objeto com posicao, color e direcao por default
     */
    public Yoshi() {
        posicao_x=0;
        posicao_y=0;
        color = "verde";
        direcao = "acima";
        isShowed = true;
    }
    /**
     * Cria um objeto com posicao e cor de acordo com os parâmetros
     */
    public Yoshi(String color, int posicao_x, int posicao_y){
        this.color = color;
        this.posicao_x = posicao_x;
        this.posicao_y = posicao_y;
    }

    /**
     * Permite que um objeto seja mostrado na tela e já mostra
     */
    public void setIsShowed(Boolean isShowed){
    	this.isShowed = isShowed;
    	visualizar();
    }

    /**
     * Captura o color
     */
    public String getColor(){
        return color;
    }

    /**
     * Modifica o color
     */
    public void setColor(String color){
        this.color = color;
    }

    /**
     * Retorna posicao no eixo X
     */
    public int getPosicaoX(){
        return posicao_x;
    }

    /**
     * Modifica posicao no eixo X
     */
    public void setPosicaoX(int x){this.posicao_x = x;}
    /**
     * Retorna posicao no eixo Y
     */
    public int getPosicaoY(){ return posicao_y; }

    /**
     * Modifica posicao no eixo X
     */
    public void setPosicaoY(int y){this.posicao_y = y;}

    /**
     * Mover para abaixo
     */
    public void irParaAbaixo( int distancia ){
        this.posicao_y += distancia;
        visualizar();
    }
    /**
     * Mover para esquerda
     */
    public void irParaEsquerda(int distancia){
        this.posicao_x -= distancia;
        visualizar();
    }
    /**
     * Mover para direita
     */
    public void irParaDireita(int distancia){
        this.posicao_x += distancia;
        visualizar();
    }
    /**
     * Mover para cima
     */
    public void irParaCima(int distancia){
        this.posicao_y -= distancia;
        visualizar();
    }

    /**
     * Visualiza objeto no Canvas
     */
    private void visualizar(){
		if( isShowed == true ){
			Canvas canvas = Canvas.getCanvas();
	        canvas.drawImage(this,posicao_x,posicao_y);
	        canvas.wait(500);
	    }
    }
}
