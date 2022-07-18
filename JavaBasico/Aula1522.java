import java.util.Scanner;
public class Aula1522{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("quilos de morango: ");
		double morkg = sc.nextDouble();
		System.out.println("quilos de maca : ");
		double mackg = sc.nextDouble();
		
		double tmor, tmac, total, totalkg;
		
		if (morkg < 5){
			tmor = 2.5 * morkg;
			}else{
				tmor = 2.2 * morkg;
				}
				
		if (mackg < 5){
			tmac = 1.8 * mackg;
			}else{
				tmac = 1.50 * mackg;
				}	
					
		total = tmac + tmor;
		totalkg = mackg + morkg;
		
		if (totalkg > 8 || total > 25 ){
			total = 0.9 * total;
			
		System.out.println(total);	
			
			}
		
		
		
		
		}
}
