import java.util.Scanner;
public class Aula1925{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		int b[] = new int[10];
		
		for(int i = 0; i < 10; i++){
			
			System.out.println("Digite um valor: ");
			a[i] = sc.nextInt();
			
			if ((a[i] % 2) == 0){
				
				b[i] = 1;
				
				}else{
					
					b[i] = 0;
					
					}
			
			
			}
		
		
		}
}


