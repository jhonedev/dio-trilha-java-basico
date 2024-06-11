public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        // Status inicial da TV
        System.out.println("TV ligada? " + smartTv.ligadaDesligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        // Alterando o volume da TV
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        // Alterando o canal da TV
        smartTv.escolherCanal(8);
        System.out.println("Canal atual: " + smartTv.canal);

        // Alterado o status da TV: LIGADA/DESLIGADA
        smartTv.ligar();
        System.out.println("Novo status da TV: " + smartTv.ligadaDesligada);
        smartTv.desligar();
        System.out.println("Novo status da TV: " + smartTv.ligadaDesligada);
    }
}
