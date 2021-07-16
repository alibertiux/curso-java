public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {

        String archivo = "alguna_imagen.jpg";
        int i = archivo.indexOf(".");
        int j = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i+1));
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(j+1));



    }
}
