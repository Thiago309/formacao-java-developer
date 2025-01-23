package projeto1;

public class Usuario {
    public static void main(String [] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual ? " + smartTv.canal);
        System.out.println("Volume Atual ? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual ? " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual ? " + smartTv.canal);

        smartTv.desligar();
        System.out.println("TV Ligada ? " + smartTv.ligada);

    }
}