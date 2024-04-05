public class Vampiro extends Monstro {
    private int medidorDeSangue = 3;
    private boolean formaDeMorcego = false;

    public Vampiro(int vida, int idade, int energia) {
        super(vida, idade, energia);
    }

    public void tranformar() {
        if (!formaDeMorcego) {
            formaDeMorcego = true;
            System.out.println("Tranformando no batman");
        } else if (formaDeMorcego) {
            formaDeMorcego = false;
            System.out.println("Transformando no Vampiro doidão");
        }
    }

    public void recuperarVida() {
        setVida(getVida() + medidorDeSangue);
        System.out.println("Vida aumentou para " + getVida());
    }

    public void atacarComMordida(Monstro monstroAlvo) {
        if (!formaDeMorcego) {
            if (getEnergia() > 2) {
                setEnergia(getEnergia() - 2);//Gasta 2 de energia a mordida
                monstroAlvo.setVida(monstroAlvo.getVida() - 5);
            }
        } else {
            if (getEnergia() > 2) {
                setEnergia(getEnergia() - 2);//Gasta 2 de energia a mordida
                monstroAlvo.setVida(monstroAlvo.getVida() - 3);
            }
        }
    }
}