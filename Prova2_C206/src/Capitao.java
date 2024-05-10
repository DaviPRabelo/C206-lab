public class Capitao extends Pirata implements Comandar{
    private int numeroDeSeguidores;
    public void conquistarNovoSeguidor(Pirata pirata){
        if(pirata.getPoder() >= this.getPoder()/3){
            numeroDeSeguidores += 1;
            System.out.println("Novo seguidor recrutado");
        }
        else{
            System.out.println("Esse pirata não serve para lavar chão");
        }
    }

    public Capitao(String nome, String comidaFavorita, int poder, int numeroDeSeguidores) {
        super(nome, comidaFavorita, poder);
        this.numeroDeSeguidores = numeroDeSeguidores;
    }

    @Override
    public void darOrdem() {
        System.out.println("O Capitão está ordenando " +numeroDeSeguidores+" tripulantes.");

    }

    @Override
    public void mudarRota() {
        System.out.println("O Capitão está mudando a rota.");
    }
}
