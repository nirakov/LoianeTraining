import java.util.Scanner;
public class Matriz3D{
	public static void main(String[]args){
		
		int[][][] matriz = new int [3][3][3];
		
		for(int i =0; i < 3; i++){
			for(int j =0; j < 3; j++){
				for(int z =0; z < 3; z++){
					
				matriz[i][j][z] = i + j + z;
				System.out.println("matriz [" + i + "]" + "["+ j +"]" + "["+ z +"] = " + matriz[i][j][z]);
					
					}
				}
				
				
			
			}
		
		
		}
	}
