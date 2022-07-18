import java.util.Scanner;
public class Aula1935{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		
		for(int i = 0; i < 10; i++){
			System.out.print("Digite um elemento para a posicao [" + i + "] de 9: " );
			a[i] = sc.nextInt();
			
			System.out.println("-----------");
			
			for(int n = 1; n <= a[i]; n++){
				if((a[i] % n) == 0){
					System.out.println(n + " divide " + a[i]);
					if ((n % 2) == 0){
						System.out.println("Divisor par");
						}else{
						System.out.println("Divisor impar");	
							}
					}

				}
				
			System.out.println("-----------");	
			
			}
		
		}	
	}
