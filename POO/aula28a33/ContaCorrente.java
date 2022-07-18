package aula28a33;
public class ContaCorrente {
    private int numeroConta = 0;
    private double saldo;
    private boolean status;
    private double limite;

    ContaCorrente(boolean status, double limite){
        numeroConta++;
        this.status = status;
        this.limite = limite;
        saldo = 0;
    }

    public double getSaldo(){
         return saldo;        
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getLimite(){
        return limite;
    }
     public void setLimite(double limite){
        this.limite = limite;
    }

    public boolean getStatus(){
        return status;
    }
     public void setStatus(boolean status){
        this.status = status;
    }
    
    public int getNumConta(){
        return numeroConta;
    }

    public void sacar(double valor){
        assert saldo > 0 || status == true;
        saldo -= valor;
    }

    public void deposito(double valor){
        assert (saldo + valor) <= limite;
        saldo += valor;
    }

    public boolean verificarCheque(){
        if(saldo > 0){
            return false;
        }
        return true;
    }

}
