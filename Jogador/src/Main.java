public class Main {
    public static void main(String[] args) {
        Arma arma1 = new Arma(10, 7, "Machado");
        Arma arma2 = new Arma(7, 4, "katana");

        Jogador player1 = new Jogador(arma1,15, 20);

        Jogador player2 = new Jogador(arma2, 10, 14);
        
        player1.atacar(player2);
        player2.atacar(player1);

        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}