package aula36;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double media(){
        double soma = 0;
        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        return (soma/notas.length);
    }

    public String aprovacao(){
        double media = media();
        if(media >= 7){
            return "Aprovado, media: " + media + "\n";
        }
        return "Reprovado, media: " + media + "\n";

    }


    
}
