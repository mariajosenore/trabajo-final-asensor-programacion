public class Sistemacontrol {
    private Ascensor ascensor;
    private Botonpiso[] botonesPiso;
    private Sistemaindicadores sistemaIndicadores;

    public Sistemacontrol() {
        this.ascensor = new Ascensor();
        this.botonesPiso = new Botonpiso[10];  // 10 pisos
        for (int i = 0; i < botonesPiso.length; i++) {
            botonesPiso[i] = new Botonpiso(i);
        }
        this.sistemaIndicadores = new Sistemaindicadores();
    }

    // Método para seleccionar el piso desde el ascensor
    public void seleccionarPisoAscensor(int pisoSeleccionado) {
        if (pisoSeleccionado >= 0 && pisoSeleccionado < 10) {
            ascensor.mover(pisoSeleccionado);
            sistemaIndicadores.activarIndicadorBotonAscensor(ascensor);
        } else {
            System.out.println("Piso inválido. Debe estar entre 0 y 9.");
        }
    }

    // Método para presionar un botón de piso
    public void presionarBotonPiso(int pisoSeleccionado) {
        if (pisoSeleccionado >= 0 && pisoSeleccionado < 10) {
            botonesPiso[pisoSeleccionado].presionar();
            sistemaIndicadores.activarIndicadorBotonPiso(botonesPiso[pisoSeleccionado]);
        } else {
            System.out.println("Piso inválido. Debe estar entre 0 y 9.");
        }
    }

    // Ver el estado de los indicadores
    public void verEstadoIndicadores() {
        System.out.println("\nEstado de los indicadores:");
        for (int i = 0; i < botonesPiso.length; i++) {
            System.out.println("Piso " + i + ": Indicador Luminoso: " + botonesPiso[i].isIndicadorLuminoso() +
                    ", Indicador Sonoro: " + botonesPiso[i].isIndicadorSonoro());
        }
        System.out.println("Ascensor: Indicador Luminoso: " + ascensor.isIndicadorLuminoso() +
                ", Indicador Sonoro: " + ascensor.isIndicadorSonoro());
    }

    // Método para cambiar la dirección del ascensor
    public void cambiarDireccionAscensor() {
        // Verificar si hay solicitudes en la dirección actual
        if (ascensor.getSolicitudesAscendentes().isEmpty() && !ascensor.getSolicitudesDescendentes().isEmpty()) {
            // Cambiar la dirección del ascensor a descendente si no hay solicitudes ascendentes
            ascensor.setDireccionAscendente(false);
            System.out.println("El ascensor ahora va hacia abajo.");
        } else if (ascensor.getSolicitudesDescendentes().isEmpty() && !ascensor.getSolicitudesAscendentes().isEmpty()) {
            // Cambiar la dirección del ascensor a ascendente si no hay solicitudes descendentes
            ascensor.setDireccionAscendente(true);
            System.out.println("El ascensor ahora va hacia arriba.");
        } else {
            System.out.println("El ascensor sigue su dirección actual.");
        }
    }

    
    // Método para abrir puertas del ascensor
    public void abrirPuertasAscensor() {
        System.out.println("Las puertas del ascensor se han abierto.");
    }

    // Método para cerrar puertas del ascensor
    public void cerrarPuertasAscensor() {
        System.out.println("Las puertas del ascensor se han cerrado.");
    }

    public void activarIndicadores() {
        // Método aún no implementado.
        System.out.println("Indicadores Activados.");
    }
    
    public void desactivarIndicadores() {
        // Método aún no implementado.
        System.out.println("Indicadores Desactivados.");
    }
    
            }
