/*
    Nome: Matheus Borges Kamla      nº USP : 10277015

                                Laboratorio 2
    Exercício 1 :  programa que possui a finalidade de detectar as operações de uma expressão 
    aritmética. Os elementos são símbolos das operações de soma '+' e  multiplicação '*'.
*/
import java.util.Scanner;

public class Exercicio1{
    public static void main(String args[]){
        //System.out.print("Entrada: ");
        Scanner ler = new Scanner(System.in);
        String texto = ler.nextLine();
        char letra;
        for (int i=0;i<texto.length();i++) {
            letra = texto.charAt(i);
            if(letra=='+'){
                System.out.print("S");
            }else if(letra=='*'){
                System.out.print("M");
            }
        }

    }
}