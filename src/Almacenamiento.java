public interface Almacenamiento {
    void girarDisco();
    void guardar(String datos);
    void leer();
    void reporte();
    void reproducir();
    void formatear();
    void realizarCopiaDeSeguridad();
    void encriptarDatos();

    void capacidadAlmacenamiento();
}
