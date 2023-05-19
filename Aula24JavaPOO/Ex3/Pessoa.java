package Ex3;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso, altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void envelhecer() {
        idade++;
        crescer();
    }

    public void setAltura(double alteracao) {
        altura += alteracao;
    }

    public void crescer(){

        for (int i = 1;  idade<21; i++) {
            setAltura(0.05);
            envelhecer();
            System.out.println(getNome());
            System.out.println("Idade atual: "+getIdade());
            System.out.println("Peso Atual: "+getPeso());
            System.out.println("Altura Atua: "+getAltura());
            System.out.println("--------------------------------");

        }
}}