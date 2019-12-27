import java.util.ArrayList;

public class Arv_Genealogica {

    private ArrayList<Pessoa> arvore;

    public Arv_Genealogica() {
        arvore = new ArrayList<Pessoa>();
    }

    public int Busca_Indice_Pessoa(Pessoa pessoa) {
        for (int i = 0; i < arvore.size(); i++) {
            if (arvore.get(i).equals(pessoa))
                return i;
        }
        return -1;
    }

    public boolean Add_Pessoa(Pessoa pessoa) {
        int teste = Busca_Indice_Pessoa(pessoa);
        if (teste != -1) {
            System.out.println("Já existe uma pessoa com mesmo nome e idade !");
            return false;
        }
        if (pessoa.GetMae() == null || pessoa.GetPai() == null) {
            System.out.println("Precisa definir pai/mae");
            return false;
        }
        if (arvore.add(pessoa)) {
            return true;
        } else {
            System.out.println("Erro ao inserir ! ");
            return false;
        }
    }

    public boolean Remove_Pessoa(Pessoa pessoa) {
        int indice = Busca_Indice_Pessoa(pessoa);
        if (indice == -1) {
            System.out.println("Pessoa ja nao existe !");
            return false;
        } else {
            arvore.remove(indice);
            return true;
        }
    }

    public Pessoa Busca_Pessoa(Pessoa pessoa) {
        int indice = Busca_Indice_Pessoa(pessoa);
        return arvore.get(indice);
    }

    public Pessoa Get_Arv_Pai(Pessoa pessoa) {
        int indice = Busca_Indice_Pessoa(pessoa);
        if (indice == -1) {
            return null;
        }
        Pessoa aux = arvore.get(indice);
        return aux.GetPai();
    }

    public Pessoa Get_Arv_Mae(Pessoa pessoa) {
        int indice = Busca_Indice_Pessoa(pessoa);
        if (indice == -1) {
            return null;
        }
        Pessoa aux = arvore.get(indice);
        return aux.GetMae();
    }

    private void Busca_ascendentes(Pessoa pessoa, ArrayList<Pessoa> ascendentes) {
        Pessoa mae = Get_Arv_Mae(pessoa);
        Pessoa pai = Get_Arv_Pai(pessoa);
        if (mae != null) {
            ascendentes.add(mae);
            Busca_ascendentes(mae, ascendentes);
        }
        if (pai != null) {
            ascendentes.add(pai);
            Busca_ascendentes(pai, ascendentes);
        }
    }

    public ArrayList<Pessoa> Get_ascendentes(Pessoa pessoa) {
        ArrayList<Pessoa> ascendentes = new ArrayList<Pessoa>();
        Busca_ascendentes(pessoa, ascendentes);
        return ascendentes;
    }

    public void Compara_ascendentes(Pessoa pessoa1, Pessoa pessoa2) {
        ArrayList<Pessoa> ascendentes1 = Get_ascendentes(pessoa1);
        ArrayList<Pessoa> ascendentes2 = Get_ascendentes(pessoa2);
        System.out.println("Os ascendentes em comum de " + pessoa1 + " e " + pessoa2 + " sao:");
        for (int i = 0; i < ascendentes1.size(); i++) {
            for (int j = 0; j < ascendentes2.size(); j++) {
                if (ascendentes1.get(i).equals(ascendentes2.get(j)))
                    System.out.println(ascendentes1.get(i));
            }
        }
    }

    public void Printa_Arv() {
        for (Pessoa aux : arvore) {
            System.out.println(aux);
        }
    }

    public ArrayList<Pessoa> Get_Arv_Filhos(Pessoa pessoa) {
        ArrayList<Pessoa> filhos = new ArrayList<Pessoa>();
        for (Pessoa aux : arvore) {
            if (aux.GetPai().equals(pessoa) || aux.GetMae().equals(pessoa))
                filhos.add(aux);
        }
        return filhos;
    }

    private void Busca_descendentes(Pessoa pessoa, ArrayList<Pessoa> descendentes) {
        ArrayList<Pessoa> aux = new ArrayList<Pessoa>();
        aux = Get_Arv_Filhos(pessoa);
        if (!aux.isEmpty()) {
            descendentes.addAll(aux);
            for (Pessoa proxima : aux) {
                Busca_descendentes(proxima, descendentes);
            }
        }

    }

    public ArrayList<Pessoa> Get_descendentes(Pessoa pessoa) {
        ArrayList<Pessoa> descendentes = new ArrayList<Pessoa>();
        Busca_descendentes(pessoa, descendentes);
        return descendentes;
    }

    public void Compara_descendentes(Pessoa pessoa1, Pessoa pessoa2) {
        ArrayList<Pessoa> descendentes1 = Get_descendentes(pessoa1);
        ArrayList<Pessoa> descendentes2 = Get_descendentes(pessoa2);
        System.out.println("Os descendentes em comum de " + pessoa1 + " e " + pessoa2 + " sao:");
        for (int i = 0; i < descendentes1.size(); i++) {
            for (int j = 0; j < descendentes2.size(); j++) {
                if (descendentes1.get(i).equals(descendentes2.get(j)))
                    System.out.println(descendentes1.get(i));
            }
        }
    }

}