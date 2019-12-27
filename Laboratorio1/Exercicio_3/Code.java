/*
    Nome: Matheus Borges Kamla      nº USP : 10277015

    Prática 3 : Programa que lê o que o usuário digitou e depois mostra na tela
*/

import java.util.Scanner;

public class Code{
    public static void main(String args[]){
        System.out.println("Entrada:");
        Scanner ler = new Scanner(System.in);
        String texto = ler.nextLine();
        while(!texto.equals("fim")){
            System.out.println(texto);
            texto = ler.nextLine();
        }
    }
}