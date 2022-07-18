import java.util.Scanner;
public class Aula1934{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		
		for(int i =0; i < 10; i++){
			
			System.out.print("Digite um valor para a posição [" + i + "]: ");
			a[i] = sc.nextInt();
			
			System.out.println("-----------");
			
			for(int n = 1; n <= a[i]; n++){
				 
				if (((a[i] - n) % 2) == 0){
					System.out.println(a[i] - n + ": par");
					
					}else{
					System.out.println(a[i] - n + ": impar");						
						}								
				
				}
			
			System.out.println("-----------");				
			
						
			}
		}	
	}
