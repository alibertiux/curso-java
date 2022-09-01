public class Automovil {


    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadTanque = 40;


    public String getFabricante(){
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {

    }

    //metodo detalle
    public String  detalle() {

        /* Distintas posibilidades de retornar solo utilizar con grandes cadenas sp.append es mutable
        sb.append("auto.fabricante = " + this.fabricante);
        sb.append("\n auto.modelo = " + this.modelo );
        sb.append("\n auto.color = " + this.color);
        sb.append("\n auto.cilindrada = " + this.cilindrada);
        return sb.toString();
        */

        /* forma de retornar
        String sb = "auto.fabricante = " + this.fabricante +
        "\n auto.modelo = " + this.modelo +
        "\n auto.color = " + this.color +
        "\n auto.cilindrada = " + this.cilindrada;
        return sb;
        */

        return "auto.fabricante = " + this.fabricante +
                "\n auto.modelo = " + this.modelo +
                "\n auto.color = " + this.color +
                "\n auto.cilindrada = " + this.cilindrada;
    }
        // metodo acelerar
        public String acelerar(int rpm){
            return "el auto " + this.fabricante + " acelarando a " + rpm + " rpm";
        }

        // metodo frenanr
        public String frenar(){
            return fabricante + " " + this.modelo + " frenando!";
        }
        // metodo acelefar/frenar
        public String acelerarFrenar(int rpm){
            String acelerar = this.acelerar(rpm);
            String frenar = this.frenar();
                    return acelerar + "\n" + frenar;
        }

        // metodo calcular rendimiento
        public float calcularConsumo(int km, float porcentajeBencina){
        return km/(capacidadTanque*porcentajeBencina);
        }
         // metodo calcular rendimiento (sobrecarga de metodo / mismo nombre, distintos parametros
        public float calcularConsumo(int km, int porcentajeBencina){
        return km/(capacidadTanque*(porcentajeBencina/100f));
    }


}
