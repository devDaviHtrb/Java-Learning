public class Pessoa{
    protected String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void apresentar(){
        System.out.println("Olá, sou " + this.nome);
    }
}