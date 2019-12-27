import java.util.Scanner;

/*
    Nome: Matheus Borges Kamla      nº USP : 10277015

    Prática 4 : desenvolvimento de uma calculado binária em que o intuito
                é ler o que o usuário digitou e somar esse numero ao resultado
                total mostrando os resultados parciais até que ele digite "="
*/
import java.util.Scanner;

public class Code{
    public static void main(String args[]){
        CalculadoraAritmeticaBinaria calc = new CalculadoraAritmeticaBinaria();
        Scanner ler = new Scanner(System.in);
        String text;
        int aux;
        System.out.print("Entrada: ");
        while(true){
            text = ler.nextLine();
            if(text.equals("=")){
                calc.printSoma();
                break;
            }else{
                aux = Integer.parseInt(text);
                calc.Soma(aux);
                calc.printSoma();
            }
        }
    }
}