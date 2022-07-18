import java.util.Scanner;
public class Aula1713{
	public static void main(String[]args){
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Base: ");
		int base = sc.nextInt();
				
		System.out.println("Expoente: ");
		int expo = sc.nextInt();
		
		int potencia = base;
			
		for(int i = 1; i <= expo; i++){
			
			System.out.println("Potencia de " + base + " levantado a " + i + "= " + potencia);
			potencia = potencia * base;
		
			}
		
		}
	
	}
