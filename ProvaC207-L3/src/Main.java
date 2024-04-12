public class Main {
    public static void main(String[] args) {
        BracoArticulado robo1 = new BracoArticulado(3, 10, "Robo bracin", 40, 20);
        Empilhador robo2 = new Empilhador(16, "Robo cata coisa", 35, 20 );
        Camera camera = new Camera(12);
        System.out.println(robo1.getTotalDeRobos());

        robo1.trabalhar();
        robo2.trabalhar();
        System.out.println(robo1.getEnergia());
        System.out.println(robo2.getEnergia());

        robo1.inserirCamera(camera);
        robo2.adicionarPacote(4);
        robo2.adicionarPacote(6);
        robo1.trabalhar();
        robo1.recarregar(1);
        robo2.recarregar(1);
        robo2.adicionarPacote(3);
        robo2.adicionarPacote(5);
        robo2.removerPacote(2);
        robo2.mostrarPacotes();
        System.out.println(robo1.getEnergia());
        System.out.println(robo2.getEnergia());
        robo1.trocarEnergia(robo2);
        System.out.println(robo1.getEnergia());
        System.out.println(robo2.getEnergia());

    }
}