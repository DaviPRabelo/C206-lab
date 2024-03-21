public class Autor {
    private String nome;
    private Saga[] sagas= new Saga[10];

    public Autor(String nome) {
        this.nome = nome;
    }

    public void listarSagas(){
        for (int i = 0; i < sagas.length; i++) {
            if(sagas[i] != null)
                System.out.println(sagas[i].getNome() + sagas[i].getNota());
        }
    }
    public void addSaga(Saga saga){
        for (int i = 0; i < sagas.length; i++) {
            if(sagas[i] == null)
            {
                sagas[i] = saga;
                break;
            }
        }
    }
}
