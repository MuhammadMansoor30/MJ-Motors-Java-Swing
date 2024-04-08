package guiOne;

import javax.swing.*;
import java.awt.*;

import static guiOne.MainFrame.*;

public class ManagerLocalCarsJPanel extends JPanel {

    JButton jButtonNewLocalCar, jButtonOldLocalCar, jButtonBack;

    public ManagerLocalCarsJPanel() {
        setVisible(true);
        setSize(600, 600);
        setBackground(Color.BLUE);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(Box.createRigidArea(new Dimension(0, 200)));

        jButtonNewLocalCar = new JButton("New Local Cars");
        jButtonNewLocalCar.setVisible(true);
        jButtonNewLocalCar.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonNewLocalCar.setMaximumSize(new Dimension(180, 40));
        jButtonNewLocalCar.setMinimumSize(new Dimension(180, 40));
        jButtonNewLocalCar.setBackground(Color.BLACK);
        jButtonNewLocalCar.setFont(new Font("Ariel", Font.BOLD, 12));
        jButtonNewLocalCar.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        add(jButtonNewLocalCar);
        jButtonNewLocalCar.setFocusable(false);
        jButtonNewLocalCar.setForeground(Color.WHITE);
        add(Box.createRigidArea(new Dimension(0, 12)));

        jButtonOldLocalCar = new JButton("Old Local Cars");
        jButtonOldLocalCar.setVisible(true);
        jButtonOldLocalCar.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonOldLocalCar.setMaximumSize(new Dimension(180, 40));
        jButtonOldLocalCar.setMinimumSize(new Dimension(180, 40));
        jButtonOldLocalCar.setBackground(Color.BLACK);
        jButtonOldLocalCar.setFont(new Font("Ariel", Font.BOLD, 12));
        jButtonOldLocalCar.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        add(jButtonOldLocalCar);
        jButtonOldLocalCar.setFocusable(false);
        jButtonOldLocalCar.setForeground(Color.WHITE);
        add(Box.createRigidArea(new Dimension(0, 12)));

        jButtonBack = new JButton("Back");
        jButtonBack.setVisible(true);
        jButtonBack.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonBack.setMaximumSize(new Dimension(180, 40));
        jButtonBack.setMinimumSize(new Dimension(180, 40));
        jButtonBack.setBackground(Color.BLACK);
        jButtonBack.setFont(new Font("Ariel", Font.BOLD, 12));
        jButtonBack.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        add(jButtonBack);
        jButtonBack.setFocusable(false);
        jButtonBack.setForeground(Color.WHITE);


        jButtonBack.addActionListener(e -> {
            setVisible(false);
            managerCarsSection.setVisible(true);
        });

        jButtonOldLocalCar.addActionListener(e -> {
            setVisible(false);
            managerLocalOldCarFunction.setVisible(true);

        });

        jButtonNewLocalCar.addActionListener(e -> {
            setVisible(false);
            managerLocalNewCarFunction.setVisible(true);

        });


    }
}
