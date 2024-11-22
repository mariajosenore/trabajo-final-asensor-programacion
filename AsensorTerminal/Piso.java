public class Piso<T> {
    private int numero;
    private T botonPiso;

    public Piso(int numero, T botonPiso) {
        this.numero = numero;
        this.botonPiso = botonPiso;
    }

    public int getNumero() {
        return numero;
    }

    public T getBotonPiso() {
        return botonPiso;
    }
}
