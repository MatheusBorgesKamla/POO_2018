public class Jogo {

    private Jogador jogador1;
    private Jogador jogador2;
    private int num_rodadas;
    private int[] pontuacao = new int[2];
    private int cont_rodadas;

    public Jogo(Jogador jogador1, Jogador jogador2, int num_rodadas) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.num_rodadas = num_rodadas;
        cont_rodadas = 0;
        pontuacao[0] = 0;
        pontuacao[1] = 0;
    }

    public void Rodada() {
        System.out.print(jogador1.GetNome() + " : ");
        int pontos1 = jogador1.JogadorJoga();
        System.out.print(jogador2.GetNome() + " : ");
        int pontos2 = jogador2.JogadorJoga();
        if (pontos1 > pontos2) {
            pontuacao[0]++;
        } else if (pontos2 > pontos1) {
            pontuacao[1]++;
        }
        cont_rodadas++;
    }

    public Jogador TestaVencedor() {
        if (cont_rodadas >= num_rodadas) {
            if (pontuacao[0] > pontuacao[1]) {
                return jogador1;
            } else if (pontuacao[1] > pontuacao[0]) {
                return jogador2;
            } else {
                System.out.println("Houve um empate");
                return null;
            }
        } else {
            System.out.println("Ainda nao foram jogados todas as rodadas");
            return null;
        }
    }

    public void PrintaPontos() {
        System.out.println("Pontuacao --> " + jogador1.GetNome() + ": " + pontuacao[0] + " " + jogador2.GetNome() + ": "
                + pontuacao[1]);
    }

    public int GetNum_Rodadas() {
        return this.num_rodadas;
    }

}