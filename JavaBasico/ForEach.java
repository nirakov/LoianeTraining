import java.util.*;
public class ForEach{
	public static void main(String[]args){
		Random r = new Random();
		int[] teste = new int[5];
		
		// para definir valores, não usar o for each

		for(int i = 0; i < teste.length; i++){
		    teste[i] = r.nextInt(10);			
			}
		
		
		
		System.out.println("Teste com o for normal");
		for(int i = 0; i < teste.length; i++){
		    System.out.println("Position: ["+ i + "] = " + teste[i]);			
			}
			
		System.out.println("Teste com o For Each");
		for(int i : teste){
		    System.out.println(i);			
			}	
		
		
		
		
		}
	}
