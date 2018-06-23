package gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame
{
    private  JPanel mainPanel;
    public static void main(String[] args)
    {
        new MainFrame();
    }

    public MainFrame()
    {
        setTitle("Conway's Game of Life");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(new Dimension(1000, 600));

        setMainPanel();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void  setMainPanel()
    {
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.LIGHT_GRAY);
        this.setContentPane(mainPanel);
    }

}
