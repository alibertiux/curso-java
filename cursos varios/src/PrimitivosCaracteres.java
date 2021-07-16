public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter ='1';
        char caracter1 ='\u0040';
        char decimal = 64;
        char simbolo = '@';
        char espacio = '\u0020';
        char retroceso = '\b';

        System.out.println("caracter = " + caracter);
        System.out.println("caracter1 = " + caracter1);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));
        System.out.println("decimal = caracter1: " + (decimal == caracter1));
        System.out.println("simbolo = caracter1: " + (simbolo == caracter1));

        System.out.println("char corresponde en byte:" + retroceso + Character.BYTES);
        System.out.println("char corresponde en bites:" + Character.SIZE);
        System.out.println("Character.MIN_VALUE = "+ Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = "+ Character.MAX_VALUE);
    }
}
