import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String nome, tel, entrada = " ";
        int telefone;
        Lista_Contatos contatos = new Lista_Contatos();

        while(true){
            entrada = ler.nextLine();

            if(entrada.equals("adicionar")){
                nome = ler.nextLine();
                tel = ler.nextLine();
                telefone = Integer.parseInt(tel);
                if(contatos.AdicionaContato(nome,telefone))
                    System.out.println("OK");
            

            } else if(entrada.equals("buscar")){
                nome = ler.nextLine();
                telefone = contatos.BuscarContato(nome);
                if(telefone != -1)
                    System.out.println("" + telefone);
            

            } else if(entrada.equals("ncontatos")){
                System.out.println("" + contatos.NumeroContatos());
            
            }else if(entrada.equals("todos")){
                contatos.EscreveContatos();
            
            }else if(entrada.equals("fim")){
                break;
                
            }else{
                System.out.println("????");
            }

        }
        
    }
}