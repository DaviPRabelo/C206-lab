public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Autor");
        Saga saga1 = new Saga(10, "A");
        Saga saga2 = new Saga(7, "b");
        Livro livro1 =new Livro("ABC", 70);
        Livro livro2 =new Livro("DEF", 60);
        Livro livro3=new Livro("GHI", 50);
        autor1.addSaga(saga1);
        autor1.addSaga(saga2);

        saga1.addLivros(livro1);
        saga1.addLivros(livro2);
        saga1.addLivros(livro3);
        autor1.listarSagas();
        saga1.listarLivros();
        saga2.listarLivros();
    }
}