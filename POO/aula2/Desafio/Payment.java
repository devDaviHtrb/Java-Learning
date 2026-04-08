public class Payment {
    private PaymentStrategy estrategy;
    public void setFormaDePagamento(PaymentStrategy e){
        this.estrategy = e;
    }
    public double payment(double value){
        return estrategy.payment(value);

    }
}
