public class Bruxa extends Monstro {
    private Feitico[] feitico;

    public Bruxa(int vida, int idade, int energia) {
        super(vida, idade, energia);
        this.feitico = new Feitico[10];

    }

    public boolean aprenderFeitico(String nome, int poder) {
        for (int i = 0; i < feitico.length; i++) {
            if (feitico[i] == null) {
                feitico[i] = new Feitico(nome, poder);
                break;
            }

        }
    }

    public void listarFeiticos() {
        for (int i = 0; i < feitico.length; i++) {
            if (feitico[i] != null) {
                System.out.println("Feitico " + feitico[i].getNome() + ", com o poder de " + feitico[i].getPoder());
            }
        }
    }

    public void esquecerFeitico(int posicao) {
        if (feitico[posicao] != null) {
            feitico[posicao] = null;
            System.out.println("Feitiço apagado");
        } else {
            System.out.println("Não existe feitiço");
        }
    }

    public void lancarFeitico(Monstro monstroAlvo, int posicao) {
        if (getEnergia() > 3){

            setEnergia(getEnergia() - 3);//Gasta 3 de energia em todo feitico ultilizado
            monstroAlvo.setVida(monstroAlvo.getVida() - feitico[posicao].getPoder());
        }
    }
}
