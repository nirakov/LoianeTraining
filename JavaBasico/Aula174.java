import java.util.Scanner;
public class Aula174{
	public static void main (String[] args){
		
		//inicio 
		
		double popuA = 80000;
		double popuB = 200000;
		int i = 1;
		boolean comparar = false;
		

	
	
	do{
		
		popuA = (popuA * 0.03) + popuA;
		popuB = (popuB * 0.015) + popuB;
		
		
		if (popuA > popuB){
			
			comparar = true;
			System.out.print(" A população da cidade A superou a população da cidade b em: " + i + "anos" );
						
			} else if (popuA == popuB){
				comparar = true;
				System.out.print("A população da cidade A se igualou a populçao da cidade B em " + i + "anos");
								
				}		
				
		i++;
				
		}while (comparar == false);
	
	
	
	
		
		
		}
	
	
	}
