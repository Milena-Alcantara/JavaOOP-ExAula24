package Ex6;

public class Quadrado {
    private double lado1, lado2, area;


    public Quadrado(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public double getLado1(){
        return lado1;
    }
    public double getLado2(){
        return lado2;
    }

    public void setLado1(double novoValor){
        this.lado1 = novoValor;
    }


    public double calcularArea(){
        area = lado1*lado2;
        return area;
    }


}
