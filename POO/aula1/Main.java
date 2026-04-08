public class Main {
    public static void main(String[] args){


        ContaCorrente conta2 = new ContaCorrente(1124, 12, 123);
        conta2.sacar(30);
        System.out.println(conta2.getSaldo());
    }
}
