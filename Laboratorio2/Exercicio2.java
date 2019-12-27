/*
    Nome: Matheus Borges Kamla      nº USP : 10277015

                                Laboratorio 2
    Exercício 2 :  programa que possui a finalidade de detectar os numeros de uma string
    e transformando em inteiros
*/
import java.util.Scanner;

public class Exercicio2{
    public static void main(String args[]){
        //System.out.print("Entrada: ");
        Scanner ler = new Scanner(System.in);
        String texto = ler.nextLine();
        char letra;
        int num[] = new int[texto.length()], a=0;
        String aux = "0";
        for (int i=0;i<texto.length();i++) {
            letra = texto.charAt(i);
            if(letra=='+'){
                num[a] = Integer.parseInt(aux);
                System.out.print(num[a]+" ");
                a++;
                //System.out.println("S");
                aux = "0";
            }else if(letra=='*'){
                num[a] = Integer.parseInt(aux);
                System.out.print(num[a]+" ");
                a++;
                //System.out.println("M");
                aux = "0";
            }else{
                aux = aux+letra;   
            }
        }
        num[a] = Integer.parseInt(aux);
        System.out.println(num[a]);
        a++;
    }
}
