package aula36;
import java.util.Scanner;
public class TesteFacul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Curso aci = new Curso();

        Aluno[] estudantes = new Aluno[5];

        String nome = " ";
        String matricula = " ";
        double[] notas = new double[4];

        for (int i = 0; i < estudantes.length; i++) {
            System.out.println("Nome aluno: ");
            nome = sc.next();
            System.out.print("Matricula: ");
            matricula = sc.next();
            for(int j = 0; j < 4; j++){
                System.out.printf("NOTA %d: ",j+1);
                notas[j] = sc.nextDouble();
            }
            Aluno a = new Aluno();
            a.setNotas(notas);
            a.setNome(nome);
            a.setMatricula(matricula);
            estudantes[i] = a;
        }
        
        aci.setAlunos(estudantes);

        for (int i = 0; i < estudantes.length; i++) {
            System.out.print(estudantes[i].aprovacao());
        }

        sc.close();
    }
    
}
