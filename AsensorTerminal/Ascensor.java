import java.util.ArrayList;
import java.util.List;

public class Ascensor {

    private int pisoActual;
    private boolean direccionAscendente; // true: subiendo, false: bajando
    private boolean puertasAbiertas;
    private boolean indicadorLuminoso;
    private boolean indicadorSonoro;
    private boolean botonFallo; // Simula el botón de fallo
    private boolean direccionFallo; // Simula un fallo en la dirección del ascensor

    private boolean sensorPuertasObstaculo; // Simula un sensor de obstáculos en las puertas
    private boolean mantenerPuertasAbiertas; // Controla el botón de "mantener puertas abiertas"

    private List<Integer> solicitudesAscendentes; // Lista para las solicitudes ascendentes
    private List<Integer> solicitudesDescendentes; // Lista para las solicitudes descendentes

    // Constructor para inicializar el ascensor en el piso 0
    public Ascensor() {
        this.pisoActual = 0;  // El ascensor comienza en el piso 0
        this.direccionAscendente = true; // Asumimos que inicialmente está subiendo
        this.puertasAbiertas = false; // Las puertas comienzan cerradas
        this.indicadorLuminoso = false;
        this.indicadorSonoro = false;
        this.sensorPuertasObstaculo = false; // No hay obstáculos al inicio
        this.mantenerPuertasAbiertas = false; // Las puertas no se mantienen abiertas
        this.solicitudesAscendentes = new ArrayList<>(); // Inicializamos las listas
        this.solicitudesDescendentes = new ArrayList<>(); // Inicializamos las listas
        this.botonFallo = false; // El botón de fallo no está presionado al inicio
        this.direccionFallo = false; // No hay fallo en la dirección al inicio
    }

    // Método para mover el ascensor a un piso determinado
    public void mover(int pisoDestino) {
        if (botonFallo) {
            System.out.println("¡Fallo detectado! El ascensor no puede moverse.");
            return; // Si el botón de fallo está presionado, no movemos el ascensor
        }

        if (direccionFallo) {
            // Si hay un fallo en la dirección, movemos el ascensor en la dirección opuesta
            direccionAscendente = !direccionAscendente;
            System.out.println("¡Fallo en la dirección! El ascensor se mueve en la dirección opuesta.");
        }

        if (pisoDestino == pisoActual) {
            System.out.println("El ascensor ya está en el piso " + pisoActual);
            return;
        }

        // Verificar la dirección y mover el ascensor
        if (pisoDestino > pisoActual) {
            direccionAscendente = true;
            System.out.println("El ascensor sube al piso " + pisoDestino);
        } else {
            direccionAscendente = false;
            System.out.println("El ascensor baja al piso " + pisoDestino);
        }

        // Actualizar el piso actual
        pisoActual = pisoDestino;
        activarIndicadores();
        gestionarPuertas(); // Gestionar apertura/cierre de puertas al llegar al piso solicitado
    }

    // Método para gestionar la apertura o cierre automático de las puertas
    private void gestionarPuertas() {
        if (mantenerPuertasAbiertas) {
            // Si el botón de mantener puertas abiertas está activado, no cerramos las puertas
            System.out.println("Las puertas permanecen abiertas.");
        } else {
            // Si no hay obstáculos, abrimos las puertas
            if (!sensorPuertasObstaculo) {
                abrirPuertas();
            } else {
                System.out.println("¡Advertencia! Hay un obstáculo, las puertas no se pueden cerrar.");
            }
        }
    }

    // Abrir las puertas del ascensor
    public void abrirPuertas() {
        puertasAbiertas = true;
        System.out.println("Las puertas del ascensor están abiertas.");
    }

    // Cerrar las puertas del ascensor
    public void cerrarPuertas() {
        puertasAbiertas = false;
        System.out.println("Las puertas del ascensor están cerradas.");
    }

    // Activar los indicadores luminosos y sonoros
    void activarIndicadores() {
        indicadorLuminoso = true;
        indicadorSonoro = true;
        System.out.println("Indicadores del ascensor activados (luminoso y sonoro).");
    }

    // Función para activar el sensor de puertas (simulación de un obstáculo)
    public void activarSensorObstaculo() {
        sensorPuertasObstaculo = true;
        System.out.println("Sensor de obstáculos activado: No se pueden cerrar las puertas.");
    }

    // Función para desactivar el sensor de puertas (cuando ya no hay obstáculo)
    public void desactivarSensorObstaculo() {
        sensorPuertasObstaculo = false;
        System.out.println("Sensor de obstáculos desactivado: Las puertas pueden cerrarse.");
    }

    // Función para activar el botón de "mantener puertas abiertas"
    public void mantenerPuertasAbiertas() {
        mantenerPuertasAbiertas = true;
        System.out.println("Las puertas se mantendrán abiertas.");
    }

    // Función para desactivar el botón de "mantener puertas abiertas"
    public void desactivarMantenerPuertasAbiertas() {
        mantenerPuertasAbiertas = false;
        System.out.println("Las puertas ya no se mantendrán abiertas.");
    }

    // Función para activar el botón de fallo
    public void activarBotonFallo() {
        botonFallo = true;
        System.out.println("¡Botón de fallo activado! El ascensor no puede moverse.");
    }

    // Función para desactivar el botón de fallo
    public void desactivarBotonFallo() {
        botonFallo = false;
        System.out.println("¡Botón de fallo desactivado! El ascensor puede moverse.");
    }

    // Función para activar el fallo en la dirección
    public void activarFalloDireccion() {
        direccionFallo = true;
        System.out.println("¡Fallo en la dirección activado! El ascensor se moverá en la dirección opuesta.");
    }

    // Función para desactivar el fallo en la dirección
    public void desactivarFalloDireccion() {
        direccionFallo = false;
        System.out.println("¡Fallo en la dirección desactivado! El ascensor se moverá normalmente.");
    }

    // Getters para los indicadores
    public boolean isIndicadorLuminoso() {
        return indicadorLuminoso;
    }

    public boolean isIndicadorSonoro() {
        return indicadorSonoro;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public boolean isPuertasAbiertas() {
        return puertasAbiertas;
    }

    public boolean isDireccionAscendente() {
        return direccionAscendente;
    }

    // Métodos para obtener las listas de solicitudes
    public List<Integer> getSolicitudesAscendentes() {
        return solicitudesAscendentes;
    }

    public List<Integer> getSolicitudesDescendentes() {
        return solicitudesDescendentes;
    }

    // Métodos para agregar solicitudes
    public void agregarSolicitudAscendente(int piso) {
        solicitudesAscendentes.add(piso); // Agregar a la lista de solicitudes ascendentes
    }

    public void agregarSolicitudDescendente(int piso) {
        solicitudesDescendentes.add(piso); // Agregar a la lista de solicitudes descendentes
    }

    public void setDireccionAscendente(boolean b) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setDireccionAscendente'");
    }
}
