public class Saga {
    private int nota;
    private String nome;
    private Livro []livros = new Livro[10];

    public Saga(int nota, String nome) {
        this.nota = nota;
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public int getNota(){
        return this.nota;
    }
    public void listarLivros(){
        for (int i = 0; i < livros.length; i++) {
            if(livros[i] != null)
                System.out.println(livros[i].getPaginas() + livros[i].getTitulo());
        }
    }
    public void addLivros(Livro livro){
        for (int i = 0; i < livros.length; i++) {
            if(livros[i] == null)
            {
                livros[i] = livro;
                break;
            }
        }

    }
}
