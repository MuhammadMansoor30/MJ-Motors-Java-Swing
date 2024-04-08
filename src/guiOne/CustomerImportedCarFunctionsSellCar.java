package guiOne;

import javax.swing.*;
import java.awt.*;

import static guiOne.MainFrame.*;

public class CustomerImportedCarFunctionsSellCar extends JPanel {
    JButton jButtonBack, jButtonPlaceCar, jButtonSearchSellToUs;

    public CustomerImportedCarFunctionsSellCar() {
        setVisible(true);
        setBackground(Color.BLUE);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(600, 600);
        add(Box.createRigidArea(new Dimension(0, 200)));

        jButtonPlaceCar = new JButton("Place Car For Sell");
        add(jButtonPlaceCar);

        jButtonPlaceCar.setVisible(true);
        jButtonPlaceCar.setForeground(Color.WHITE);
        jButtonPlaceCar.setBackground(Color.BLACK);
        jButtonPlaceCar.setVisible(true);
        jButtonPlaceCar.setMinimumSize(new Dimension(180, 40));
        jButtonPlaceCar.setMaximumSize(new Dimension(180, 40));
        jButtonPlaceCar.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0, 10)));

        jButtonSearchSellToUs = new JButton("Sell Vehicle To Us");
        add(jButtonSearchSellToUs);

        jButtonSearchSellToUs.setVisible(true);
        jButtonSearchSellToUs.setForeground(Color.WHITE);
        jButtonSearchSellToUs.setBackground(Color.BLACK);
        jButtonSearchSellToUs.setVisible(true);
        jButtonSearchSellToUs.setMinimumSize(new Dimension(180, 40));
        jButtonSearchSellToUs.setMaximumSize(new Dimension(180, 40));
        jButtonSearchSellToUs.setAlignmentX(Component.CENTER_ALIGNMENT);

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

        add(Box.createRigidArea(new Dimension(0, 10)));

        jButtonBack.addActionListener(e -> {
            setVisible(false);
            customerImportedCarFunctions.setVisible(true);
        });

        jButtonSearchSellToUs.addActionListener(e -> {
            setVisible(false);
            customerImportedSellCarToUs.setVisible(true);
        });

        jButtonPlaceCar.addActionListener(e -> {
            setVisible(false);
            customerImportedPlaceCarSell.setVisible(true);
        });
    }

}
