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
        int resultado = 1;
        for(int i = 0; i < potencia;i++){
            resultado = resultado * num;
        }
       return resultado;
    }

    public static int fatorial(int num){
        int resultado = 1;
        for(int i = 0; i < num; i++){
            resultado = resultado * num;
        }
        return resultado;
    }

    
}
