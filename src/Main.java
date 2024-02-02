public class Main {
    public static void main(String[] args) {
        Cd cd = new Cd();
        DiscoDuro discoDuro = new DiscoDuro();
        Vinilo vinilo = new Vinilo();
        BlueRay blueRay = new BlueRay();

        cd.girarDisco();
        cd.guardar("Datos de prueba para el cd");
        cd.leer();
        cd.reporte();
        cd.reproducir();
        cd.formatear();
        cd.realizarCopiaDeSeguridad();
        cd.encriptarDatos();
        cd.capacidadAlmacenamiento();

        System.out.println("\n");

        discoDuro.girarDisco();
        discoDuro.guardar("Datos de prueba para el disco duro");
        discoDuro.leer();
        discoDuro.reporte();
        discoDuro.reproducir();
        discoDuro.formatear();
        discoDuro.realizarCopiaDeSeguridad();
        discoDuro.encriptarDatos();
        discoDuro.capacidadAlmacenamiento();

        vinilo.leer();

        blueRay.leer();

        /*
        - ¿Si tienes clases de las que heredas se aplicarían a LP y BlueRay? Si es así, extiende las nuevas
clases. Si no es así, ¿deberías modificarla o ampliar una clase abstracta diferente?

        Si las extiendo si que podra acceder por herencia a todos los metodos que hay en la clase padre, por ejemplo  blueray extiende cd y por lo tanto podria acceder a los metodos de cd.

        - ¿Qué pasa con las ruedas y los frisbees? También son discos giratorios, pero no se utilizan para
el almacenamiento de datos. ¿Cómo entrarían en este modelo de clases?

        En el caso propuesto en la pregunta lo que seria optimo desde mi puntode vista seria tratarlos de forma independiente
        o en cuyo caso hariamos una nueva clase interfaz llamada 'Giratorio' por ejemplo e incluir el mmetodo girar y que incluya
        ambas clases, tanto CD, com Vinilo

        - Analiza ahora el ejercicio completo desde el punto de vista que plantean los principios SOLID, si
los conoces. ¿Se cumplen todos? Elabora un breve informe con tus razones.

        S: Principio de responsabilidad unica: Cada clase esta enfocada a un conjunto especifico de responsabilidades o por lo menos se ha intentado.
        O: Principio Abierto/Cerrado: Si que es posible añadir clases sin modificar las existentes.
        L: Principio de Sustitucion: En este caso si que se podria sustitur las clases sin ninguna consecuencia.
        I: Pirncipio de segregacion: La interfaz esta diseñada de forma que las clases que la implementan no tienen metodos que no necesitan.
        D: Princpio de Inversion: El codigo si que depende de abstracciones.
         */
    }
}