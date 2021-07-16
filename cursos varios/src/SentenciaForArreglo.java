import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        //String[] nombres = new String[6;]
        String [] nombre = {"Andres", "pepe", "maria", "paco", "lalo", "bea", "pato", "pepa"};
        int count = nombre.length;
        for(int i = 0; i < count; i++){
            if((nombre[i].equalsIgnoreCase("andres")) || nombre[i].equalsIgnoreCase("pepa")){
                    continue;
            }
            System.out.println(i + " .- " +nombre[i]);
        }
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"pepe\" o \"Maria\"");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for(int i = 0; i < count; i++){
            if(nombre[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
            System.out.println("nombre = " + nombre[i]);
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");
        }else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en sistema!");
        }
    }
}

