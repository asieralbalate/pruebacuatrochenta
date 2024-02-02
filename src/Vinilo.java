public class Vinilo implements Almacenamiento {
    private String brand = "PLATINO";
    private int capacidad = 500;
    private String tipoEscritura = "Por aguja";

    public Vinilo() {
        super();
        this.brand = brand;
    }

    @Override
    public void girarDisco() {
        System.out.println("Vinilo girando.");
    }

    @Override
    public void guardar(String datos) {
        System.out.println("Datos almacenados en Vinilo: " + datos +
                "\nTipo de escritura: " + tipoEscritura);
    }

    @Override
    public void leer() {
        System.out.println("Datos leídos desde Vinilo" +
                "\nTipo de lectura: " + tipoEscritura);
    }

    @Override
    public void reporte() {
        System.out.println("Información del Vinilo - Brand: " + brand);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo datos almacenados en el Vinilo");
    }

    @Override
    public void formatear() {
        System.out.println("Formateando el Vinilo");
    }

    @Override
    public void realizarCopiaDeSeguridad() {
        System.out.println("Realizando backup de los datos del Vinilo");
    }

    @Override
    public void encriptarDatos() {
        System.out.println("Encriptando los datos almacenados en el Vinilo");
    }

    @Override
    public void capacidadAlmacenamiento() {
        System.out.println("El almacenamiento será de: " + capacidad + " MB");
    }
}

