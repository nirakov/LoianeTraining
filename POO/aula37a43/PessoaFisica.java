package aula37a43;

public class PessoaFisica extends Contribuinte{
    private double rendaBruta;
    private double imposto;

    public PessoaFisica(String nome, double rendaBruta){
        super(nome);
        this.rendaBruta = rendaBruta;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }
    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public double getImposto() {
        return imposto;
    }

    public void calcularImposto(){
        assert rendaBruta > 0;
        if(rendaBruta <= 1400){
            imposto = 0;
        }else if( rendaBruta <= 2100){
            imposto = (0.1 * rendaBruta) - 100;
        }else if( rendaBruta <= 2800){
            imposto = (0.15 * rendaBruta) - 270;
        }else if( rendaBruta < 3600 ){
            imposto = (0.25 * rendaBruta) - 500;
        }else{
            imposto = (0.3 * rendaBruta) - 700;
        }
    }

    public String getInfo(){
        return super.getInfo() + 
        "Renda bruta: " + rendaBruta + " \n" +
        "Imposto: " + imposto + " \n";
    }


}
