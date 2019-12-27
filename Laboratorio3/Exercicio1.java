/*
    Nome: Matheus Borges Kamla      nº USP : 10277015

                                Laboratorio 3
    Exercício 1 :  O objetivo deste exercício é executar uma operação 
    aritmética (soma ou mulitiplicação) de dois números inteiros positivos. 
*/
import java.util.Scanner;

public class Exercicio1{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        String texto = ler.nextLine();
        String palavras[] = texto.split(" ");
        int num[] = new int[texto.length()-1];
        for(int i=1;i<palavras.length;i++){
            num[i] = Integer.parseInt(palavras[i]);
        }
        int result;
        if(palavras[0].equals("+")){
            result = num[1] + num[2];
            System.out.print(result);
        }else if (palavras[0].equals("*")){
            result = num[1] * num[2];
            System.out.print(result);   
        }
    }
}