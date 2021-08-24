public class OperadoreIncrementales {
    public static void main(String[] args) {

        // pre incremento / primero se incrementa y luego se asigna a la variable
        int i = 1;
        int j = ++i; // i = i +1

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // post incremento / primero se asigna a la variable y despues se incrementa

        i = 2;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // pre decremento / primero se decrementa y luego se asigna a la variable

        i = 3;
        j = --i; // i = i - 1 =2
        System.out.println("i = " + 1);
        System.out.println("j = " + j);

        // post decremento / primero se asigna a la variable y despues se decrementa

        i = 4;
        j = i--;
        System.out.println("i = "+ i);
        System.out.println("j = "+ j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);

        System.out.println("j = " + (--j));
        System.out.println("j = " + (j--));
        System.out.println("j = " + j);
    }
}
