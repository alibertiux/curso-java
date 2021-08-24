public class OperadoresLogico {
    public static void main(String[] args){
        int i = 3;
        byte j = 3;
        byte j1 =7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j && k > l; // solo una comparacion es true por eso es false
        System.out.println("b1 = " + b1);

        boolean b2 = i == j && k < l; // las 2 son true por eso es true
        System.out.println("b2 = " + b2);

        boolean b3 = i == j && k < l && m == true; // solo 2 comparaciones de 3 son true, es false
        System.out.println("b3 = " + b3);

        boolean b4 = i == j && k < l && m == false; // las 3 comparaciones son true, es true
        System.out.println("b4 = " + b4);

        boolean b5 = i == j1 || k < l; //
        System.out.println("b5 = " + b5);

        boolean b6 = i == j1 || k > l; // las 2 son false, ya es false
        System.out.println("b6 = " + b6);

        boolean b7 = i == j1 && k > l || m == false;
        System.out.println("b7 = " + b7);

        boolean b8 = i == j1 && (k > l || m == false);
        System.out.println("b8 = " + b8);

        boolean b9 = (i == j1 && k > l) || m == false;
        System.out.println("b9 = " + b9);

        boolean b10 = i == j || k < l && m == true; // true primero se resuelve && y despues || cambia la procedencia con ()
        System.out.println("b10 = " + b10);
    }
}
