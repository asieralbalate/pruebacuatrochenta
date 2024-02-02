public class BlueRay extends Cd {
    private String brand = "AVATAR";
    private int capacidad = 25000;
    private String tipoEscritura = "Láser azul";

    public BlueRay() {
        this.brand = brand;
    }

    @Override
    public void girarDisco() {
        System.out.println("BlueRay girando.");
    }

    @Override
    public void guardar(String datos) {
        System.out.println("Datos almacenados en BlueRay: " + datos +
                "\nTipo de lectura: " + tipoEscritura);
    }

    @Override
    public void leer() {
        System.out.println("Datos leídos desde BlueRay" +
                "\nTipo de lectura: " + tipoEscritura);
    }

    @Override
    public void reporte() {
        System.out.println("Información del BlueRay - Brand: " + brand);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo datos almacenados en el BlueRay");
    }

    @Override
    public void formatear() {
        System.out.println("Formateando el BlueRay");
    }

    @Override
    public void realizarCopiaDeSeguridad() {
        System.out.println("Realizando backup de los datos del BlueRay");
    }

    @Override
    public void encriptarDatos() {
        System.out.println("Encriptando los datos almacenados en el BlueRay");
    }


    @Override
    public void capacidadAlmacenamiento() {
        System.out.println("El almacenamiento será de: " + capacidad + " MB");
    }
}


