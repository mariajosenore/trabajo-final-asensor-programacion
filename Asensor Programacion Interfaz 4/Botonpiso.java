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

     // Métodos para activar y desactivar los indicadores
     public void activarIndicadores() {
        indicadorLuminoso = true;
        indicadorSonoro = true;
        System.out.println("Indicadores del Piso " + getPiso() + " activados.");
    }

    public void desactivarIndicadores() {
        indicadorLuminoso = false;
        indicadorSonoro = false;
        System.out.println("Indicadores del Piso " + getPiso() + " desactivados.");
    }

    // Métodos para obtener el estado de los indicadores
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

    // public void desactivarndicadores() {
        
    //     throw new UnsupportedOperationException("Unimplemented method 'desactivarndicadores'");
    // }

    // public void activarindicadores() {
        
    //     throw new UnsupportedOperationException("Unimplemented method 'activarindicadores'");
    // }
    

    // public String getPiso() {
       
    //     throw new UnsupportedOperationException("Unimplemented method 'getPiso'");

        
}
