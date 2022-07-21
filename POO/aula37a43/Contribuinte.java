package aula37a43;

public abstract class Contribuinte {
    private String nome;

    public Contribuinte(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInfo(){
        return "Nome: " + nome + " \n";
    }

}
