import java.util.Scanner;
public class Aula1922{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		int count1 = 0;
		int count0 = 0;
		
		
		for(int i = 0; i < 10; i++){
			
			a[i] = (int)Math.round(Math.random()*1);
			
			if( a[i] == 0 ){
				count0++;
				}else if (a[i] == 1){
					count1++;					
					}
						
			}		
		
		System.out.println("O numero de 0 aleatorios e: " + count0);
		System.out.println("O numero de 1 aleatorios e: " + count1);
		
		}
}
