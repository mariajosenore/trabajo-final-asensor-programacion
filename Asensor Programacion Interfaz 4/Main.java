import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame frame = new JFrame("Simulador de Ascensor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600); // Ajustar tamaño para un diseño más grande
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null); // Centrar la ventana

        // Crear el sistema de control
        final Sistemacontrol sistemaControl = new Sistemacontrol();

        // Panel para los botones del ascensor
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10)); // Cuadrícula más grande
        panel.setBackground(Color.DARK_GRAY);

        // Colores para los botones
        Color colorBtn = new Color(0, 150, 255);
        Color colorHover = new Color(0, 100, 200);

        // Botones
        JButton btnSeleccionarPiso = crearBoton("Seleccionar Piso", colorBtn, colorHover);
        panel.add(btnSeleccionarPiso);

        JButton btnPresionarPiso = crearBoton("Presionar Piso", colorBtn, colorHover);
        panel.add(btnPresionarPiso);

        JButton btnVerIndicadores = crearBoton("Ver Indicadores", colorBtn, colorHover);
        panel.add(btnVerIndicadores);

        JButton btnActivarDesactivarIndicadores = crearBoton("Activar/Desactivar Indicadores", colorBtn, colorHover);
        panel.add(btnActivarDesactivarIndicadores);

        JButton btnCambiarDireccion = crearBoton("Cambiar Dirección", colorBtn, colorHover);
        panel.add(btnCambiarDireccion);

        JButton btnAbrirPuertas = crearBoton("Abrir Puertas", colorBtn, colorHover);
        panel.add(btnAbrirPuertas);

        JButton btnCerrarPuertas = crearBoton("Cerrar Puertas", colorBtn, colorHover);
        panel.add(btnCerrarPuertas);

        JButton btnSalir = crearBoton("Salir", colorBtn, colorHover);
        panel.add(btnSalir);
        JButton btnpiso1 = crearBoton("piso 1", colorBtn, colorHover);
        panel.add(btnpiso1);

        JButton btnpiso2 = crearBoton("piso 2", colorBtn, colorHover);
        panel.add(btnpiso2);

         
        JButton btn1 = crearBoton(" 1", colorBtn, colorHover);
        panel.add(btn1);

        JButton btn2 = crearBoton(" 2", colorBtn, colorHover);
        panel.add(btn2);


        JButton btnpiso3 = crearBoton("piso 3", colorBtn, colorHover);
        panel.add(btnpiso3);

        JButton btnpiso4= crearBoton("piso 4", colorBtn, colorHover);
        panel.add(btnpiso4);

        JButton btn3 = crearBoton(" 3", colorBtn, colorHover);
        panel.add(btn3);

        JButton btn4= crearBoton(" 4", colorBtn, colorHover);
        panel.add(btn4);

        JButton btnpiso5 = crearBoton("piso 5", colorBtn, colorHover);
        panel.add(btnpiso5);

        JButton btnpiso6 = crearBoton("piso 6", colorBtn, colorHover);
        panel.add(btnpiso6);
        
       
        JButton btn5 = crearBoton(" 5", colorBtn, colorHover);
        panel.add(btn5);

        JButton btn6 = crearBoton(" 6", colorBtn, colorHover);
        panel.add(btn6);
        


        // Etiqueta para mostrar información
        JTextArea textArea = new JTextArea(6, 30);
        textArea.setEditable(false);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.WHITE);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Configuración de los botones
        btnSeleccionarPiso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Ingresa el piso al que deseas mover el ascensor (0-6):");
                try {
                    int pisoAscensor = Integer.parseInt(input);
                    if (pisoAscensor >= 0 && pisoAscensor < 7) {
                        sistemaControl.seleccionarPisoAscensor(pisoAscensor);
                        textArea.setText("Piso seleccionado: " + pisoAscensor);
                    } else {
                        textArea.setText("Piso inválido.");
                    }
                } catch (NumberFormatException ex) {
                    textArea.setText("Por favor ingresa un número válido.");
                }
            }
        });

        btnPresionarPiso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Ingresa el número del piso al que deseas ir (0-6):");
                try {
                    int pisoPiso = Integer.parseInt(input);
                    if (pisoPiso >= 0 && pisoPiso < 7) {
                        sistemaControl.presionarBotonPiso(pisoPiso);
                        textArea.setText("Botón de piso presionado: " + pisoPiso);
                    } else {
                        textArea.setText("Piso inválido.");
                    }
                } catch (NumberFormatException ex) {
                    textArea.setText("Por favor ingresa un número válido.");
                }
            }
        });

        btnVerIndicadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String estado = sistemaControl.getIndicadoresEstado();
                textArea.setText("Estado de los indicadores: " + estado);
            }
        });

        btnActivarDesactivarIndicadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] opciones = {"Activar", "Desactivar"};
                int seleccion = JOptionPane.showOptionDialog(frame, "Elige una opción", "Indicadores",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
                if (seleccion == 0) {
                    sistemaControl.activarIndicadores();
                    textArea.setText("Indicadores Activados.");
                } else if (seleccion == 1) {
                    sistemaControl.desactivarIndicadores();
                    textArea.setText("Indicadores Desactivados.");
                }
            }
        });

        btnCambiarDireccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sistemaControl.cambiarDireccionAscensor();
                textArea.setText("Dirección del ascensor cambiada.");
            }
        });

        btnAbrirPuertas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sistemaControl.abrirPuertasAscensor();
                textArea.setText("Puertas abiertas.");
            }
        });

        btnCerrarPuertas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sistemaControl.cerrarPuertasAscensor();
                textArea.setText("Puertas cerradas.");
            }
        });

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Cerrar la aplicación
            }
        });

        // Agregar el panel de botones a la ventana
        frame.add(panel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    // Método para crear botones con colores y efectos de hover
    private static JButton crearBoton(String texto, Color colorNormal, Color colorHover) {
        JButton boton = new JButton(texto);
        boton.setBackground(colorNormal);
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Arial", Font.PLAIN, 16));
        boton.setFocusPainted(false);

        // Efecto hover
        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton.setBackground(colorHover);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton.setBackground(colorNormal);
            }
        });

        return boton;
    }
}

class Sistemacontrol {
    private boolean indicadoresActivados = false; // Estado de los indicadores

    public void seleccionarPisoAscensor(int piso) {
        // Lógica para seleccionar el piso
    }

    public void presionarBotonPiso(int piso) {
        // Lógica para presionar el botón de un piso
    }

    public void activarIndicadores() {
        indicadoresActivados = true;
    }

    public void desactivarIndicadores() {
        indicadoresActivados = false;
    }

    public void cambiarDireccionAscensor() {
        // Cambiar la dirección del ascensor
    }

    public void abrirPuertasAscensor() {
        // Abrir las puertas del ascensor
    }

    public void cerrarPuertasAscensor() {
        // Cerrar las puertas del ascensor
    }

    public String getIndicadoresEstado() {
        return indicadoresActivados ? "Activados" : "Desactivados";
    }
}
