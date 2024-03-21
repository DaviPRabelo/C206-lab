public class Livro {
    private String Titulo;
    private int paginas;

    public Livro(String titulo, int paginas) {
        this.paginas = paginas;
        this.Titulo = titulo;
    }
    public String getTitulo(){
        return this.Titulo;
    }
    public int getPaginas(){
        return this.paginas;
    }
}
