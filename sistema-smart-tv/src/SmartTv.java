public class SmartTv {

    boolean ligadaDesligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void escolherCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarVolume(){
        volume++; // Mesma coisa que volume = volume + 1 ou volume += 1
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--; // Mesma coisa que volume = volume - 1 ou volume -= 1
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligadaDesligada = true;
    }

    public void desligar(){
        ligadaDesligada = false;
    }

}
