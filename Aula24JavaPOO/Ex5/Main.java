package Ex5;

public class Main {
    public static void main(String[] args) {
     Carro carroDeMilena = new Carro(4,2.0,"Gol 1.6","Volkswaguen");

     carroDeMilena.ligarCarro();

        System.out.println("A quantidade de portas é: "+carroDeMilena.getQtPortas());
        System.out.println("Potencia: "+carroDeMilena.getPotencia());
        System.out.println("Marca: "+carroDeMilena.getMarca());
        System.out.println("Modelo: "+carroDeMilena.getModelo());
    }
}
