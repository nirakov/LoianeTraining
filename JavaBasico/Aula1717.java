import java.util.Scanner;
public class Aula1717{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int n = sc.nextInt();
		
		int factorial = 1;
		
		System.out.print(n + "! = ");
		
		for (int i = n; i > 1 ; i--){
		
		factorial = factorial * i;
		
		System.out.print(i + "*");
		
		}
		
		System.out.print("1 = " + factorial);
		
		
	}
}
