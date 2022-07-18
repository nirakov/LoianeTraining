import java.util.Scanner;
public class Aula156{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite tres numeros: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num1 >= num2 && num1 >= num3){
			
			System.out.print("O maior numero e: " + num1 );
			
			}else if (num2 >= num1 && num2 >= num3){
				;
					System.out.print("O maior numero e: " + num2 );

				}else if (num3 >= num2 && num3 >= num1){
				
					System.out.print("O maior numero e: " + num3 );
				}

				}	

		}
