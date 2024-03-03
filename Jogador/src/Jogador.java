public class Jogador {
    private Arma arma;
    private int energia;
    private int vida;
    public Jogador(Arma arma, int energia, int vida){
        this.arma = arma;
        this.energia = energia;
        this.vida = vida;
    }

    public void atacar(Jogador alvo){
        if (this.energia > this.arma.CustoDeEnergia()) {
            alvo.sofreDano(this.arma.Dano());
            this.energia -= this.arma.CustoDeEnergia();
        }

    }
    private void sofreDano(int dano) {
        if (this.vida > 0) {
            this.vida -= dano;
        }
    }
    public Jogador(){}


    @Override
    public String toString(){
        return "O jogador tem a arma " +arma.Tipo() +","  + this.energia + " de energia e " + this.vida + " de vida";
    }


}
