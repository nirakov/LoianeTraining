import java.util.Scanner;
public class Aula1724{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		double price = 0;
		
		System.out.println("Preco do pao: 0.18");
		System.out.println("Panificadora Pao de Ontem - Tabela de precos: ");
		
		for(int i = 1; i <= 50; i++){
			price = i * 0.18;
			System.out.print(i + "- R$ " + price);
			System.out.println(" ");
			
			}
		
		}
	}
