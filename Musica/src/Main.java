public class Main {
    public static void main(String[] args) {
        Banda banda1 = new Banda("ABC", 5);
        banda1.addMusica(new Musica("AD", "AC"));
        banda1.addMusica(new Musica("Ab", "AC"));
        banda1.addMusica(new Musica("As", "AC"));

        banda1.tocarMusica(2);
        banda1.tocarShow();
        banda1.deletarMusica(new Musica("As", "AC"));
    }
}