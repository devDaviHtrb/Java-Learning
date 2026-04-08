public interface PaymentStrategy {
    public double payment(double value);
    
} 

class Pix implements PaymentStrategy{
    public double payment(double value){
        return value*0.90;
    };
}

class CartaoCredito implements PaymentStrategy{
    public double payment(double value){
        return value;
    };
}

class CartaoDebito implements PaymentStrategy{
    public double payment(double value){
        return value*1.1;
    };
}
