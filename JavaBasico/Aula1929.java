import java.util.Scanner;
public class Aula1929{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[20];
		
		for(int i =0; i < 10; i++){
			
			System.out.println("Digite o termo ["+ i +"] de A:");
			a[i] = sc.nextInt();
			
			System.out.println("Digite o termo ["+ i +"] de B:");
			b[i] = sc.nextInt();
			
			}
		
		for (int i =0; i < 20; i++){
			
			if(i > 11){
				c[i] = c[i];
				}else{
					c[i] = b[i];
					}
			
			}
			
			
		for(int i = 0; i <10; i++){
			System.out.print(a[i]+" ");
			} 	
			
		System.out.println(".........");
			
		for(int i = 0; i <10; i++){
			System.out.print(b[i]);
			} 
			
		System.out.println(".........");
			
		for(int i = 0; i <20; i++){
			System.out.println(c[i]+" ");
			} 	
		System.out.println(".........");
	}

}
