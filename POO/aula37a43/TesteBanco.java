package aula37a43;

public class TesteBanco {
    public static void main(String[] args) {

        // criar Conta Bancaria
        ContaBancaria cb = new ContaBancaria("Alana", 1234, 100.0);
        // criar conta poupança
        ContaPoupanca cp = new ContaPoupanca("Poupançuda", 666, 100.6, 12);
        // criar conta especial
        ContaEspecial ce = new ContaEspecial("Wagner", 43229, 100.00, 250.0);

        // sacar cb
        cb.sacar(13.0);
        // sacar p
        cp.sacar(4.00);
        // sacar ce
        ce.sacar(50.00);

        // depositar sb
        cb.depositar(50.00);
        // depositar p
        cp.depositar(90.00);
        // depositar ce
        ce.depositar(5.00);

        // novo saldo com rendimento da cp
        cp.calcularNovoSaldo(20);
        System.out.printf("Novo saldo com rendimento de %d e de %f ",20,cp.getSaldo());
        
        // mostrar dados de uma conta
        System.out.println(cb.mostrarDados());
        System.out.println(cp.mostrarDados());
        System.out.println(ce.mostrarDados());

    }
    
}
