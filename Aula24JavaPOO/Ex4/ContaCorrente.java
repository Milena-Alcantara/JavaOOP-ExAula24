package Ex4;

import java.util.Scanner;

public class ContaCorrente {
    Scanner input = new Scanner(System.in);
    private String nomeCorrentista;
    private int numeroConta;
    private double saldo;
    public double valorCliente;
    public ContaCorrente(String nome,int numero, double saldo){
        this.nomeCorrentista = nome;
        this.numeroConta = numero;
        this.saldo = saldo;
    }

    public void verificarOpcaoUser(int opcao){
    switch (opcao){
        case 1:
            System.out.println("Informe o valor que deseja depositar");
            setSaldo(input.nextDouble());
            break;

        case 2:
            System.out.println("Informe o valor que deseja sacar: ");
            valorCliente = input.nextDouble();
            sacarDinheiro();
            break;

        default:
            System.exit(0);
    }
    }
    public void setSaldo(double valorCliente){
        this.valorCliente = valorCliente;
        saldo+=valorCliente;
    }
    public void sacarDinheiro(){
        if (valorCliente>saldo){
            System.out.println("Saldo insuficiente para o saque.");
        }
        else{
            saldo-=valorCliente;
            System.out.println("Saque realizado");
        }
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo(){
        return saldo;
    }
}
