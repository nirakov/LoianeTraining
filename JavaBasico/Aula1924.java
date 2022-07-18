import java.util.Scanner;
import java.util.Arrays;

public class Aula1924{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		int b[] = new int[10];
		
		int posi = 0;
		
		for(int i = 0; i < 10; i++){
			
			System.out.print(i + 1 + " Digito: ");
			a[i] = sc.nextInt();
			
			}
			
			
		for(int num = 9; num >= 0; num--){
			
			b[posi] = a[num];
			posi++;
						
			}
		
		System.out.print(Arrays.equals(a, b));
		
		
		}
}


