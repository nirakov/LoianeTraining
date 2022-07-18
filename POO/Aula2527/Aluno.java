public class Aluno {
    String nome;
    int matricula;
    String curso;
    String uc1;
    String uc2;
    String uc3;
    double nota_UC1;
    double nota_UC3;
    double nota_UC2;

    void verificarAprovacao(double nota){
        if(nota >= 7){
            System.out.print("Aprovado");
        }else{
            System.out.print("reprovado");
        }
    }
    
}
