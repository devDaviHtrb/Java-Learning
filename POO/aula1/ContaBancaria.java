public class ContaBancaria {
    protected int numero;
    protected double saldo;

    public ContaBancaria(int numero, double saldoInicial){
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public boolean sacar(double valor){
        if(valor>this.saldo){
            System.out.println("Saldo insuficiente");
            return false;
        }
        this.saldo = this.saldo - valor;
        return true;
    }
}
