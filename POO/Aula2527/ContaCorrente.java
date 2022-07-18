public class ContaCorrente {
    int numero;
    double saldo;
    boolean status;
    double limite;

    // saque, verificando se o cliente pode realizar o saque 
    double sacar(double valor){
        assert saldo >= valor || status == true;
        return saldo -= valor;
    }

    //depositra dinheiro
    double deposito(double valor){
        assert (saldo += valor) <= limite;
        return saldo += valor;
    }

    //consultar saldo
    void verSaldo(){
        System.out.printf("O saldo é de %5.2f euros",saldo);
    }

    //verificar se está usando cheque especial ou não
    void chequeEspecial(){
        if(saldo < 0){
            System.out.print("Em cheque especial!");
        }else{
            System.out.print("Não está a usar cheque especial! ");
        }
    }
    
}
