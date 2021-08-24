package org.bramirez.appfacturas;

import java.util.Scanner;

import org.bramirez.appfacturas.modelo.Cliente;
import org.bramirez.appfacturas.modelo.Factura;
import org.bramirez.appfacturas.modelo.ItemFactura;
import org.bramirez.appfacturas.modelo.Producto;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Bertha");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese una descripción de la factura: ");
       // String desc = ;
        Factura factura = new Factura(s.nextLine(), cliente);

        Producto producto;
        /*String nombre;
        float precio;
        int cantidad;*/

        System.out.println();

        for (int i = 0; i < 2; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto n° " + producto.getCodigo() + ": ");
            producto.setNombre(s.next());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");

            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
            //s.nextLine();

        }
        System.out.println(factura);
    }
}
