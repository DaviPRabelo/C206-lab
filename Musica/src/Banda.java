public class Banda {
    private Musica[] musicas = new Musica[20];
    private String nome;
    private int numeroDentegrantes;

    public Banda(String nome, int numeroDentegrantes) {
        this.nome = nome;
        this.numeroDentegrantes = numeroDentegrantes;
    }

    public void tocarMusica(int posicao) {
        System.out.println("Tocando a musica " + musicas[posicao].getNome());
    }

    public void tocarShow() {
        System.out.println("Tocando show");
    }

    public boolean addMusica(Musica musica) {
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == null) {
                musicas[i] = musica;
                System.out.println("Musica adionada");
                return true;
            }
        }
        return false;
    }

    public boolean deletarMusica(Musica musica) {
        for (int i = 0; i < musicas.length; i++) {
            if(musicas[i].getNome().equals(musica.getNome()) && musicas[i].getAlbum().equals(musica.getAlbum())) {
                musicas[i] = null;
                System.out.println("Musica removida");
                return true;
            }

        }

            return false;
    }
}