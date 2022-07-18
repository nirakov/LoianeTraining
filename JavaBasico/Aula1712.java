import java.util.Scanner;
public class Aula1712{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("De qual numero você quer a tabuada? ");
		int num1 = sc.nextInt();
		
		for (int tabuada = 1; tabuada < 11; tabuada++){
			
			System.out.println( "A tabuada de " + num1 + " * " + tabuada + " = " + tabuada * num1);
			
			}
		
		
		
		
		
		}
	
	
	}
