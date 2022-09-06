

public class Automovil {
    // /*/*/*/*/*/*/*/*/*/*/* Atributos /*/*/*/*/*/*/*/*/*/*/*
    private int id;
    private String fabricante;
    private String modelo;
    private static Color color = Color.GRIS;
    private double cilindrada;
    private int capacidadTanque = 40;
    private TipoAutomovil tipo;
    private static Color colorPatente = Color.NARANJO;
    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoId;
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD =60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";



    // /*/*/*/*/*/*/*/*/*/*/* Constructores /*/*/*/*/*/*/*/*/*/*/*
    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadTanque) {
        this( fabricante, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }


    // /*/*/*/*/*/*/*/*/*/*/* Metodos getter and setter /*/*/*/*/*/*/*/*/*/*/*
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }
    public void  setColor(Color color) {
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
        this.capacidadTanque = capacidadTanque;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }
    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    // /*/*/*/*/*/*/*/*/*/*/* Metodo de operacion /*/*/*/*/*/*/*/*/*/*/*
    // metodo detalle
    public String detalle() {

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

        return "auto.id = " + this.id +
                "\n auto.fabricante = " + this.getFabricante() +
                "\n auto.modelo = " + this.getModelo() +
                "\n auto.tipo = " + this.getTipo().getDescripcion() +
                "\n auto.color = " + this.color +
                "\n auto.colorPatente = " + colorPatente +
                "\n auto.cilindrada = " + this.getCilindrada();
    }



    // metodo acelerar
    public String acelerar(int rpm) {
        return "el auto " + this.fabricante + " acelarando a " + rpm + " rpm";
    }

    // metodo frenanr
    public String frenar() {
        return fabricante + " " + this.modelo + " frenando!";
    }

    // metodo acelefar/frenar
    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    // metodo calcular rendimiento
    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (capacidadTanque * porcentajeBencina);
    }

    // metodo calcular rendimiento (sobrecarga de metodo / mismo nombre, distintos parametros
    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (capacidadTanque * (porcentajeBencina / 100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeBencina){
        return km / (capacidadEstanqueEstatico * (porcentajeBencina / 100f));
    }
    // /*/*/*/*/*/*/*/*/*/*/* Sobre escritura de metodos /*/*/*/*/*/*/*/*/*/*/*

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return this.id + " : " + fabricante + " " + modelo ;
    }

}
