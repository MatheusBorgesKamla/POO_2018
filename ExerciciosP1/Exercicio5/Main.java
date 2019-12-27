import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Arv_Genealogica arvore = new Arv_Genealogica();
        Pessoa jose = new Pessoa("Jose", 93, null, null);
        Pessoa maria = new Pessoa("Maria", 72, null, null);
        Pessoa marilda = new Pessoa("Marilda", 83, jose, maria);
        Pessoa paulo = new Pessoa("Paulo", 79, null, null);
        Pessoa andre = new Pessoa("Andre", 55, paulo, marilda);
        Pessoa silvia = new Pessoa("Silvia", 58, null, null);
        Pessoa matheus = new Pessoa("Matheus", 19, andre, silvia);

        /*
         * if(arvore.Add_Pessoa(paulo))
         * System.out.println("Pessoa adicionada com sucesso !"); else
         * System.out.println("Erro ao adicionar pessoa !");
         */
        if (arvore.Add_Pessoa(marilda))
            System.out.println("Pessoa adicionada com sucesso !");
        else
            System.out.println("Erro ao adicionar pessoa !");

        if (arvore.Add_Pessoa(andre))
            System.out.println("Pessoa adicionada com sucesso !");
        else
            System.out.println("Erro ao adicionar pessoa !");

        /*
         * if(arvore.Add_Pessoa(silvia))
         * System.out.println("Pessoa adicionada com sucesso !"); else
         * System.out.println("Erro ao adicionar pessoa !");
         */
        if (arvore.Add_Pessoa(matheus))
            System.out.println("Pessoa adicionada com sucesso !");
        else
            System.out.println("Erro ao adicionar pessoa !");

        arvore.Printa_Arv();
        ArrayList<Pessoa> ascenden_matheus = arvore.Get_ascendentes(matheus);
        System.out.println("Os ascendentes do Matheus sao : ");
        for (Pessoa aux : ascenden_matheus) {
            System.out.println(aux);
        }

        Pessoa valeria = new Pessoa("Valeria", 53, paulo, marilda);
        Pessoa roberto = new Pessoa("Roberta", 50, null, null);
        Pessoa victor = new Pessoa("Victor", 15, roberto, valeria);

        if (arvore.Add_Pessoa(valeria))
            System.out.println("Pessoa adicionada com sucesso !");
        else
            System.out.println("Erro ao adicionar pessoa !");

        /*
         * if(arvore.Add_Pessoa(roberto))
         * System.out.println("Pessoa adicionada com sucesso !"); else
         * System.out.println("Erro ao adicionar pessoa !");
         */
        if (arvore.Add_Pessoa(victor))
            System.out.println("Pessoa adicionada com sucesso !");
        else
            System.out.println("Erro ao adicionar pessoa !");

        arvore.Compara_ascendentes(matheus, victor);

        ArrayList<Pessoa> descend_marilda = arvore.Get_descendentes(marilda);

        System.out.println("Os descendentes de Marilda sao : ");
        for (Pessoa aux : descend_marilda) {
            System.out.println(aux);
        }

        arvore.Compara_descendentes(marilda, silvia);

    }
}