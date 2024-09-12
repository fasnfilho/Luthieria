package interfaceGrafica;

import modelos.*;
import repositorios.RepositorioOrdensFile;
import repositorios.IRepositorioOrdens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainGUI extends JFrame {
    private IRepositorioOrdens repositorio;
    private JTextArea textArea;

    public MainGUI() {
        repositorio = new RepositorioOrdensFile();
        setTitle("Luthieria");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        add(panel, BorderLayout.SOUTH);

        JButton adicionarButton = new JButton("Adicionar Ordem");
        JButton listarButton = new JButton("Listar Ordens");
        JButton gerarNotificacaoButton = new JButton("Gerar Notificação");

        panel.add(adicionarButton);
        panel.add(listarButton);
        panel.add(gerarNotificacaoButton);

        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementar a lógica para adicionar uma nova ordem
            }
        });

        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarOrdens();
            }
        });

        gerarNotificacaoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gerarNotificacao();
            }
        });
    }

    private void listarOrdens() {
        List<OrdemServico> ordens = repositorio.listarOrdens();
        textArea.setText("");
        for (OrdemServico ordem : ordens) {
            textArea.append(ordem.toString() + "\n");
        }
    }

    private void gerarNotificacao() {
        // Implementar a lógica para gerar uma notificação
    }
}
