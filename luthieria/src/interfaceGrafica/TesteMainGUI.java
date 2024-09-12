package interfaceGrafica;

import javax.swing.SwingUtilities;

public class TesteMainGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Cria e exibe a interface gráfica
            MainGUI gui = new MainGUI();
            gui.setVisible(true);
        });
    }
}
