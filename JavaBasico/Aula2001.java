import java.util.*;
public class Aula2001 {
	
	public static void main (String[] args) {
		
		Random ran = new Random();
		
		int[][] matriz = new int[4][4];
		for(int n = 0; n < 4; n++){
			for(int m = 0; m < 4; m++){
				
				matriz[n][m] = ran.nextInt(10);
				
				}
			}
			
			int mediador;
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				mediador = matriz[i][j];
				if(mediador == 9){
					System.out.println("Linha: " + i + " // Coluna: " + j + " // = " + matriz[i][j]);
										
					}

				}

				
			}
				

		
		
		
	}
}

