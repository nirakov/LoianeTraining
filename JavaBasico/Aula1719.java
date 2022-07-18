import java.util.Scanner;
public class Aula1719{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas notas deseja digitar: ");
		int n = sc.nextInt();
		
		double notas = 0;
		
		for (int i = 1; i <=  n ; i++){
			
			System.out.print("Digite a nota [" + i + "]: " );
			notas = notas + sc.nextDouble();
			
			}
			
			double media = notas / n; 
			System.out.println("A media e: " + media);
				
	
	}
}
