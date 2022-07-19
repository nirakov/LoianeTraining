package aula36;

public class Curso {
    private Aluno alunos[];
    private Professor professores[];
    private String nome;
    private String horario;

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
    public Professor[] getProfessores() {
        return professores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getHorario() {
        return horario;
    }
    

    
}
