import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int np1, np2;
        System.out.println("Quais as notas do aluno: ");
        System.out.println("Np1: ");
        np1 = scan.nextInt();
        System.out.println("Np2: ");
        np2 = scan.nextInt();
        Aluno aluno = new Aluno(343,np1,np2, 5, "Mario");
        System.out.println(aluno.toString());
    }
}