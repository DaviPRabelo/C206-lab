public class Main {
    public static void main(String[] args) {
        Rato rato = new Rato(9,true);
        Gato gato = new Gato("Preto", 8, 7);

        System.out.println(gato.toString());
        System.out.println(rato.toString());

        rato.procurarComida();

        gato.cacar(rato);

        gato.brincar();

        rato.esconder();
        gato.cacar(rato);
    }
}