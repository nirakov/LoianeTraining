import java.util.Scanner;
public class Aula1725{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		double total = 0;
		
		for (int count = 1; count > 0; count++){
			
			System.out.print("Produto [" + count + "]: R$");
			double price = sc.nextDouble();
			
			if (price == 0){
				count = -1;
				
				}else{
					total = total + price;				
				}
			}
									
				System.out.println("Total: " + total);
				System.out.print("Dinheiro: R$ ");
				double dinheiro = sc.nextDouble();
				double troco = dinheiro - total;
				System.out.print("Troco: R$" + troco);
						
		}
	}
