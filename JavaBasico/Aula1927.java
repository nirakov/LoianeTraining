import java.util.Scanner;
public class Aula1927{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
	
		int a[] = new int[10];
		int b[] = new int[10];
		
		
		for(int i = 0; i < 10; i++){
			
			System.out.print("VALOR [" + i + "]: ");
			a[i] = sc.nextInt();
			
			if(a[i] < 7){
				b[i] = 'a';
				}else if (a[i] == 7){
					b[i] = 'b' ;
					}else if((7 < a[i]) && (a[i] < 10)){
						b[i] = 'c' ;
						}else if (a[i] == 10){
							b[i] = 'd';
							}else{
								b[i] = 'e';
								}			
			}
			
			
	 // como imprimir os arrays -- vetore:
	 
	 System.out.print("O vetor A: ");
	 for(int i=0; i < a.length; i++){
		 System.out.print(a[i] + " ");
		 }
	 
	 System.out.print("O vetor B: ");
	 for(int i=0; i < b.length; i++){
		 System.out.print(b[i] + " ");
		 }
	 	
	
	}

}
