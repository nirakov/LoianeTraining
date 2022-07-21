package aula37a43;

public class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    private double saldo;

    public ContaBancaria(String nomeCliente, int numConta, double saldo){
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void sacar(double quantia){
        assert saldo > 0;
        saldo -= quantia;
    }
    public void depositar(double quantia){
        saldo += quantia;
    }

    public String mostrarDados(){
        return "Nome cliente: " + nomeCliente + "\n" +
                "Numero conta: "  + numConta  + "\n" +
                "Saldo: "   +   saldo + "\n";
    }
    
}
