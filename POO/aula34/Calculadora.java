package aula34;

public class Calculadora {

    public static int somar(int num1, int num2){
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public static int dividir(int num1, int num2){
        return num1 / num2;
    }

    public static int potencia(int num, int potencia){
        int p = p * num;
        if(potencia == 1){
            return num;
        }
        return potencia(num,potencia-1);
   
    }
    
}
