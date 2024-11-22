import java.util.ArrayList;
import java.util.List;

public class Sistemaalerta {
    private List<String> alertas; // Lista para registrar alertas de fallas en el sistema
    private int totalErrores; // Contador de errores registrados
    private int tiempoFuncionamiento; // Tiempo acumulado de funcionamiento del ascensor en segundos

    public Sistemaalerta () {
        this.alertas = new ArrayList<>();
        this.totalErrores = 0;
        this.tiempoFuncionamiento = 0;
    }

    // Método para registrar una alerta de falla
    public void registrarAlerta(String mensaje) {
        alertas.add(mensaje);
        totalErrores++;
        System.out.println("Alerta registrada: " + mensaje);
    }

    // Método para registrar tiempo de funcionamiento
    public void registrarTiempoFuncionamiento(int tiempo) {
        this.tiempoFuncionamiento += tiempo;
    }

    // Método para mostrar el historial de alertas
    public void mostrarAlertas() {
        if (alertas.isEmpty()) {
            System.out.println("No se han registrado alertas.");
        } else {
            System.out.println("Historial de Alertas:");
            for (String alerta : alertas) {
                System.out.println("- " + alerta);
            }
        }
    }

    // Método para obtener el total de errores registrados
    public int getTotalErrores() {
        return totalErrores;
    }

    // Método para obtener el tiempo total de funcionamiento
    public int getTiempoFuncionamiento() {
        return tiempoFuncionamiento;
    }

    public void registrarError(String string) {
    
        throw new UnsupportedOperationException("Unimplemented method 'registrarError'");
    }
}
