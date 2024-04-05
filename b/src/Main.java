public class Main {
    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi(40, 23, 30);
        Vampiro vampiro = new Vampiro(25, 140, 35);
        Bruxa bruxa = new Bruxa(30, 59, 40);

        bruxa.aprenderFeitico("PALMEIRAS", 5);
        bruxa.aprenderFeitico("PAYSANDUU", 6);
        zumbi.assustar(bruxa);
        vampiro.assustar(zumbi);
        bruxa.assustar(vampiro);

        //bruxa.listarFeiticos();
        vampiro.recuperarVida();
        //zumbi.getNumeroDeCerebrosComidos();

        vampiro.tranformar();

        vampiro.atacarComMordida(zumbi);
        System.out.println(zumbi.getVida());
        vampiro.tranformar();
        vampiro.atacarComMordida(zumbi);
        System.out.println(zumbi.getVida());
        bruxa.lancarFeitico(vampiro, 1);
        System.out.println(vampiro.getVida());
        zumbi.atacarComMordida(vampiro);
        zumbi.getNumeroDeCerebrosComidos();
        zumbi.atacarComMordida(vampiro);
        zumbi.atacarComMordida(vampiro);
        zumbi.atacarComMordida(vampiro);
        zumbi.atacarComMordida(vampiro);
        zumbi.atacarComMordida(vampiro);
        zumbi.getNumeroDeCerebrosComidos();
        System.out.println(vampiro.getVida());


    }
}