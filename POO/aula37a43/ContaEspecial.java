package aula37a43;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite){
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void depositar(double valor){
        assert (super.getSaldo() + valor) <= limite;
        double novoSaldo = super.getSaldo();
        novoSaldo += valor;
        super.setSaldo(novoSaldo);
    }

    public String mostrarDados(){
        return super.mostrarDados() + "Limite da conta: " + limite + "\n";
    }
    
}
