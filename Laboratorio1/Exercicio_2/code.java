/*
    Nome: Matheus Borges Kamla      nº USP : 10277015

    Prática 2 : Programa que lê o que o usuário digitou e se caso for "ICMC-USP" mostra "reconhecido"
                se não mostra "errado"
*/

import java.util.Scanner;

public class code{
    public static void main(String args[]){
        System.out.print("Entrada: ");
        Scanner ler = new Scanner(System.in);
        String texto = ler.nextLine();
        if(texto.equals("ICMC-USP")){
            System.out.println("reconhecido");
        }else{
            System.out.println("errado");
        }
    }
}