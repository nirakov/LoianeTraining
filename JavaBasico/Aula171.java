import java.util.Scanner;
public class Aula171{
	public static void main(String[]args){
		
	Scanner sc = new Scanner(System.in);
	boolean val = false;
	
	do{
		System.out.println("Nota: ");
		int nota = sc.nextInt();
				
		if ((nota <= 10) && (nota >= 0)){
			val = true;
		}else{
				System.out.println("Valor invalido");
				val = false;
				}
			
				
		}while (val == false );
		
}
}
