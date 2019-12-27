/*
    Nome: Matheus Borges Kamla      nº USP : 10277015

                                Laboratorio 3
    Exercício 3 :  O objetivo deste exercício é executar uma operação aritmética 
    (soma ou mulitiplicação) de dois números inteiros positivos usando a notação posfixa. 
*/
import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String texto = ler.nextLine();
        String palavras[] = texto.split(" ");
        int result;
        int num[] = new int[2];
        num[0] = Integer.parseInt(palavras[0]);
        num[1] = Integer.parseInt(palavras[1]);
        if(palavras[2].equals("*")){
            result = num[0] * num[1];
            System.out.print(result);
        }else if(palavras[2].equals("+")){
            result = num[0] + num[1];
            System.out.print(result);
        }
    }
}