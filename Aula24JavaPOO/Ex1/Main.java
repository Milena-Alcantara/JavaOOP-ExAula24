package Ex1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Caixa cartao = new Caixa(1000);
        System.out.println("Seu saldo inical é: "+cartao.getSaldo());

        System.out.println("Informe quantos lançamentos deseja realizar: ");
        cartao.setqtLancamentos(input.nextInt());

        for (int i = 0; i < cartao.getqtLancamentos() ; i++) {
            System.out.println("Informe a opção desejada: ");
            System.out.println("1 - Creditar \t 2 - Debitar");
            cartao.opcao = input.nextInt();
            System.out.println("Informe o valor de alteração: ");
            cartao.setvalorCliente(input.nextDouble());
            cartao.verificarOpcaoUser();
        }
        cartao.saldoFinal();
        }

        }


