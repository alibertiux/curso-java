public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis(); // error

        for(int i = 0; i < 500; i++){
            c = c.concat(a).concat(b).concat("\n"); // 500 => 2 ms, 1000 => 4ms, 10000 => 105ms, 100000 => 5071ms
           // c += a + b + "\n" ; // 500 => 19ms, 1000 => 21ms, 10000 => 68ms, 100000 => 1976ms
           // sb.append(a).append(b).append("\n");// 500 => 0 ms, 1000 => 0ms, 10000 => 2ms, 100000 => 8ms
        }

        long fin =System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println(" c = " + c);

    }
}
