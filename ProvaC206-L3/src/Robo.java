public class Robo {
    private int energia;
    private String nome;
    private static int totalDeRobos = 0;
    private int energiaMaxima;

    public Robo(int energia, int energiaMaxima, String  nome){
        this.energia = energia;
        this.energiaMaxima = energiaMaxima;
        this.nome = nome;
        totalDeRobos++;
    }

    public void trabalhar(){
        energia -= 3;
    }
    public void trocarEnergia(Robo roboAlvo){
        int soma = this.energia + roboAlvo.energia;
        roboAlvo.energia -= this.energiaMaxima-this.energia;
        if(roboAlvo.energia < 0){
            roboAlvo.energia = 0;
        }
        if(soma > this.energiaMaxima){
            this.energia = energiaMaxima;

        }
        else{
            this.energia = soma;
        }
    }
    public void recarregar(int horas){
        this.energia += 3*horas;
        if(this.energia > this.energiaMaxima){
            this.energia = this.energiaMaxima;
        }
    }
    public int getTotalDeRobos(){
        return totalDeRobos;
    }
    public int getEnergia(){
        return energia;
    }
}
