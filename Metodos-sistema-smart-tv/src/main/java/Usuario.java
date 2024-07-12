public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("A tv esta: " + smartTv.ligada);
        System.out.println("Canal da TV: " + smartTv.canal);
        System.out.println("Volume da TV: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status A tv esta: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status A tv esta: " + smartTv.ligada);

        smartTv.aumentarCanal();
        System.out.println("Canal da TV: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal da TV: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal da TV: " + smartTv.canal);
        smartTv.mudarCanal(50);
        System.out.println("Canal da TV: " + smartTv.canal);

    }
}
