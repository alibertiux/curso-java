public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO,3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println(("mazda fabricante = "+ mazda.getFabricante()));

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipo Subaru = " + tipo.getNombre());
        System.out.println("tipo desc Subaru = " + tipo.getDescripcion());


        tipo = mazda.getTipo();
        switch(tipo){
            case CONVERTIBLE:
                System.out.println("El automovil es deportivo y descapotable de dos puetas");
                break;
            case COUPE:
                System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
                break;
            case FURGON:
                System.out.println("Es un automovil utilitario de transporte de empresas");
                break;
            case HATCHBACK:
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
                break;
            case PICKUP:
                System.out.println("Es un automovil de doble cabina o camioneta");
                break;
            case SEDAN:
                System.out.println("Es un automovil mediano");
                break;
            case STATION_WAGON:
                System.out.println("Es un automovil mas grande, con maleta grande");
                break;
        }





    }
}
