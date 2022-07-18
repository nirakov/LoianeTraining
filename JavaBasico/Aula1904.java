import java.util.Scanner;
public class Aula1904{
	public static void main(String[]args){
		
		double a[] = new double [15];
		double b[] = new double [15];
		
	    int num = 2;
	    
	    for (int i = 0; i < 15; i++){
			
			a[i] = num;
			num++;
			b[i] = Math.sqrt(a[i]);
			
			System.out.println("Este é o A em " + i + "      " + a[i]);
			System.out.println("Este é o B em " + i + "      " + b[i]);
			System.out.println(" -------- ");
			
			}
		
		}
	}
