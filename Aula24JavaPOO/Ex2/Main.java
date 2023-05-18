package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        bola boladebasquete = new bola(74.9 ,30.0,"marrom","Wilson","couro");

        bola bolaTenis = new bola(6.54,150.0,"Amarelo","Head Master","borracha");

        bola bolaVolei = new bola(67.7,130.0,"Branca", "Pro 8.0","Couro");


        System.out.println("A bola de basquete tem a cor: "+boladebasquete.getCor());
        System.out.println("A bola de tenis tem a cor: "+bolaTenis.getCor());
        System.out.println("A bola de volei tem a cor: "+bolaVolei.getCor());



        System.out.println("Informe a bola que voce deseja alterar a cor: ");
        System.out.println("1-Bola de Basquete \t 2-Bola de Tênis \t 3-Bola de Vôlei");
        switch (input.nextInt()){
            case 1:
                System.out.println("Informe a cor");
                boladebasquete.setCor(input.next());
                System.out.println("Nova cor: "+boladebasquete.getCor());
                break;

            case 2:
                System.out.println("Informe a cor");
                bolaTenis.setCor(input.next());
                System.out.println("Nova cor "+bolaTenis.getCor());
                break;

            case 3:
                System.out.println("Informe a cor");
                bolaVolei.setCor(input.next());
                System.out.println("Nova cor "+bolaVolei.getCor());
                break;

            default:
                System.out.println("Opção inválida");
                System.exit(0);


        }

    }
}
