public class Baleia extends Animal {

    private double alturaMaximaSalto;
    private double sinalinfrasonica;

    public Baleia(String apelido, int idade, double peso, String descricao, double alturaMaximaSalto,
            double sinalinfrasonica) {
        super(apelido, idade, peso, descricao);
        this.alturaMaximaSalto = alturaMaximaSalto;
        this.sinalinfrasonica = sinalinfrasonica;
    }

    public void info() {
        super.info();
        System.out.println("Salto:<" + alturaMaximaSalto + ">\nSonido:<" + sinalinfrasonica + ">");

    }

}