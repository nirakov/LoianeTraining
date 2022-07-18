public class TesteForEach{
	public static void main(String[]args){
		int[] notas = {1,2,2,3,3,3,4,4,4,4,6,6,6,8,8,8,8,11,9,0};
		int[] hist = new int[12]; //numero de notas disponiveis
		
		for(int nota : notas){
			hist[nota]++;
			}
		
		for(int k : hist){
			System.out.println(k);
			}
		
	
	}


}
