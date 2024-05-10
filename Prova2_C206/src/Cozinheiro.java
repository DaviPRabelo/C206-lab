import java.util.ArrayList;

public class Cozinheiro extends Pirata{
    private ArrayList<Receita> listaDeReceitas = new ArrayList<>();
    public Cozinheiro (String nome, String comidaFavorita,int poder ){
        super(nome,comidaFavorita,poder);
    }
    public void addNovReceita(Receita receita){

            listaDeReceitas.add(receita);
    }
    public String prepararPrato(int index){
        return listaDeReceitas.get(index).getNome();
    }
    public void mostrarReceitas(){
        System.out.println("Lista de Receitas do Cozinheiro ");
        for (int i = 0; i < listaDeReceitas.size(); i++) {

            System.out.println("Receita "+(i)+" "+listaDeReceitas.get(i).getNome());
        }
    }
}
