package aula37a43;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, int numConta, double saldo, int diaRendimento){
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }
    public int getDiaRendimento() {
        return diaRendimento;
    }
    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    public void calcularNovoSaldo(double taxaRendimento){
        double novoSaldo = super.getSaldo() * (taxaRendimento / 100);
        super.setSaldo(novoSaldo);
    }

    public String mostrarDados(){
        return super.mostrarDados() + "Dia rendimento: " + diaRendimento + "\n";
    }

}
