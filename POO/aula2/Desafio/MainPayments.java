import java.util.Scanner;

public class MainPayments {
    public static void main(String [] args){
        AuditoriaLog log = AuditoriaLog.getInstance();
        Scanner scanner = new Scanner(System.in);

        double carrinho = 100;
        double preco = 40;

        System.out.printf("Digite a forma de pagamento: (pix/credit card/debit card)");
        String forma_de_pagamento = scanner.nextLine();
        PaymentStrategy tipo_pagamento = PaymentFactory.createPayment(forma_de_pagamento);

        Payment pagamento = new Payment();
        pagamento.setFormaDePagamento(tipo_pagamento);

        double pagamento_final = pagamento.payment(preco);
        carrinho -= pagamento_final;

        
        log.log(pagamento_final, forma_de_pagamento);

    }
}
