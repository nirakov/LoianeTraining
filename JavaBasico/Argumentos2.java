import java.util.Scanner;
public class Argumentos2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		// 1
		System.out.println("Alo mundo");
		
		//2	
		System.out.println("Digite um valor");
		int valor = sc.nextInt();
		System.out.println("O valor digitado foi: " + valor);
		
		//3		
		System.out.println("Digite dois numeros a serem somados: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int soma = num1 + num2;
		System.out.println("A soma dos  dois números é: ");
		
		//4
		System.out.println("Digite as quatro notas bimestrais: ");
		double not1 = sc.nextDouble();
		double not2 = sc.nextDouble();
		double not3 = sc.nextDouble();
		double not4 = sc.nextDouble();
		double media = (not1 + not2 + not3 + not4)/2;
		System.out.println("A media e:" + media);
		
		//5
		System.out.print("Digite o valor em metros: ");
		double metros = sc.nextDouble();
		double cm = metros * 100;
		System.out.println("O valor de " + metros + " em cm, e: " + cm);
		
		//6
		System.out.println(" Digite o raio do circulo: ");
		double raio = sc.nextDouble();
		double area = (raio * raio) * 3.14; 
		System.out. print(" A area e: " + area);

		//7
		System.out.print("Digite o lado do quadrado");
		double lado = sc.nextDouble();
		double areaq = lado * lado;
		double metade = areaq / 2;
		System.out.print("A area e: " + areaq + " A metade da área e: " + metade);
		
		//8
		System.out.print("Quantas horas voce trabalha por mes? Qual o valor da sua hora?");
		double horas = sc.nextDouble();
		double valorhora = sc.nextDouble();
		double salario =  horas * valorhora;
		System.out.println("O seu salario sera de: " + salario);
		
		//9
		System.out.print("Digite a temperatura em F: ");
		double tf = sc.nextDouble();
		double tc = (tf * 1.8) + 32;
		System.out.println("A temperatura em graus c e: " + tc);
		
		//10
		System.out.print("Digite a temperatura em C: ");
		double tC= sc.nextDouble();
		double tF = (tC / 1.8) - 32;
		System.out.println("A temperatura em graus F e: " + tF);
		
		//11
		System.out.println("Digite dois numeros inteiros e um real: ");
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		double real = sc.nextDouble();
		double a = ( 2 * i1) * (i2 /2);
		System.out.print(a);
		double b = ( 3 * i1) + real;
		System.out.print(b);
		double c = real * real;
		System.out.print(c);
		
		//12
		System.out.print("Qual sua altura e peso?");
		double altura = sc.nextDouble();
		double idealp = (72.7*altura) - 58;
		System.out.print("O seu peso ideal e: " + idealp);
		
		//13
		System.out.print("Quanto voce ganha por hora? Quantas horas foram trabalhas este mes?");
		double horasdetrabalho = sc.nextDouble();
		double salariozinho = sc.nextDouble();
		double a1 = horasdetrabalho * salariozinho;
		double b1 = a1 * 0.11;
		double c1 = b1 * 0.08;
		double d1 = c1 * 0.05;
		double e1 = a1 - (b1 + c1 + d1 );
			
		//14
		System.out.print("Qual o tamanho do arquivo? Qual a velocidade da internet? ");
		double tamanho = sc.nextDouble();
		double velocidade = sc.nextDouble();
		double download = tamanho/velocidade;
		System.out.print("O tempo de downloa é de: " + download);
		
				
	
		
		
		
		
		
		
	


		}
	}
