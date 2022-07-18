import java.util.Scanner;
public class Aula1722{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual a quatidade de CDs? ");
		int quantidade = sc.nextInt();
		double gasto = 0;
		
		for (int i = 1; i <= quantidade; i++){
			System.out.println("Qual o valor gato no cd [" + i + "]? ");
			gasto = gasto + sc.nextDouble();
			}
		System.out.println("O valor gasto com os " + quantidade + " Cds, foi de: " + gasto);
		
		}	
	}
