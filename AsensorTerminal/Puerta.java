public class Puerta {
    private boolean abierta;

    public Puerta() {
        this.abierta = false;
    }

    // Método para abrir la puerta
    public void abrir() {
        if (!abierta) {
            abierta = true;
            System.out.println("La puerta está abierta.");
        }
    }

    // Método para cerrar la puerta
    public void cerrar() {
        if (abierta) {
            abierta = false;
            System.out.println("La puerta está cerrada.");
        }
    }

    public boolean isAbierta() {
        return abierta;
    }
}
