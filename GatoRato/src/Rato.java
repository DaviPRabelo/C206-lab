public class Rato {
    private float velocidade;
    private boolean escondido;

    public Rato(float velocidade, boolean escondido) {
        this.velocidade = velocidade;
        this.escondido = escondido;
    }


    public void esconder(){
        escondido = true;
    }
    public void procurarComida(){
        escondido = false;
    }
    @Override
    public String toString(){
       return "O rato possui uma velocidade de "+this.velocidade;

    }

    public boolean Escondido() {
        return this.escondido;
    }
    public float Velocidade(){
        return this.velocidade;
    }
}
