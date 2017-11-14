package better.ui;

import javax.swing.*;
import java.awt.*;

public class MenuWindow extends JFrame
{
    public MenuWindow() {
        super();
        buildDashboard();
    }

    private void buildDashboard() {
        setTitle("Menu");
        setSize(800, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPane());
    }

    private JPanel buildContentPane() {

        JPanel welcomeMessage = new JPanel();
        welcomeMessage.setLayout(new FlowLayout());
        welcomeMessage.setBackground(Color.white);

        JLabel label = new JLabel("Bienvenu dans mon application");
        welcomeMessage.add(label);


        JPanel buttonMenuPanel = new JPanel();
        buttonMenuPanel.setLayout(new GridLayout(1, 2));
        buttonMenuPanel.setBackground(Color.white);

        JButton buttonAddEmployee = new JButton("Add employee");
        buttonAddEmployee.addActionListener(e -> System.out.println("Added"));

        JButton buttonDisplayEmployee = new JButton("Display List of employees");

        buttonMenuPanel.add(buttonAddEmployee);
        buttonMenuPanel.add(buttonDisplayEmployee);

        JPanel menuGlobal = new JPanel();
        menuGlobal.setLayout(new BoxLayout(menuGlobal, BoxLayout.PAGE_AXIS));
        menuGlobal.setBackground(Color.white);
        menuGlobal.add(welcomeMessage);
        menuGlobal.add(buttonMenuPanel);
        //pack();
        return menuGlobal;
    }
}
