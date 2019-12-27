public class Porta {

    private int estado; // 1 está aberta | o está fechada

    public Porta() {
        estado = 0; // fechado por default
    }

    public Porta(int estado) {
        this.estado = estado;
    }

    public void FechaPorta() {
        estado = 1;
    }

    public void AbrePorta() {
        estado = 0;
    }

    public boolean SeAberta() {
        if (estado == 1)
            return true;
        else
            return false;
    }
}