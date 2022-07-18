import java.util.Scanner;
public class Aula1918{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		int idade[] = new int[10];
		
		int minimo = 100;
		int maximo = 0;		
		
		for(int i = 0; i < 10; i++){
			System.out.print("Digite a idade da pessoa [" + i + "]:");
			idade[i] = sc.nextInt(); 
			
			if (idade[i] < minimo){
				minimo = idade[i];
			}
				
			if (idade[i] > maximo){
				maximo = idade[i];
			}	
		}	
			
			
		for (int counter = 0; counter < 10; counter++){
				
				if (idade[counter] == minimo){
					
					System.out.println("A pessoa com menor idade e a pessoa " + counter + " com: " + minimo + " anos de idade.");
					
					}
				if (idade[counter] == maximo){
					
					System.out.println("A pessoa com menor idade e a pessoa " + counter + " com: " + maximo + " anos de idade.");
					
					}	
				
				}
							
				
		
			} 		
		
		}
