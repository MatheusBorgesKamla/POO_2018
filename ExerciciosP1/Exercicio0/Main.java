import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        if (agenda.AdicionaContato("Matheus", 991331621, 19))
            System.out.println("Adicionado com sucesso !");

        if (agenda.AdicionaContato("Jose", 99945699, 31))
            System.out.println("Adicionado com sucesso !");

        if (agenda.AdicionaContato("Jorge", 99133456, 23))
            System.out.println("Adicionado com sucesso !");

        if (agenda.AdicionaContato("Matheus", 99133112, 19))
            System.out.println("Adicionado com sucesso !");

        if (agenda.AdicionaContato("Felipe", 991221621, 12))
            System.out.println("Adicionado com sucesso !");

        if (agenda.AdicionaContato("Felipe", 991221621, 12))
            System.out.println("Adicionado com sucesso !");
        else
            System.out.println("Erro ao adicionar contato !");

        agenda.EscreveTodosContatos();

        if (agenda.RemoveContato("Matheus", 99133112, 19))
            System.out.println("Removido com sucesso !");
        System.out.println("------------");

        agenda.EscreveTodosContatos();

        ArrayList<Contato> contatos_buscado;
        contatos_buscado = agenda.BuscaContato("Jorge");
        System.out.println("Contato buscado: ");
        for (Contato aux : contatos_buscado)
            System.out.println(aux);

        if (agenda.AdicionaContato("Jorge", 99122100, 23))
            System.out.println("Adicionado com sucesso !");

        contatos_buscado = agenda.BuscaContato("Jorge");

        System.out.println("Contato buscado: ");

        for (Contato aux : contatos_buscado)
            System.out.println(aux);

        System.out.println("Contato a ser escrito: ");
        agenda.EscreveContato("Matheus");
        agenda.EscreveContato("Jorge");
    }
}
