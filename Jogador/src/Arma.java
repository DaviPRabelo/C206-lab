public class Arma {
    private int dano;
    private String tipo;
    private int custoDeEnergia;

    public Arma(int dano, int custoDeEnergia, String tipo){
        this.dano = dano;
        this.custoDeEnergia = custoDeEnergia;
        this.tipo = tipo;
    }

    public int CustoDeEnergia() {
        return custoDeEnergia;
    }

    public int Dano() {
        return this.dano;
    }
    public String Tipo(){
        return this.tipo;
    }
}
