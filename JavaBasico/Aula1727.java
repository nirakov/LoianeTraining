import java.util.Scanner;
public class Aula1727{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma quantidade de temperaturas a serem medidas: ");
		int quantidade = sc.nextInt();
		double soma = 0;
		double minima = Double.MIN_VALUE;
		double maxima = Double.MAX_VALUE;
		
		for (int i = 1; i <= quantidade; i++){
			
			System.out.print("Temperatura [" + 1 + "]: ");
			double temperatura = sc.nextDouble();
			
			soma = soma + temperatura;
			
			if(temperatura > maxima){
				maxima = temperatura;
				}
			
			if(temperatura < minima){
				minima = temperatura;
				} 
					
			}
			double media = soma / quantidade;
			
			System.out.println("Media: "+ media );
			System.out.println("Minima: "+ minima );
			System.out.print("Maxima: "+ maxima );
		
		}
	}
