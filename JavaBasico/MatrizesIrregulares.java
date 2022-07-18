import java.util.Scanner;
public class MatrizesIrregulares{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		//numero de passoas a entrevistar
		System.out.print("Pessoas a entrevistar: ");
		int i = sc.nextInt();
		
		String[][] filhos = new String [i][];
		
		// perguntar aos entrevistados 
		for(int c = 0; c < i; c++){		
			System.out.println("Quantidade de filhos: ");
			int numFilhos = sc.nextInt();
								
			filhos[c] = new String[numFilhos];
				
			for(int o = 0; o < numFilhos; o++){
				
				System.out.print("Nome do filho: ");
				filhos[c][o] = sc.next();
				}
			System.out.println("----");	
						
			}
			
		//imprimir 	
		
				
			
			
			}				
			}
