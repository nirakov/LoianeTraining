import java.util.Scanner;
public class Matrizes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Alunos a computar: ");
		int i = sc.nextInt();
		
		System.out.print("Notas a computar: ");
		int j = sc.nextInt();
		
		double[][] notasAlunos = new double [i][j];
		
		double media = 0;
		double nota = 0;
		
		// definição de notas
		
		for(int linhas = 0; linhas < i; linhas++){
			
			for(int colunas = 0; colunas < j; colunas++){
				
				System.out.println("Nota " + (1 + colunas) + " do aluno [" + (linhas + 1) + "]: " );
				nota = sc.nextDouble();
				
				notasAlunos[linhas][colunas] = nota;
				
				}			
			}
		
		// mostrar a média
		
		for(int linhas = 0; linhas < i; linhas++){
			for(int colunas = 0; colunas < j; colunas++){
				
				media += notasAlunos[linhas][colunas];
				
				}
				
				System.out.println("A media do aluno [" + (linhas+1) +"] = " + media/j);
				media = 0;
			
			}
		
		
		
		
		}
	}
