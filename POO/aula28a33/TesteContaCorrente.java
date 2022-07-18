package aula28a33;
import java.util.Scanner;
public class TesteContaCorrente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ContaCorrente cliente1 = new ContaCorrente(false,100);
        System.out.println(cliente1.getSaldo());
        cliente1.deposito(50);
        System.out.println(cliente1.getSaldo());
        cliente1.sacar(25);
        System.out.println(cliente1.getSaldo());

        sc.close();        
    }
}
