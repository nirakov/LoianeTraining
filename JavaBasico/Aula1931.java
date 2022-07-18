import java.util.Scanner;
public class Aula1931{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[20];
		int b[] = new int[20];
		
		int par = 0;
		int impar = 19;
		int tpar = 0;
		
		
		
		for(int i = 0; i < 20; i++){
		
			System.out.print("Digite o elemento [" + i + "]: ");
			a[i] = sc.nextInt();
			
			if ((a[i] % 2) == 0){
				
				b[par] = a[i];
				par++;
				tpar++;
				
				
				} else {
					
					b[impar] = a[i];
					impar--;
														
					}		
		}
	System.out.println("-------------------");	
	System.out.print("Elementos guardados: ");
	for(int i = 0; i < a.length; i++){
		System.out.print(a[i] + ",");
		}
		
	System.out.println("-------------------");
	System.out.print("Elementos pares: ");
	for(int i = tpar; i >= 0; i--){
		System.out.print(b[i] + ",");
		}
		
	System.out.println("-------------------");	
	System.out.print("Elementos impares: ");
	for(int i = tpar; i < 20; i++){
		System.out.print(b[i] + ",");
		}
	
	
	
		
	}

}

