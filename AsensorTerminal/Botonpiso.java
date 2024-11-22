public class Botonpiso {
    private int numeroPiso;
    private boolean indicadorLuminoso;
    private boolean indicadorSonoro;

    // Constructor para inicializar el botón con un número de piso
    public Botonpiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
        this.indicadorLuminoso = false;
        this.indicadorSonoro = false;
    }

    // Método para presionar el botón
    public void presionar() {
        this.indicadorLuminoso = true;
        this.indicadorSonoro = true;
        System.out.println("Botón de piso " + numeroPiso + " presionado.");
    }

    public boolean isIndicadorLuminoso() {
        return indicadorLuminoso;
    }

    public boolean isIndicadorSonoro() {
        return indicadorSonoro;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public String getPiso() {
        return String.valueOf(numeroPiso); // Retorna el número del piso como un String
    }

    public void activarIndicadores() {
        
        throw new UnsupportedOperationException("Unimplemented method 'activarIndicadores'");
    }

    public void desactivarIndicadores() {
      
        throw new UnsupportedOperationException("Unimplemented method 'desactivarIndicadores'");
    }
    

        
}
