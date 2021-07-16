public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; //false
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBollean2 = Boolean.valueOf("false");
        Boolean objBollean3 = true;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBollean2 = " + objBollean2);

        System.out.println("comparando dos objetos boolean: " + (objBoolean == objBollean2));
        System.out.println("comparando dos objetos boolean: " + (objBoolean.equals(objBollean2)));
        System.out.println("comparando dos objetos boolean: " + (objBollean2 == objBollean3));
        System.out.println("comparando dos objetos boolean: " + (objBollean2.equals(objBollean3)));

    }
}
