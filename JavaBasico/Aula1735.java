import java.util.Scanner;
public class Aula1735{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos termos na serie: ");
		int termos = sc.nextInt();
		
		System.out.print("S = 1/1 + ");
		
		int primeiro = 1;
		
		for(int i = 2; i <= termos; i++){
			
			int proximo = primeiro + 2;
			
			System.out.print(i + "/" + proximo + " + " );
			
			primeiro = proximo;
			
			}
		
		
		
		
		}
	
	}
