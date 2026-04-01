public class ContaCorrente extends ContaBancaria{
    private double limiteChequeEspecial;

    public ContaCorrente(int numero, double saldoInicial, double limiteChequeEspecial){
        super(numero, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor){
        if(this.saldo+this.limiteChequeEspecial>=valor){
            this.saldo = this.saldo-valor;
            return true;
        }
        return false;
    }
}
