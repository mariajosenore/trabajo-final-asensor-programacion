import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Sistemacontrol sistemaControl = new Sistemacontrol();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nAscensor  ");
            System.out.println("1. Seleccionar piso desde el ascensor");
            System.out.println("2. Presionar botón de piso");
            System.out.println("3. Ver estado de los indicadores");
            System.out.println("4. Activar/Desactivar Indicadores Luminosos y Sonoros");
            System.out.println("5. Cambiar dirección del ascensor");
            System.out.println("6. Abrir puertas del ascensor");
            System.out.println("7. Cerrar puertas del ascensor");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Seleccionar piso desde el ascensor
                    System.out.print("Ingresa el piso al que deseas mover el ascensor (0-9): ");
                    int pisoAscensor = scanner.nextInt();
                    if (pisoAscensor >= 0 && pisoAscensor < 10) {
                        sistemaControl.seleccionarPisoAscensor(pisoAscensor);
                    } else {
                        System.out.println("Piso inválido. Elige un número entre 0 y 9.");
                    }
                    break;

                case 2:
                    // Presionar botón de piso
                    System.out.print("Ingresa el número del piso al que deseas ir (0-9): ");
                    int pisoPiso = scanner.nextInt();
                    if (pisoPiso >= 0 && pisoPiso < 10) {
                        sistemaControl.presionarBotonPiso(pisoPiso);
                    } else {
                        System.out.println("Piso inválido. Elige un número entre 0 y 9.");
                    }
                    break;

                case 3:
                    // Ver estado de los indicadores
                    sistemaControl.verEstadoIndicadores();
                    break;

                case 4:
                    // Activar/Desactivar Indicadores Luminosos y Sonoros
                    System.out.println("Elige la opción:");
                    System.out.println("1. Activar Indicadores");
                    System.out.println("2. Desactivar Indicadores");
                    int opcionIndicadores = scanner.nextInt();
                    if (opcionIndicadores == 1) {
                        sistemaControl.activarIndicadores();
                    } else if (opcionIndicadores == 2) {
                        sistemaControl.desactivarIndicadores();
                    } else {
                        System.out.println("Opción inválida.");
                    }
                   
                    break;

                case 5:
                    // Cambiar dirección del ascensor
                    sistemaControl.cambiarDireccionAscensor();
                    break;

                case 6:
                    // Abrir puertas del ascensor
                    sistemaControl.abrirPuertasAscensor();
                    break;

                case 7:
                    // Cerrar puertas del ascensor
                    sistemaControl.cerrarPuertasAscensor();
                    break;

                case 8:
                    // Salir del programa
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }

        scanner.close();
    }
}
