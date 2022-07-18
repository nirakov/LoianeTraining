import java.util.Scanner;
public class Aula1919{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int nota1[] = new int[10];
		int nota2[] = new int[10];
		int result[] = new int[10];
		int media = 0;
		
		for(int i = 0; i < 10; i++){
			
			System.out.println("...................");
			
			System.out.println("Aluno [" + i + "]");
			
			System.out.println("Digite a nota da primeira avaliacao: ");
			nota1[i] = sc.nextInt();
			
			System.out.println("Digite a nota da segunda avaliacao: ");
			nota2[i] = sc.nextInt();
			
			result[i] = (nota1[i] + nota2[i]) / 2;
			
			if (result[i] >= 7){
				System.out.println("Aprovado! Media: " + result[i]);
				}else{
					System.out.println("Nao aprovado! Media: " + result[i]);
					}
			
			
		
			
			
			}
		
		
		
		}
}
