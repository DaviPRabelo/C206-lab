public class Pirata {
    private String nome;
    private String comidaFavorita;
    private int poder;

    public Pirata(String nome, String comidaFavorita, int poder) {
        this.nome = nome;
        this.comidaFavorita = comidaFavorita;
        this.poder = poder;
    }

    public void comer(Cozinheiro cozinheiro, int index){
        if(cozinheiro.prepararPrato(index) == comidaFavorita){
            setPoder(poder*2);
        }
        else {
            poder += 3;
        }
        System.out.println("Novo poder é: " +poder);
    }
    public Pirata lutar(Pirata pirata){
        if (pirata.getPoder() > this.poder){
            return pirata;
        }
        else{

            return null;
        }
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
