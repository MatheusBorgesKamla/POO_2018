/*
    Nome: Matheus Borges Kamla      nº USP : 10277015

                                Laboratorio 3
    Exercício 2 :  O objetivo deste exercício é identificar os nomes 
                   de usuários de uma lista de emails.  
*/

import java.util.Scanner;

public class Exercicio2{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        String texto = ler.nextLine();
        String palavras[] = texto.split(",");
        int pos;
        for(String item : palavras){
            pos = item.indexOf("@");
            String nome = item.substring(0,pos);
            System.out.println(nome);
        }

    }
}
