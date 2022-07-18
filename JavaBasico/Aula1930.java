import java.util.Scanner;
public class Aula1930{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[20];
		int b[] = new int[20];
		int c[] = new int [20];
		
		for (int i = 0; i < 20; i++){
			
			System.out.print("Digite o valor do elemento [" + i + "]: ");
			a[i] = sc.nextInt();
			
			if((a[i] % 2) == 0){
				
				b[i] = a[i];
				
				}else 
				   
				   c[i] = a[i];			
			}
			
			
			for(int i = 0; i < b.length; i++){
				
				System.out.println("B[" + i + "]: " + b[i]);
				
				}
				
			for(int i = 0; i < c.length; i++){
				
				System.out.println("C[" + i + "]: " + c[i]);
				
				}	
				
			for(int i = 0; i < a.length; i++){
				
				System.out.println("A[" + i + "]: " + a[i]);
				
				}	
	
	
	}

}
