import java.util.Random;

public class Dado {

    private int num_faces;
    private int face;

    public Dado(int face, int num_faces) {
        this.num_faces = num_faces;
        if (face <= num_faces && face >= 0)
            this.face = face;
        else
            System.out.println("Valor imcompative !");
    }

    public Dado(int num_faces) {
        this.num_faces = num_faces;
        this.face = -1; // Dado ainda não utilizado
    }

    public Dado() {
        this.num_faces = 6; // dado comum de 6 faces por padrão
        this.face = -1; // Dado ainda não utilizado
    }

    public int GetFace() {
        return face;
    }

    public int GetNum_Faces() {
        return num_faces;
    }

    public void SetFace(int face) {
        if (face <= this.num_faces && face >= 0)
            this.face = face;
        else
            System.out.println("Valor imcompative !");
    }

    public void setNum_Faces(int num_faces) {
        this.num_faces = num_faces;
    }

    public int JogarDado() {
        Random gerador = new Random();
        face = gerador.nextInt(num_faces + 1);
        return face;
    }

}