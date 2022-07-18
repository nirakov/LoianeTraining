import java.util.Scanner;
public class Aula175{
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		boolean comparar = false;
		
		System.out.println("Populcao da primeira cidade: ");
		double popuA = sc.nextDouble();
		System.out.println("Indice de cescimento da cidade: ");
		double indiceA = sc.nextDouble();
		
		System.out.println("Populacao da segunda cidade: ");
		double popuB = sc.nextDouble();				
		System.out.print("Indice de crescimento da cidade:");
		double indiceB = sc.nextDouble();	
		
			
	
	do{
		
		popuA = (popuA * indiceA) + popuA;
		popuB = (popuB * indiceB) + popuB;
		
		
		if (popuA > popuB){
			
			comparar = true;
			System.out.print(" A população da cidade A superou a população da cidade b em: " + i + "anos" );
						
			} else if (popuA == popuB){
				comparar = true;
				System.out.print("A população da cidade A se igualou a populçao da cidade B em " + i + "anos");
								
				}		
				

				
		}while (comparar == false);
	
	
	
	
		
		
		}
	
	
	}
