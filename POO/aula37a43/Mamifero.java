package aula37a43;

public class Mamifero extends Animal{
    private String alimento;

    public Mamifero(String nome, double comprimento, String cor, double velocidade, String alimento){
        super(nome,comprimento,4,cor,"terra",velocidade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    public String getInfo(){
        return super.getInfo() +
        "Alimento: " + alimento + "\n";
    }
}
