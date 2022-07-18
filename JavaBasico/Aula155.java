import java.util.Scanner;
public class Aula155{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite suas notas: ");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double media = (nota1 + nota2) / 2;
		if (media < 7){
			System.out.print("Aluno reprovado!");
			}else{
				System.out.print("Aluno aprovado");
				if (media == 10){
					System.out.print(" com distinção");
					}
				}
		
		
		

		}
}
