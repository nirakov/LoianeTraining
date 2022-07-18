import java.util.Scanner;
public class Aula1720{
	public static void main(String[]args){
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Qual o numero de pessoas?");
		int pessoas = sc.nextInt();
		
		int idades = 0;
		
		for (int i = 1; i <= pessoas; i++){
			
			System.out.println("Digite a idade da pessoa [" + i +"]: ");
			idades = idades + sc.nextInt();
			
			}
		
		int media = idades / pessoas;
		
		if (media > 60){
			System.out.print("Populacao de maioria idosa");
			}else if (26 < media){
				System.out.print("Populacao adulta ou idosa");
				}else if (media > 0){
					System.out.print("Populacao jovem");
					}	
		
		
		}
	}
