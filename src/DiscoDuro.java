public class DiscoDuro implements  Almacenamiento{
    private String brand = "TOSHIBA";

    private int capacidad = 5000;

    private String tipoEscritura = "Por cabezal magentico";
    public DiscoDuro(){
        this.brand = brand;
    }

    @Override
    public void girarDisco() {
        System.out.println("Discos del disco duro girando.");
    }


    @Override
    public void guardar(String datos) {
        System.out.println("Datos almacenados en Disco duro: " + datos  +
                "\nTipo de escritura: " + tipoEscritura);
    }

    @Override
    public void leer() {
        System.out.println("Datos leídos desde Disco duro" +
                "\nTipo de lectura: " + tipoEscritura);
    }

    @Override
    public void reporte() {
        System.out.println("Información del Disco Duro - Brand: " + brand);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo datos almacenados en el Disco duro");
    }

    @Override
    public void formatear() {
        System.out.println("Formateando el Disco duro");
    }

    @Override
    public void realizarCopiaDeSeguridad() {
        System.out.println("Realizando backup de los datos del Disco duro");
    }

    @Override
    public void encriptarDatos() {
        System.out.println("Encriptando los datos almacenados en el Disco duro");
    }

    @Override
    public void capacidadAlmacenamiento() {
        System.out.println("El almacenamiento sera de: " + capacidad + " MB");
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipoEscritura() {
        return tipoEscritura;
    }

    public void setTipoEscritura(String tipoEscritura) {
        this.tipoEscritura = tipoEscritura;
    }

}
