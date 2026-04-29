public class Usuario {
    public static void main(String[] args) throws Exception{
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada: "+smartTv.ligada);
        System.out.println("Canal Atual: "+smartTv.canal);
        System.out.println("Volume Atual: "+smartTv.volume);
        System.out.println("");

        smartTv.ligar();
        smartTv.aumentarVolume();
        System.out.println("NOVO - TV Ligada: "+smartTv.ligada);
        System.out.println("NOVO - Volume Atual: "+smartTv.volume);
    }


}
