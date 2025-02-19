public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Qual canal? " + smartTv.canal);
        System.out.println("Qual volume? " + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarCanal();
        smartTv.aumentarVolume();

        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);
        System.out.println("Novo Status -> Qual canal? " + smartTv.canal);
        System.out.println("Novo Status -> Qual volume? " + smartTv.volume);

        smartTv.mudarCanal(99);
        System.out.println("Novo Status -> Qual canal? " + smartTv.canal);
    }
}
