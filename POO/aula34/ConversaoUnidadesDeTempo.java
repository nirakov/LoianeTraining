package aula34;

public class ConversaoUnidadesDeTempo {

    public static double minSegundos(double min){
        return min * 60;
    }

    public static double horaMin(double hora){
        return hora * 60;
    }

    public static double diasHoras(double dias){
        return dias * 24;
    }

    public static double semanasDias(double semanas){
        return semanas * 7;
    }

    public static double mesDias(double meses){
        return meses * 30;
    }
    
    public static double anosDias(double anos){
        return anos * 365.25;
    }
    
}
