import java.util.Scanner;
public class Aula1926{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];
		
		for(int i = 0; i < 10; i++){
			
			a[i] = (int)Math.round(Math.random()*10);
			b[i] = (int)Math.round(Math.random()*10);
			
			if (a[i] > b[i]){
				
				c[i] = 1;
				
				}else if (a[i] == b[i]){
					
					c[i] = 0;
					
					}else{
						
						c[i] = -1;
						
						}
				System.out.print(c[i] + ",");		
			
			}
		
		
		
		}
}


