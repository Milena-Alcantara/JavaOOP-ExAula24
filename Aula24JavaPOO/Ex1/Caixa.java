package Ex1;

import java.util.ArrayList;
import java.util.List;

public class Caixa {

    private double saldo;
    private int qtLancamentos;
    public int opcao;
    private double valorCliente;
    public List<Double> valoresCredito = new ArrayList<>();
    public List<Double> valoresDebito = new ArrayList<>();
   private double saldoAlteraldo;
   public int qtdebitar;


    public Caixa(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public double setqtLancamentos(int qtLancamentos) {
        this.qtLancamentos = qtLancamentos;
        return qtLancamentos;
    }
     public double getqtLancamentos(){
        return qtLancamentos;
     }
    public double setvalorCliente(double valorCliente){
        this.valorCliente = valorCliente;
        return valorCliente;
    }
    public void verificarOpcaoUser(){
        switch (opcao){
            case 1:
               creditar();
                break;
            case 2:
            debitar();
            break;

            default:
                System.out.println("Opção inválida");
                System.exit(0);
        }
    }
    public void creditar(){
        valoresCredito.add(valorCliente);
    }
    public double setsaldoAlterado(double saldoAlteraldo){
        this.saldoAlteraldo = saldoAlteraldo;
        return saldoAlteraldo;
    }
    public double debitar(){
        qtdebitar++;
        valoresDebito.add(valorCliente);
        double somadeDebitos=0;
        for (int i = 0; i <valoresDebito.size() ; i++) {
            somadeDebitos+=valoresDebito.get(i);
        }
        saldoAlteraldo = saldo -somadeDebitos;
        return saldoAlteraldo;

    }
    public void saldoFinal(){
        double saldofinal = 0, somaCreditos = 0;
        if (qtdebitar>0){
            for (int i = 0; i <valoresCredito.size() ; i++) {
                somaCreditos += valoresCredito.get(i);
                saldofinal = somaCreditos +saldoAlteraldo;
        }System.out.println("Seu saldo final é: "+saldofinal);

        } else{
            for (int i = 0; i <valoresCredito.size() ; i++) {
                somaCreditos += valoresCredito.get(i);
                saldofinal = somaCreditos + saldo;

        } System.out.println("Seu saldo final é: "+saldofinal);
    }
    }
}

