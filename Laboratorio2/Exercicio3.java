/*
    Nome: Matheus Borges Kamla      nº USP : 10277015

                                Laboratorio 2
    Exercício 3 :  programa que possui a finalidade de detectar palavras em um texto
*/
import java.util.Scanner;

public class Exercicio3{
    public static void main(String args[]){
        //System.out.println("Entrada: \n");
        Scanner ler = new Scanner(System.in);
        String texto = ler.nextLine();
        String palavras[] = texto.split(" ");
        int tam = palavras.length;
        //System.out.print("\nPalavras digitadas: ");
        for(int i=0;i<tam;i++){
            System.out.println(palavras[i]);
        }

    }
}