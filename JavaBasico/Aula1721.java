import java.util.Scanner;
public class Aula1721{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas turmas?");
		int turmas = sc.nextInt();
		
		int aluturmas = 0;
		
		boolean okay = false;
		
		for (int i =1; i <= turmas; i++){
			System.out.println("Quantidade de alunos na turma[" + i + "]: ");
			int alunos = sc.nextInt();
			if (alunos > 40){
				System.out.println("Valor de alunos invalido nesta turma!!! Recomece!");
				i = turmas;
				okay = false;
				}else{
					aluturmas = aluturmas + alunos;
					okay = true;
					}
			
			}
			if (okay == true){
				int media = aluturmas / turmas;
				System.out.print("A media de alunos por turma e: " + media );
				}
			
			
		
		}
	}
