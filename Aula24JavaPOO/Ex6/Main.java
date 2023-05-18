package Ex6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        Quadrado quad = new Quadrado(2.5,2.5);
        System.out.println("O quadrado tem "+quad.getLado1()+" de altura e "+quad.getLado2()+" de comprimento.");

        System.out.println("Informe um novo valor para a altura:");
        quad.setLado1(input.nextDouble());

        System.out.println("A área do quadrado com o novo valor digitado é = " +quad.calcularArea());
    }
}
