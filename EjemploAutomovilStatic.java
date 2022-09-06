
import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        System.out.println("velocidad en carreteta: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("velocidad en ciudad: " +Automovil.VELOCIDAD_MAX_CIUDAD);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO,3.0);
        System.out.println(("mazda fabricante = "+ mazda.getFabricante()));
        mazda.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,3.5, 50);
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,3.5, 50);
        nissan2.setTipo(TipoAutomovil.STATION_WAGON);
        System.out.println();

        Automovil spark = new Automovil("Chevrolet", "2018", Color.AMARILLO,2.5, 20);

        //nissan2.colorPatente="azul";


        Automovil auto = new Automovil();

        System.out.println(subaru.detalle());
        System.out.println();

        System.out.println(mazda.detalle());
        System.out.println();

        System.out.println(nissan.detalle());
        System.out.println();

        System.out.println(nissan2.detalle());
        System.out.println();

        System.out.println(spark.detalle());

        System.out.println("kilometros por litros = " + Automovil.calcularConsumoEstatico(300,60) );



       System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());






    }
}
