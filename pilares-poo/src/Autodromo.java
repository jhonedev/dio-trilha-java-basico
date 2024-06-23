public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();

        jeep.setChassi("555561");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("454852");
        z400.ligar();
    }
}
