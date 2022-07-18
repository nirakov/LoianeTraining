import java.util.Scanner;
public class Aula1937{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		int b[] = new int[10];
		int pot = 1;
		
		for(int i = 0; i < 10; i++){
			System.out.print("Digite um valor [" + i +"]: ");
			a[i] = sc.nextInt();
						
			for(int n = a[i]; n > 0; n--){
				
				pot = n * pot;
				
				}
			b[i] = pot;
			pot = 1;
			}
			
		for(int m =0; m < 10; m++){
			System.out.println(a[m]);
			System.out.println(b[m]);
			
			}	
		
		
		}	
	}
