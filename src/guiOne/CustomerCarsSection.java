package guiOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static guiOne.MainFrame.*;

public class CustomerCarsSection extends JPanel {
    JButton jButtonLocalCarSection, jButtonImportedCarSection, back;

    public CustomerCarsSection() throws HeadlessException {

        setVisible(true);
        setBackground(Color.BLUE);
        setSize(600, 600);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(Box.createRigidArea(new Dimension(0, 200)));

        jButtonLocalCarSection = new JButton("LOCAL CAR SECTION");
        jButtonLocalCarSection.setVisible(true);
        jButtonLocalCarSection.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonLocalCarSection.setMaximumSize(new Dimension(180, 40));
        jButtonLocalCarSection.setBackground(Color.BLACK);
        jButtonLocalCarSection.setFont(new Font("Monotype Sort", Font.BOLD, 12));
        jButtonLocalCarSection.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        add(jButtonLocalCarSection);
        jButtonLocalCarSection.setFocusable(false);
        jButtonLocalCarSection.setForeground(Color.WHITE);
        add(Box.createRigidArea(new Dimension(0, 12)));
        jButtonImportedCarSection = new JButton("IMPORTED CAR SECTION");
        jButtonImportedCarSection.setVisible(true);
        add(jButtonImportedCarSection);
        jButtonImportedCarSection.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonImportedCarSection.setMaximumSize(new Dimension(180, 40));
        jButtonImportedCarSection.setBackground(Color.BLACK);
        jButtonImportedCarSection.setFont(new Font("Monotype Sort", Font.BOLD, 12));
        jButtonImportedCarSection.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        jButtonImportedCarSection.setFocusable(false);
        jButtonImportedCarSection.setForeground(Color.WHITE);
        add(Box.createRigidArea(new Dimension(0, 12)));


        back = new JButton("BACK");
        back.setAlignmentX(Component.CENTER_ALIGNMENT);
        back.setMaximumSize(new Dimension(180, 40));
        back.setBackground(Color.BLACK);
        back.setFont(new Font("Monotype Sort", Font.BOLD, 12));
        back.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        back.setFocusable(false);
        back.add(Box.createRigidArea(new Dimension(0, 12)));
        back.setVisible(true);
        back.setForeground(Color.WHITE);
        add(back);


        back.addActionListener(new ActionListener() {
                                   @Override
                                   public void actionPerformed(ActionEvent e) {
                                       setVisible(false);
                                       mainJPanel.setVisible(true);


                                   }
                               }

        );

        jButtonLocalCarSection.addActionListener(e -> {
            setVisible(false);
            customerLocalCarFunction.setVisible(true);
        });

        jButtonImportedCarSection.addActionListener(e -> {
            setVisible(false);
            customerImportedCarFunctions.setVisible(true);

        });
    }


}

