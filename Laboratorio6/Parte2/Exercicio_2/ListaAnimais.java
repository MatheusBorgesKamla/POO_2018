import java.util.ArrayList;

public class ListaAnimais extends Animal {

    private ArrayList<Animal> lista;

    public ListaAnimais(String apelido, int idade, double peso, String descricao, ArrayList<Animal> lAnimais) {
        super(apelido, idade, peso, descricao);
        lista = lAnimais;
    }

    public static void listar(ArrayList<Animal> lAnimais) {
        for (Animal aux : lAnimais) {
            aux.info();
        }
    }

}