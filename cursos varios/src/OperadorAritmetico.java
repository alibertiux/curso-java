import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {
        /*int i = 5;
        int j = 4;*/
        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);

        System.out.println("i + j = " + i + j); // solo concatena
        System.out.println("i + j = " + (i + j)); // ya lo suma
        int resta = i - j;
        System.out.println("resta = " + resta);
        //System.out.println("i - j = " + i - j); da error
        System.out.println("i - j = " + (i - j));

        int multi = i * j;
        System.out.println("multiplicacion = " + multi);

        int div = i / j; // da division entera no da decimales
        float div2 = (float) i / (float) j; // las varriables i y j se cambia a float con un cast se forza a tipo flotante
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        resto =8 % 5;
        System.out.println("resto = " + resto);

        int numero  = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero")); //cuadro de dialogo para solicitar un numero
        if(numero % 2 == 0){
            System.out.println("numero par = " + numero);
        }else {
            System.out.println("numero impar = " + numero);
        }



    }
}

