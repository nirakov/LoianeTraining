import java.util.Scanner;
public class Aula1715{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Em qual termo deseja parar: ");
		int n = sc.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.print("1, 1, ");

		
		
		
		for(int i =3; i <= n; i++){
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.print(proximo + ", ");
			
			}
		
				
		
		}
	
	}
