public class Gato {
    private String cor;
    private int velocidade;
    private int idade;


    public Gato(String cor, int velocidade, int idade) {
        this.cor = cor;
        this.velocidade = velocidade;
        this.idade = idade;
    }

    public void brincar(){
        System.out.println("O gato foi brincar");
    }
    public void cacar(Rato rato){
        if(rato.Escondido() == false)
        {
            if(this.velocidade > rato.Velocidade())
            {
                System.out.println("O gato foi bem sucedido em sua caça e pegou o rato");
            }
            else {
                System.out.println("O gato falhou e o rato fugiu");
            }
        }
        else{
            System.out.println("Não havia nenhum rato");
        }
    }

    @Override
    public String toString(){
        return "O gato de cor" + this.cor + " possui uma velocidade " + this.velocidade + " e tem " + this.idade + " anos";
    }
}
