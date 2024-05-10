public class Main {
    public static void main(String[] args) {
        Capitao cap1 = new Capitao("GelaPerna", "Pão", 12, 2);
        Espadachim espada1 = new Espadachim("LoaXin", "EspetinhoDeFrango", 9, "Matadora de porco");
        Cozinheiro cozinheiro1 = new Cozinheiro("Jaquin", "SaladaDeCarne", 8);
        Pirata pirata1 = new Pirata("Jorgin", "Pão", 5);
        Receita comida1 = new Receita("Pão", 4);
        Receita comida2 = new Receita("EspetinhoDeFrango", 6);
        Receita comida3 = new Receita("SaladaDeCarne", 3);


        cozinheiro1.addNovReceita(comida1);
        cozinheiro1.addNovReceita(comida2);
        cozinheiro1.addNovReceita(comida3);

        cozinheiro1.mostrarReceitas();
        System.out.println(cozinheiro1.prepararPrato(1));

        cap1.darOrdem();
        cap1.mudarRota();
        cap1.conquistarNovoSeguidor(pirata1);
        espada1.darOrdem();
        espada1.mudarRota();
        cap1.comer(cozinheiro1, 0);
        cap1.lutar(espada1);

    }
}