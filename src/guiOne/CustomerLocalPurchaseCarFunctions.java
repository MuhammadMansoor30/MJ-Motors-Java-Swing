package guiOne;

import javax.swing.*;
import java.awt.*;

import static guiOne.MainFrame.*;

public class CustomerLocalPurchaseCarFunctions extends JPanel {
    JButton jButtonCheckNewCars, jButtonCheckOldCars, jButtonBack;

    public CustomerLocalPurchaseCarFunctions() {
        setVisible(true);
        setBackground(Color.BLUE);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(600, 600);
        add(Box.createRigidArea(new Dimension(0, 200)));

        jButtonCheckNewCars = new JButton("CHECKOUT NEW CARS");
        add(jButtonCheckNewCars);
        jButtonCheckNewCars.setVisible(true);
        jButtonCheckNewCars.setForeground(Color.WHITE);
        jButtonCheckNewCars.setBackground(Color.BLACK);
        jButtonCheckNewCars.setVisible(true);
        jButtonCheckNewCars.setMinimumSize(new Dimension(180, 40));
        jButtonCheckNewCars.setMaximumSize(new Dimension(180, 40));
        jButtonCheckNewCars.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0, 10)));

        jButtonCheckOldCars = new JButton("CHECKOUT OLD CARS");
        add(jButtonCheckOldCars);
        jButtonCheckOldCars.setVisible(true);
        jButtonCheckOldCars.setForeground(Color.WHITE);
        jButtonCheckOldCars.setBackground(Color.BLACK);
        jButtonCheckOldCars.setVisible(true);
        jButtonCheckOldCars.setMinimumSize(new Dimension(180, 40));
        jButtonCheckOldCars.setMaximumSize(new Dimension(180, 40));
        jButtonCheckOldCars.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0, 10)));

        jButtonBack = new JButton("Back");
        add(jButtonBack);
        jButtonBack.setVisible(true);
        jButtonBack.setForeground(Color.WHITE);
        jButtonBack.setBackground(Color.BLACK);
        jButtonBack.setVisible(true);
        jButtonBack.setMinimumSize(new Dimension(180, 40));
        jButtonBack.setMaximumSize(new Dimension(180, 40));
        jButtonBack.setAlignmentX(Component.CENTER_ALIGNMENT);


        jButtonBack.addActionListener(e -> {
            setVisible(false);
            customerLocalCarFunction.setVisible(true);
        });
        jButtonCheckNewCars.addActionListener(e -> {
            setVisible(false);
            customerLocalNewCarPurchase.setVisible(true);


        });
        jButtonCheckOldCars.addActionListener(e -> {
            setVisible(false);
            customerLocalOldCarPurchase.setVisible(true);
        });

    }
}
