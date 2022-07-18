public class Aluno {
    private String nome;
    private int matricula = 0;
    private String curso;
    private String[] materias;
    private double[] notas;

    Aluno(String nome, String curso){
        this.nome = nome;
        matricula++;
        this.curso = curso;
    }

    public void setMateria(String[]materias){
        this.materias = materias;
    }

    public void setNotas(double[]notas){
        this.notas = notas;
    }

    public boolean verificarAprovacao(double nota){
        if(nota >= 7){
            return true;
        }
        return false;
    }

    public String getNome(){
        return nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public String getCurso(){
        return curso;
    }

    public String[] getMaterias(){
        return materias;
    }

    public double[] getNotas(){
        return notas;
    }
   
}
