package aula37a43;

public class PessoaJuridica extends Contribuinte{
   private double rendaBruta;
    private double imposto;

    public PessoaJuridica(String nome,double rendaBruta){
        super(nome);
        this.rendaBruta = rendaBruta;
    }

    public double getImposto() {
        return imposto;
    }
    public double getRendaBruta() {
        return rendaBruta;
    }
    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public void calcularImposto(){
        imposto = rendaBruta * 0.1;
    }

    public String getInfo(){
        return super.getInfo() + 
        "Renda bruta empresa: " + rendaBruta + " \n" +
        "Imposto: " + imposto + " \n";        
    }
        
}
