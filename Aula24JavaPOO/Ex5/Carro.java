package Ex5;

public class Carro {
    private int qtPortas;
    private double potencia;
    private String modelo, marca;

    public Carro(int portas, double poten,String mode, String marc){
        this.qtPortas = portas;
        this.potencia = poten;
        this.modelo = mode;
        this.marca = marc;
    }

    public boolean ligarCarro(){
        System.out.println("carro ligado");
        return true;
    }

    public int getQtPortas(){
        return qtPortas;
    }

    public double getPotencia() {
        return potencia;
    }
    public String getModelo(){
        return modelo;
    }
    public String getMarca(){
        return marca;
    }
}
