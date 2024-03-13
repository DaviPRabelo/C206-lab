//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Cliente cliente1 = new Cliente("111.111.111-11", "Roberto",2000, 1200);
            Cliente cliente2= new Cliente("222.222.222-22", "Julia", 3000, 1600);

            if(cliente1.sacar(150) == true) {
                System.out.println("Saque bem-sucedido");
            }
            else {
                System.out.println("Saque mal-sucedido");
            }
            cliente2.depositarDinheiro(300);
            if(cliente1.comprarComCredito(100)== true) {
                System.out.println("Compra autorizada");
            }
            else {
                System.out.println("Compra não autorizada");
            }
            if(cliente1.transferir(cliente2, 300)==true) {
                System.out.println("transferencia realizada");
            }
            else {
                System.out.println("transferencia interrompida");
            }
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());

        }
    }
