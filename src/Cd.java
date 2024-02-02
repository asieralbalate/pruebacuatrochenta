public class Cd implements Almacenamiento {
    private String brand = "SONY";

    private int capacidad = 1000;

    private String tipoEscritura = "Por laser";
    public Cd(){
        this.brand = brand;
        this.capacidad = capacidad;
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public void girarDisco() {
        System.out.println("CD girando.");
    }

    @Override
    public void guardar(String datos) {
        System.out.println("Datos almacenados en CD: " + datos +
                "\nTipo de escritura: " + tipoEscritura);
    }

    @Override
    public void leer() {
        System.out.println("Datos leídos desde CD" +
                "\nTipo de lectura: " + tipoEscritura);
    }

    @Override
    public void reporte() {
        System.out.println("Información del CD - Brand: " + brand);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo datos almacenados en el CD");
    }

    @Override
    public void formatear() {
        System.out.println("Formateando el CD");
    }

    @Override
    public void realizarCopiaDeSeguridad() {
        System.out.println("Realizando backup de los datos del CD");
    }

    @Override
    public void encriptarDatos() {
        System.out.println("Encriptando los datos almacenados en el CD");
    }

    @Override
    public void capacidadAlmacenamiento() {
        System.out.println("El almacenamiento sera de: " + capacidad +  " MB");
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
