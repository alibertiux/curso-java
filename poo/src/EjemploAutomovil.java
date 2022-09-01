public class EjemploAutomovil {
    public static void main(String[] args){
        
        Automovil subaru = new Automovil();
        subaru.setFabricante("Subaru");
        subaru.setModelo("Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("BT-50");
        mazda.setCilindrada(3.0);
        mazda.setColor("Red");

        System.out.println("mazda.fabricante = " + mazda.getFabricante());
        System.out.println();
        System.out.println(subaru.detalle());
        System.out.println();
        System.out.println(mazda.detalle());
        System.out.println();
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println();
        System.out.println(mazda.acelerarFrenar(4000) );
        System.out.println();
        System.out.println("kilometros por litro " + subaru.calcularConsumo(300,0.6f));
        System.out.println();
        System.out.println("kilometros por litro " + subaru.calcularConsumo(300,60));

    }
}
