import java.util.Scanner;
public class Aula1733{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de n: ");
		int n = sc.nextInt();
		
		int anterior = 1;
	
		System.out.print("S = 1/1 + ");	
		for (int i = 1; i <= n; i++){
			
			int proximo = anterior + 2;
			
			
			System.out.print(i + "/" + proximo + " + " ); 
			
			anterior = proximo;			

			
			}
		
		
		
		
		
		}
	
	}
