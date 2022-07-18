import java.util.Scanner;
public class Aula1726{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Factoral de: ");
		int numero = sc.nextInt();
		int factorial = numero;
		System.out.print(numero + "! = ");
		
		
		for (int i = numero; i > 1; i--){
			
			factorial = factorial * i; 
			System.out.print(i + " * ");			
			}
		
		System.out.print(" 1 = " + factorial );
		
		}
	}
