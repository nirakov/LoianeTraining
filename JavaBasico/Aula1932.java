import java.util.Scanner;
public class Aula1932{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int mult = 0;
		
		for(int i =0; i < 5; i++){
			
			System.out.print("Digite o elemento [" + i + "]: ");
			a[i] = sc.nextInt();
			mult = 0; 
			
			do{
			System.out.println(a[i] + " * " +  mult + " = " + a[i] * mult);
			
			mult++;			
			
			}while(mult <= 10);		
						
			}

		
	    
	}

}
