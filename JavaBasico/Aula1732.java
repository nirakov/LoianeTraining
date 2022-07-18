import java.util.Scanner;
public class Aula1732{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		boolean continuar = true;
		double preco = 1;
		double total = 0;
		double valor = 0;
		int codigo = 1;
		
		do{
			
	
		do {
			
			System.out.print("Codigo: ");
			codigo = sc.nextInt();
			
												
			switch (codigo){
			
			case 100:
			System.out.print("CACHORRO QUENTE R$ 1,20 ");
			preco = 1.2;
			break;
			
			
			case 101:
			System.out.print("BAURU SIMPLES R$ 1,30 ");
			preco = 1.3;
			break;
			
			case 102:
			System.out.print("BAURU COM OVO R$ 1,50 ");
			preco = 1.5;
			break;
			
			case 103:
			System.out.print("HAMBURGER R$ 1,20 ");
			preco = 1.2;
			break;
			
			case 104:
			System.out.print("CHEESEBURGER R$ 1,30");
			preco = 1.3;
			break;
			
			case 105:
			System.out.print("REFRIGERANTE R$ 1,00");
			preco = 1;
			break;
			
			default:
			codigo = -1;
			}	
			
			if ( codigo > 99){
				
				System.out.println(" ");
				System.out.println("Quantidade: ");
				int qtd = sc.nextInt();
				valor = qtd * preco;
				total = valor + total;
				
				} 
				
				
				System.out.print("Deseja continuar? [1] = sim || [0] = nao : ");
			int resposta = sc.nextInt();
			if (resposta == 0){
			continuar = false;
				}
			
			
					
			}while (codigo > 0);
			
				
			
							
			}while (continuar == true);
			
			System.out.print("Total a pagar: " + total);
			System.out.print("Recebido: ");
			double recebido = sc.nextDouble();
			double troco = recebido - total;
			System.out.print("Troco: " + troco);
			
			
			
			
		
		}
	
	}
