public class Cliente {

    private String nome;
    private String cpf;
    private Conta conta;

    public boolean sacar(double valor){
        if(valor <= conta.getSaldo())
        {
            double a = conta.getSaldo()-valor;
            conta.setSaldo(a);
            return true;
        }
        else{
            return false;

        }
    }
    public void depositarDinheiro(double valor){
        conta.setSaldo(valor+ conta.getSaldo());
        System.out.println("Novo valor: "+conta.getSaldo());
    }
    public boolean comprarComCredito(double valor){
        if(valor <= conta.getLimite())
        {
            return true;

        }
        else{
            return false;
        }

    }
    public boolean transferir(Cliente contaParaReceber, double valor){
        if(this.conta.getSaldo() >= valor)
        {
            contaParaReceber.conta.setSaldo(contaParaReceber.conta.getSaldo()+valor);
            this.conta.setSaldo(this.conta.getSaldo()-valor);
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString(){
        return "A conta é de "+nome+" do cpf "+cpf +conta.toString();
    }

    public Cliente(String cpf, String nome, double saldo,double limite){
        this.cpf = cpf;
        this.nome = nome;
        Conta conta1 = new Conta(saldo, limite);
        this.conta = conta1;
    }


}
