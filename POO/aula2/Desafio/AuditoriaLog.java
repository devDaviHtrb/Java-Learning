public class AuditoriaLog {
    private static AuditoriaLog instance;
    private AuditoriaLog(){}

    public static synchronized AuditoriaLog getInstance(){
        if(instance==null){
            instance = new AuditoriaLog();
        }
        return instance;
    }

    public void log(double payment, String type){
        System.out.println("O pagamente R$" + payment + " foi feito via " + type);
    }
}
