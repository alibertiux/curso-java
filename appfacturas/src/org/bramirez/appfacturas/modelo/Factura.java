package org.bramirez.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    //================== atributos ==============

    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 12; //valor fijo para el arreglo
    private static int ultimoFolio; //variable para generar folio

    //=========== constructores ===============

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio; //autogenera el folio no es necesario set
        this.fecha = new Date();
    }

    //============== metodos ===================

    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item) {
        if (indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public float calcularTotal() {
        float total = 0.0f;
        /*for (ItemFactura item : this.items) */
        for(int i =0; i < indiceItems; i++){
            total += this.items[i].calcularImporte();
            //ItemFactura item = this.items[i];
            /*if (item == null) { // (!(item instanceof ItemFactura)) misma forma de aplicar
                continue;
            }*/
            //total += item.calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura N°: ");
        sb.append(folio)
                .append("\nCliente:")
                .append(this.cliente.getNombre())
                .append("\t NIF: ")
                .append(cliente.getNif())
                .append("\nDescripción: ")
                .append(this.descripcion)
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emision; ")
                .append(df.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t\t$\t\t\tCant.\t$Total\n");

        for (int i = 0; i < indiceItems; i++) {
          //  ItemFactura item = ;
            sb.append(this.items[i].toString())
                    .append("\n");
                    /*.getProducto().getCodigo())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t\t")
                    .append(item.getProducto().getPrecio())
                    .append("\t\t")
                    .append(item.getCantidad())
                    .append("\t\t")
                    .append(item.calcularImporte())*/ //con la creacion del metodo toString se puede evitar todas estas lineas


        }
        sb.append("\nGran Total: ")
                .append(calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle(); // invoca todo lo del metodo
    }
}



