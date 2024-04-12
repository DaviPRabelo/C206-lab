public class Empilhador extends Robo{
    private Pacote []pacote = new Pacote[20];
    private int pesoMaximo;
    private int pesoAtual = 0;

    public Empilhador(int pesoMaximo, String nome, int energiaMaxima, int energia){
        super(energia, energiaMaxima, nome);
        this.pesoMaximo = pesoMaximo;
    }
    public void adicionarPacote(int peso){
        for (int i = 0; i < pacote.length; i++) {
            if(pacote[i] == null && pesoAtual+peso <= pesoMaximo){
                pacote[i] = new Pacote(peso);
                pesoAtual += peso;
                System.out.println("Pacote adicionado");
                break;
            } else if (pesoAtual+peso > pesoMaximo) {
                System.out.println("Ja está pesado demais");
                System.out.println("AVISO: Remova um pacote para adicionar outro");
                break;
            }

        }
    }

    public void removerPacote(int posicao){
        if(pacote[posicao-1] != null){
            pacote[posicao-1] = null;
        }
    }
    public void mostrarPacotes(){
        for (int i = 0; i < pacote.length; i++) {
            if(pacote[i] != null)
            System.out.println("Pacote" +(i+1) +" de peso " +pacote[i].getPeso());
        }
    }
}
