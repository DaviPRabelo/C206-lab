public class Espadachim extends Pirata implements Comandar{
    private String nomeEspada;

    public Espadachim(String nome, String comidaFavorita, int poder, String nomeEspada) {
        super(nome, comidaFavorita, poder);
        this.nomeEspada = nomeEspada;
    }



    @Override
    public void darOrdem() {
        System.out.println("O imediato está ordenando os tripulantes");
    }

    @Override
    public void mudarRota() {
        System.out.println("O imediato está mudando a rota");
    }
}
