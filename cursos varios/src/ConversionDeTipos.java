import javax.management.StringValueExp;
import javax.print.Doc;
import javax.swing.text.StringContent;

public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);// parametro cambia de int a otro datos primitivo (str, dooble, boolean)
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);// parametro cambia de dooble a otro datos primitivo (str, int, boolean)
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "null";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr); // parametro cambia de boolean a otro datos primitivo (str, dooble, int)
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otronumeroInt = 100;

        System.out.println("otronumeroInt = " + otronumeroInt);

        String otroNumeroStr = Integer.toString(otronumeroInt);// parametro cambia de str a double
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otronumeroInt+10);// parametro cambia de str a double
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);
        
        int i = 32768;
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char) i;
        System.out.println("b = " + b);
        float f =(float) i;
        System.out.println("f = " + f);




    }
}
