import java.util.Scanner;
public class Aula1714{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int num, par = 0, impar = 0;
		
		for(int i = 1; i <= 10; i++){
			
			System.out.println("[" + i +"] Digite um numero: ");
			num = sc.nextInt();
			
			if (num % 2 == 0){
				
				par++;
				
				}else{
					
					impar++;
					
					}	
			}
			
			System.out.println("O numero de pares e: " + par);
			System.out.println("O numero de impares e : " + impar);
		
		}
	
	}
