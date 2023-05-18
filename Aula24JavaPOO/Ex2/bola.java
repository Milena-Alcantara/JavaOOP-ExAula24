package Ex2;

public class bola {
    private double circuferencia, velocidade;

    private String cor, marca, material;

    public bola(double circ, double veloc, String cor, String marca, String mate){
        this.circuferencia = circ;
        this.velocidade = veloc;
        this.cor = cor;
        this.marca = marca;
        this.material = mate;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }




}
