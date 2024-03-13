public class Conta {
    private double saldo;
    private double limite;

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double valor){
        this.saldo = valor;
    }
    public double getLimite(){
        return limite;
    }
    @Override
    public String toString(){
        return "A conta possui " +saldo+" de saldo e " +limite+" de limite.";
    }
    public Conta(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
    }


}
