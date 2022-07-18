import java.util.Scanner;
public class Aula1933{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double a[] = new double[10];
		int primo = 0;
		
		for(int i =0; i < 10; i++){
			
			System.out.print("Digite o elemento [" + i + "] de 9: " );
			a[i] = sc.nextInt();
			
			if(a[i] == 2){
				System.out.println("Numero primo");
				} else if((a[i] % 2) == 0){
					System.out.println("Numero não primo");
					}else{
						for(int n = 3; n <= (a[i] / 2); n++){
							if((a[i] / n) == 0){
								primo++;								
								}							
							}
							
				if(primo > 0){
					System.out.println("Numero não primo");
				}else{
					System.out.println("Numero primo");
				}
							
						}
					
		}
}
}
