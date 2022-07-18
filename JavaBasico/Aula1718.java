import java.util.Scanner;
public class Aula1718{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = sc.nextInt();
		boolean divide = false;
		int i = num - 1;
		int cont = 0;
		
		do{
			
			i--;
					
			if ((num % i) == 0){
				
				divide = true;
				
				}
			
			
			
			
			
			}while ((divide = false) || i > 1 );
			
			
			if (divide = true){
				System.out.println("Não Primo");
				}else{
					System.out.println("Primo");
					}
		
		
		
		
		
		
		}
	
	}
