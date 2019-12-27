import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto;
        System.out.println("Numero do item faturado: ");
        texto = entrada.nextLine();
        int numero = Integer.parseInt(texto);
        System.out.println("Descricao do item: ");
        String descricao = entrada.nextLine();
        System.out.println("Quantidade do item: ");
        texto = entrada.nextLine();
        int quantidade = Integer.parseInt(texto);
        System.out.println("Preco do item: ");
        texto = entrada.nextLine();
        double preco = Double.parseDouble(texto);
        Invoice fatura = new Invoice(numero, descricao, quantidade, preco);
        System.out.println("---------------------- ");
        System.out.println("Dados da fatura: ");
        System.out.println("Numero: " + fatura.getNumero());
        System.out.println("Descricao: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade() );
        System.out.println("Preco: " + fatura.getPreco());
        System.out.printf("Preco Final: %.2f %n",fatura.getInvoiceAmount());

    }
}