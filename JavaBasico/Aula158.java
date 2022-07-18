import java.util.Scanner;
public class Aula158{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite tres numeros: ");
		int prod1 = sc.nextInt();
		int prod2 = sc.nextInt();
		int prod3 = sc.nextInt();
		
		if (prod1 <= prod2 && prod1 <= prod3){
			
			System.out.print("O mais barato e: " + prod1 );
			
			}else if (prod2 <= prod1 && prod2 <= prod3){
				;
					System.out.print("O mais barato: " + prod2 );

				}else if (prod3 <= prod2 && prod3 <= prod1){
				
					System.out.print("O mais barato: " + prod3 );
				}

				}	

		}
