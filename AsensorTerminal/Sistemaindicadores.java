public class Sistemaindicadores {

    public void activarIndicadorBotonAscensor(Ascensor ascensor) {
        if (ascensor.isIndicadorLuminoso() && ascensor.isIndicadorSonoro()) {
            System.out.println("Indicadores del ascensor activados.");
        }
    }

    public void activarIndicadorBotonPiso(Botonpiso botonPiso) {
        if (botonPiso.isIndicadorLuminoso() && botonPiso.isIndicadorSonoro()) {
            System.out.println("Indicadores del piso " + botonPiso.getPiso() + " activados.");
        }
    }
}
