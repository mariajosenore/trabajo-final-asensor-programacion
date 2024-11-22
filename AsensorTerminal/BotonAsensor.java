class BotonAscensor {
    private int pisoSeleccionado;
    private boolean indicadorLuminoso;
    private boolean indicadorSonoro;

    public BotonAscensor() {
        this.pisoSeleccionado = -1;  // Inicialmente no hay piso seleccionado
        this.indicadorLuminoso = false;
        this.indicadorSonoro = false;
        }
    
        public int getPisoSeleccionado() {
            return pisoSeleccionado;
        }
    
    public void seleccionarPiso(int piso) {
        if (piso >= 0 && piso < 10) {
            this.pisoSeleccionado = piso;
            System.out.println("Piso seleccionado desde el ascensor: " + piso);
            activarIndicadores();
        } else {
            System.out.println("Piso inválido. Elige un número entre 0 y 9.");
        }
    }

    private void activarIndicadores() {
        indicadorLuminoso = true;
        indicadorSonoro = true;
        System.out.println("Indicadores luminoso y sonoro activados para el ascensor.");
    }

    public boolean isIndicadorLuminoso() {
        return indicadorLuminoso;
    }

    public boolean isIndicadorSonoro() {
        return indicadorSonoro;
    }
}
