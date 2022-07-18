import java.util.Scanner;
public class Aula1928{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		int b[] = new int[10];
		
		for(int i = 0; i < a.length; i++){
			System.out.print("Digite um numero: ");
			a[i] = sc.nextInt();
			}
		int posi = 0;	
			
		for(int i = a.length - 1; i >= 0; i--){
			b[posi] = a[i];
			posi++;
			}
			
		System.out.print("Vetor//Array A:");
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i] + " ");
			}	
		System.out.print("Vetor//Array reverso B:");
		for(int i =0; i < b.length; i++){
			System.out.print(b[i] + " ");
			}
	}
}
