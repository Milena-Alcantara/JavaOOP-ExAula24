package Ex3;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Milena",19,0,1.68);
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getPeso());
        System.out.println(pessoa1.getAltura());

    pessoa1.envelhecer();

        }


    }

