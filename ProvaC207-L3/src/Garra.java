public class Garra {
    private int pressao;

    public Garra(int pressao){
        this.pressao = pressao;
    }
    public void agarrarPeca(){
        System.out.println("Agarrando a peça padrão");
    }
    public void agarrarPeca(int posicao){
        System.out.println("Agarrando a peça do lugar "+posicao);
    }
}
