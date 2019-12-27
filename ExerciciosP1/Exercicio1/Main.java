import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto;
        int cont = 1;
        System.out.println("Qual o numero de rodadas: ");
        texto = entrada.nextLine();
        int num_rodadas = Integer.parseInt(texto);
        System.out.println("Qual o numero de faces do dado: ");
        texto = entrada.nextLine();
        int num_faces = Integer.parseInt(texto);
        Dado dado = new Dado(num_faces);
        System.out.println("Nome Jogador 1 : ");
        texto = entrada.nextLine();
        Jogador jogador1 = new Jogador(texto, dado);
        System.out.println("Nome Jogador 2 : ");
        texto = entrada.nextLine();
        Jogador jogador2 = new Jogador(texto, dado);
        Jogo jogo = new Jogo(jogador1, jogador2, num_rodadas);
        while (cont <= jogo.GetNum_Rodadas()) {
            System.out.println(" ----------- Rodada " + cont + " -----------");
            jogo.PrintaPontos();
            jogo.Rodada();
            System.out.println("-----------------------------------");
            cont++;
        }
        jogo.PrintaPontos();
        Jogador vencedor = jogo.TestaVencedor();
        if (vencedor != null)
            System.out.println("O vencedor foi: " + vencedor.GetNome());
    }
}