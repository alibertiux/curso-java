import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0);

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);

        Automovil auto = new Automovil();

        Date fecha = new Date();

        System.out.println(subaru.detalle());
        System.out.println();

        System.out.println(mazda.detalle());
        System.out.println();

        System.out.println(nissan.detalle());
        System.out.println();

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println();

        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println();

        System.out.println("kilometros por litro con numero flotante " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("kilometros por litro con numero entero " + subaru.calcularConsumo(300, 60));
        System.out.println("kilometros por litro " + nissan.calcularConsumo(300, 60));
        System.out.println();

        System.out.println("comparacion con signo == / hace comparacion al espacio de la memoria");
        System.out.println("es igual? "+(nissan == nissan2));
        System.out.println();

        System.out.println("comparacion con equals, comparacion de objetos similares objeto nissan y objeto nissan2");
        System.out.println("es igual con equals? "+(nissan.equals(nissan2)));
        System.out.println();

        System.out.println("comparacion con equals, comparacion de objetos diferentes auto y objeto nissan2");
        System.out.println("es igual con equals? "+(auto.equals(nissan2)));
        System.out.println();

        System.out.println("comparacion con equals, comparacion de objeto auto y objeto fecha");
        System.out.println("es igual con equals? "+(auto.equals(fecha)));
        System.out.println();

        System.out.println("identificador hashcode de forma implicita");
        System.out.println(nissan);
        System.out.println();

        System.out.println("identificador hashcode de forma explicita con toString una vez ya sobre escrito el metodo");
        System.out.println(nissan.toString());
        System.out.println();

    }
}
