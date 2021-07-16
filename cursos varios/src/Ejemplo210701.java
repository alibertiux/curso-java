public class Ejemplo210701 {
    private String nombre;
    private String apellido;
    private int edad;

    public static void main(String[] args) {
        //WrapperInteger.GOOGLE_URL= "hola"; no se puede ya que es constante final
        WrapperInteger wrapperInteger = new WrapperInteger();
        wrapperInteger.correr();
        WrapperInteger.latir();
        wrapperInteger.correr2();
        WrapperInteger.latir2();
        wrapperInteger.correr3();
        WrapperInteger.latir3();
        wrapperInteger.correr4();
        WrapperInteger.latir4();
        wrapperInteger.correr5();
        WrapperInteger.latir5();
        wrapperInteger.correr6();
        WrapperInteger.latir6();

      //  WrapperInteger.GOOGLE_URL



        Ejemplo210701 ejemplo210701 = new Ejemplo210701();
        ejemplo210701.setNombre("Bertha Alicia");
        ejemplo210701.setApellido("Ramirez Mora");
        ejemplo210701.setEdad(34);
        ejemplo210701.toString();
        System.out.println("Datos = " + ejemplo210701);
        System.out.println("Datos = " + ejemplo210701.toString());
    }
    @Override
    public String toString() {
        return "Ejemplo210701{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
/*@Override
    public String toString() {
        return "nombre " + this.nombre  + " apellido " + this.apellido + "edad" + this.edad;
    }*/
}
