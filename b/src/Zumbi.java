public class Zumbi extends Monstro{
    private int numeroDeCerebrosComidos = 20;
    public Zumbi(int vida, int idade, int energia) {
        super(vida, idade, energia);
    }
    public void atacarComMordida(Monstro monstroAlvo) {
        if (getEnergia() > 2) {
            setEnergia(getEnergia() - 2);//Gasta 2 de energia para cada mordida
            monstroAlvo.setVida(monstroAlvo.getVida() - 4);
            if(monstroAlvo.getVida() == 0){
                this.numeroDeCerebrosComidos +=1;
            }
        }
    }

    public int getNumeroDeCerebrosComidos() {
        return numeroDeCerebrosComidos;
    }
}