package guiOne;

import javax.swing.*;
import java.awt.*;

import static guiOne.MainFrame.*;
import static guiOne.MainFrame.managerLocalCarsJPanel;

public class ManagerLocalOldCarFunction extends JPanel {
    JButton jButtonLocalNewUpdate, jButtonLocalNewRemove, jButtonLocalNewAdd, jButtonBack;


    ManagerLocalOldCarFunction() {
        this.setVisible(true);
        this.setBackground(Color.BLUE);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setSize(600, 600);


        add(Box.createRigidArea(new Dimension(0, 200)));
        jButtonLocalNewAdd = new JButton("ADD CAR");
        add(jButtonLocalNewAdd);
        jButtonLocalNewAdd.setVisible(true);
        jButtonLocalNewAdd.setForeground(Color.WHITE);
        jButtonLocalNewAdd.setBackground(Color.BLACK);
        jButtonLocalNewAdd.setVisible(true);
        jButtonLocalNewAdd.setMinimumSize(new Dimension(180, 40));
        jButtonLocalNewAdd.setMaximumSize(new Dimension(180, 40));
        jButtonLocalNewAdd.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0, 10)));

        jButtonLocalNewUpdate = new JButton("UPDATE CAR");
        add(jButtonLocalNewUpdate);
        jButtonLocalNewUpdate.setVisible(true);
        jButtonLocalNewUpdate.setForeground(Color.WHITE);
        jButtonLocalNewUpdate.setBackground(Color.BLACK);
        jButtonLocalNewUpdate.setVisible(true);
        jButtonLocalNewUpdate.setMinimumSize(new Dimension(180, 40));
        jButtonLocalNewUpdate.setMaximumSize(new Dimension(180, 40));
        jButtonLocalNewUpdate.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0, 10)));

        jButtonLocalNewRemove = new JButton("REMOVE CAR");
        add(jButtonLocalNewRemove);
        jButtonLocalNewRemove.setVisible(true);
        jButtonLocalNewRemove.setForeground(Color.WHITE);
        jButtonLocalNewRemove.setBackground(Color.BLACK);
        jButtonLocalNewRemove.setVisible(true);
        jButtonLocalNewRemove.setMinimumSize(new Dimension(180, 40));
        jButtonLocalNewRemove.setMaximumSize(new Dimension(180, 40));
        jButtonLocalNewRemove.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0, 10)));

        jButtonBack = new JButton("BACK");
        add(jButtonBack);
        jButtonBack.setVisible(true);
        jButtonBack.setForeground(Color.WHITE);
        jButtonBack.setBackground(Color.BLACK);
        jButtonBack.setVisible(true);
        jButtonBack.setMinimumSize(new Dimension(180, 40));
        jButtonBack.setMaximumSize(new Dimension(180, 40));
        jButtonBack.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0, 10)));

        jButtonLocalNewAdd.addActionListener(e -> {
            setVisible(false);
            managerLocalOldAddCar.setVisible(true);

        });
        jButtonLocalNewUpdate.addActionListener(e -> {
            setVisible(false);
            managerLocalOldUpdateCar.setVisible(true);

        });
        jButtonLocalNewRemove.addActionListener(e -> {
            setVisible(false);
            managerLocalOldRemoveCar.setVisible(true);

        });
        jButtonBack.addActionListener(e -> {
            setVisible(false);
            managerLocalCarsJPanel.setVisible(true);


        });


    }


}
