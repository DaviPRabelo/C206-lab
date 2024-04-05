public class Monstro {
    private int vida;
    private int idade;
    private int energia;

    public Monstro(int vida, int idade, int energia) {
        this.vida = vida;
        this.idade = idade;
        this.energia = energia;
    }

    public void assustar(Monstro monstroAlvo){
        System.out.println("Assustando o outro monstro");
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}