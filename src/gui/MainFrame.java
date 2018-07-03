package gui;

import gui.components.DrawingPanel;

import javax.swing.*;
import java.util.Timer;
import java.awt.*;

public class MainFrame extends JFrame {

    private JPanel mainPanel;
    private DrawingPanel drawingPanel;

    private Timer timer;
    private int timerSpeed;
    private int generation;

    public static void main(String[] args) {
        new MainFrame();
    }

    public MainFrame() {
        setTitle("Conway's Life");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(new Dimension(1000, 600));

        this.timerSpeed = 250;
        this.generation = 0;

        setMainPanel();
        setDrawingPanel();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void setMainPanel() {
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.LIGHT_GRAY);
        this.setContentPane(mainPanel);
    }

    private void setDrawingPanel() {
        drawingPanel = new DrawingPanel(660, 60);
        mainPanel.add(drawingPanel);
    }

}