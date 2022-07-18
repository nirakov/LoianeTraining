import java.util.Scanner;
public class Aula1913{
	public static void main(String[]args){
		
		int a[] = new int [10];
		
		int num = 4;
		
		int soma = 0;
		
		for(int i = 0; i < 10; i++){
			
			a[i] = num;
			
			num++;
			
			if((a[i] % 5 ) == 0){
				
				soma++;
				
				}
			
			}
			
			
			System.out.print(soma);
			

		
		
		}
}
