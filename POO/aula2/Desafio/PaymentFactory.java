public class PaymentFactory {
    public static PaymentStrategy createPayment(String type){
        if(type.equalsIgnoreCase("pix")){
            return new Pix();
        }
        if(type.equalsIgnoreCase("credit card")){
            return new CartaoCredito();
        }
        if(type.equalsIgnoreCase("debit card")){
            return new CartaoDebito();
        }
        throw new IllegalArgumentException("Tipo de pagamento inválido");

    }
}
