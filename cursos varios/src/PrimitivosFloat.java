public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat = 1.0f;
        System.out.println("realFloat = "+ realFloat);
        float realFloat2 = 1.5e4f;
        System.out.println("realFloat2 = "+ realFloat2);
        float realFloat3 = 1.5e-10f;
        System.out.println("realFloat3 = "+ realFloat3);

        System.out.println("float corresponde en byte a = "+ Float.BYTES);
        System.out.println("float corresponde en bites a = "+ Float.SIZE);
        System.out.println("maximo corresponde en bites a = "+ Float.MAX_VALUE);
        System.out.println("minimo corresponde en bites a = "+ Float.MIN_VALUE);

        double realDouble = 3.4028235e39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a = "+ Double.BYTES);
        System.out.println("double corresponde en bites a = "+ Double.SIZE);
        System.out.println("maximo corresponde en bites a = "+ Double.MAX_VALUE);
        System.out.println("minimo corresponde en bites a = "+ Double.MIN_VALUE);

    }
}
