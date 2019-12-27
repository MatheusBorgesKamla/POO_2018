/*
    Nome: Matheus Borges Kamla      nº USP : 10277015

                                Laboratorio 3
    Exercício 4 :  O objetivo deste exercício é criar uma classe pessoa com seus 
    métodos públicos necessários para sets e gets de cada um dos atributos. 

*/
public class Person {
    private String nome;
    private String data_nasc;
    private double altura;
    private double peso;

    public Person(String name, String nasc, double alt, double weigth){
        nome = name;
        data_nasc = nasc;
        altura = alt;
        peso = weigth;
    }

    public Person(String name){
        nome = name;
    }

    public void setNome(String name){
        nome = name;
    }

    public void setNasc(String nasc){
        nome = nasc;
    }

    public void setAlt(double alt){
        altura = alt;
    }

    public void setPeso(double weigth){
        peso = weigth;
    }

    public String getNome(){
        return nome;
    }

    public String getNasc(){
        return data_nasc;
    }

    public double getAlt(){
        return altura;
    }

    public double getPeso(){
        return peso;
    } 

    public double imc(){
        double imc = peso/(altura*altura);
        return imc;
    }

    public boolean equals(Person p){
        if(nome.equals(p.getNome())){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        String s = "Nome: "+ getNome() + ", Data de nascimento: " + getNasc() + ", Altura: " + getAlt() + ", IMC: "+ imc();
        return s;
    }

	public static void main(String[] args) {
	
		Person p1 = new Person("Rafael", "23/01/1991", 1.72, 106.0);
		Person p2 = new Person("Maria", "13/02/1981", 1.82, 65.0);
		Person p3 = new Person("Mairo", "20/11/1890", 1.98, 132.0);
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		
		
		System.out.println(p1.imc());
		System.out.println(p2.imc());
		System.out.println(p3.imc());
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
