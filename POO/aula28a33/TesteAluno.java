
public class TesteAluno {
    public static void main(String[] args) {

        Aluno teste = new Aluno("Hector", "ADM");
        System.out.println(teste.getMatricula());
        String[] materias = {"m","p","l"};
        teste.setMateria(materias);
        System.out.print(teste.verificarAprovacao(9.0));

        
    }
 
}
