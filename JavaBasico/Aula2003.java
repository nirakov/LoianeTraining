import java.util.Scanner;
public class Aula2003{
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		
		// DEFINIT VALORES

		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print("VALOR PARA: [" + i + "]["+ j+ "] = ");
				matriz[i][j] = sc.nextInt();
				
				}
			}
			
			// MOSTAR
			
			int par = 0;
			int impar = 0;


		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length; j++){
				
				if(matriz[i][j] % 2 == 0){
					par++;
					} else {
						impar++;
						}
					
				}
			}		
		
		System.out.print("PARES: " + par + " IMPARES: "+ impar);
		
	}
}

