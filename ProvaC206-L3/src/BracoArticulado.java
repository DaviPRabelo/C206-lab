
public class BracoArticulado extends Robo{
    private int numeroDeArticulacoes;
    private Garra garra;
    private Camera camera;

    public BracoArticulado(int numeroDeArticulacoes, int pressao, String nome, int energiaMaxima, int energia){
        super(energia, energiaMaxima, nome);
        this.numeroDeArticulacoes = numeroDeArticulacoes;
        garra = new Garra(pressao);
    }
    public void inserirCamera(Camera camera){
        this.camera = camera;
    }
    public void trabalhar(){
        if(camera != null){
            int a = camera.acharPecas();
            System.out.println("Foi encontrado " +a +" pedras");
            if(a == 1){
                garra.agarrarPeca();
            }
            else{
                garra.agarrarPeca((2));
            }
        }
        else{
            System.out.println("Não tem uma camera para trabalhar");
        }
    }

}
