import java.util.Scanner;
import java.lang.Math; 
public class Aula1923{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int [10];
		
		int pos = 0;
			
		for(int i =0; i < 10; i++){
			
			a[i] = (int)Math.round(Math.random()*10);
			
			if ((a[i]  % 2 ) != 0){
				pos = i;
				break;
				}
			
			System.out.println("Position not even: " + pos);
			
			}
	

}
}
