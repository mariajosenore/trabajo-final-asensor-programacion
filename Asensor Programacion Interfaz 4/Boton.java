public abstract class Boton {
    protected int piso; // Piso asociado al botón
    protected boolean indicadorActivo; // Indicador visual o sonoro del botón

    public Boton(int piso) {
        this.piso = piso;
        this.indicadorActivo = false; // El indicador está apagado por defecto
    }

    // Método abstracto para presionar el botón
    public abstract void presionar();

    // Método para activar el indicador
    public void activarIndicador() {
        this.indicadorActivo = true;
        System.out.println("Indicador activado en el botón del piso " + piso);
    }

    // Método para desactivar el indicador
    public void desactivarIndicador() {
        this.indicadorActivo = false;
        System.out.println("Indicador desactivado en el botón del piso " + piso);
    }

    // Método para obtener el estado del indicador
    public boolean isIndicadorActivo() {
        return indicadorActivo;
    }
}
