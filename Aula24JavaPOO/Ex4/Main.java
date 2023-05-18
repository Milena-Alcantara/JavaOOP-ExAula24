package Ex4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    ContaCorrente contaItau = new ContaCorrente("Milena",30501,200);


        System.out.println("Informe a transação que deseja:");
        System.out.println("1 - Depositar \t 2 - Sacar ");
        contaItau.verificarOpcaoUser(input.nextInt());


        System.out.println("Nome: "+contaItau.getNomeCorrentista());
        System.out.println("Número da conta: "+contaItau.getNumeroConta());
        System.out.println("Seu saldo atual é: "+ contaItau.getSaldo());
    }
}
