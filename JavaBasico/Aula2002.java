import java.util.*;
public class Aula2002 {
	public static void main (String[] args) {
		
		int[][] matriz = new int[10][10];
	    Random ran = new Random();
	    
	    // atribuir valores
		
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				matriz[i][j] = ran.nextInt(10);
				
				}
			}
			
			
			
	// determinar o menor numero da linha 5	
	
	   int menor = matriz[5][0];	
			

		for(int j = 1; j < 10; j++){
			if(menor > matriz [5][j]){
				menor = matriz[5][j];
				}				
		}
		
		if (matriz[5][9] >= menor){	
					System.out.println("MENOR NUMERO DA LINHA 5 = " + menor);								
			}else{
					System.out.println("MENOR NUMERO DA LINHA 5 = " + matriz[5][9]);						
					}
					
	// determinar maior numero da linha 5 	
	
		int maior5 = matriz[5][0];
	
	
		for(int j = 1; j < 10; j++){
			if(maior5 < matriz [5][j]){
				maior5 = matriz[5][j];
				}				
		}
		
		if (matriz[5][9] <= maior5){	
					System.out.println("MAIOR NUMERO DA LINHA 5 = " + maior5);								
			}else{
					System.out.println("MAIOR NUMERO DA LINHA 5 = " + matriz[5][9]);						
					}	

	
	
	
	// determinar o menor numero da linha 7	
	
	   int menor7 = matriz[7][0];	
			

		for(int j = 1; j < 10; j++){
			if(menor7 > matriz [7][j]){
				menor7 = matriz[7][j];
				}				
		}
		
		if (matriz[7][9] >= menor7){	
					System.out.println("MENOR NUMERO DA LINHA 7 = " + menor7);								
			}else{
					System.out.println("MENOR NUMERO DA LINHA 7 = " + matriz[7][9]);						
					}
					
	// determinar maior numero da linha 7	
	
		int maior7 = matriz[7][0];
	
	
		for(int j = 1; j < 10; j++){
			if(maior7 < matriz [7][j]){
				maior7 = matriz[7][j];
				}				
		}
		
		if (matriz[7][9] <= maior7){	
					System.out.println("MAIOR NUMERO DA LINHA 7 = " + maior7);								
			}else{
					System.out.println("MAIOR NUMERO DA LINHA 7 = " + matriz[7][9]);						
					}	
			
			

		


		
	}
}

