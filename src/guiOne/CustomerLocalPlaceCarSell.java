package guiOne;


import org.djbros.LocalCar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static guiOne.MainFrame.customerLocalCarsFunctionsSellCar;

public class CustomerLocalPlaceCarSell extends JPanel {

    JTextField jTextFieldAddCar, jTextFieldCarPrice;
    JSpinner jSpinnerCarType, jSpinnerCarModel, jSpinnerCarCondition;
    JButton jButtonBack, jButtonSell;


    CustomerLocalPlaceCarSell() {
        setVisible(true);
        setBackground(Color.BLUE);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(600, 600);

        add(Box.createRigidArea(new Dimension(0, 100)));


        JPanel panel1 = new JPanel();
        add(panel1);
        panel1.setVisible(true);
        panel1.setBackground(Color.BLUE);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
        jTextFieldAddCar = new JTextField("Enter Car Name");
        panel1.add(jTextFieldAddCar);
        jTextFieldAddCar.setVisible(true);
        jTextFieldAddCar.setMinimumSize(new Dimension(250, 40));
        jTextFieldAddCar.setMaximumSize(new Dimension(250, 40));
        panel1.add(Box.createRigidArea(new Dimension(10, 0)));

        jTextFieldCarPrice = new JTextField("Enter Car Price");
        panel1.add(jTextFieldCarPrice);
        jTextFieldCarPrice.setVisible(true);
        jTextFieldCarPrice.setMinimumSize(new Dimension(250, 40));
        jTextFieldCarPrice.setMaximumSize(new Dimension(250, 40));

        jTextFieldAddCar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jTextFieldAddCar.setText("");
            }
        });
        jTextFieldCarPrice.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jTextFieldCarPrice.setText("");
            }
        });

        add(Box.createRigidArea(new Dimension(0, 10)));

        String[] carType = {"Select Car Type", "Hatchback", "Sedan", "Crossover", "SUV"};
        jSpinnerCarType = new JSpinner(new SpinnerListModel(carType));

        JPanel panel2 = new JPanel();
        add(panel2);
        panel2.setVisible(true);
        panel2.setBackground(Color.BLUE);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));

        jSpinnerCarType.setVisible(true);
        jSpinnerCarType.setMinimumSize(new Dimension(250, 40));
        jSpinnerCarType.setMaximumSize(new Dimension(250, 40));
        panel2.add(jSpinnerCarType);

        panel2.add(Box.createRigidArea(new Dimension(10, 0)));

        String[] carModel = {"Select Car Model", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018"};
        jSpinnerCarModel = new JSpinner(new SpinnerListModel(carModel));

        jSpinnerCarModel.setVisible(true);
        jSpinnerCarModel.setMinimumSize(new Dimension(250, 40));
        jSpinnerCarModel.setMaximumSize(new Dimension(250, 40));
        panel2.add(jSpinnerCarModel);

        add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel panel3 = new JPanel();
        add(panel3);
        panel3.setVisible(true);
        panel3.setBackground(Color.BLUE);
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));

        String[] carCondition = {"Select Car Condition", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        jSpinnerCarCondition = new JSpinner(new SpinnerListModel(carCondition));
        jSpinnerCarCondition.setVisible(true);
        jSpinnerCarCondition.setMinimumSize(new Dimension(250, 40));
        jSpinnerCarCondition.setMaximumSize(new Dimension(250, 40));
        panel3.add(jSpinnerCarCondition);

        add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel panel4 = new JPanel();
        add(panel4);
        panel4.setVisible(true);
        panel4.setBackground(Color.BLUE);
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));

        jButtonBack = new JButton("Back");
        panel4.add(jButtonBack);
        jButtonBack.setVisible(true);
        jButtonBack.setForeground(Color.WHITE);
        jButtonBack.setBackground(Color.BLACK);
        jButtonBack.setVisible(true);
        jButtonBack.setMinimumSize(new Dimension(180, 40));
        jButtonBack.setMaximumSize(new Dimension(180, 40));
        jButtonBack.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel4.add(Box.createRigidArea(new Dimension(10, 0)));

        jButtonSell = new JButton("SELL");
        panel4.add(jButtonSell);
        jButtonSell.setVisible(true);
        jButtonSell.setForeground(Color.WHITE);
        jButtonSell.setBackground(Color.BLACK);
        jButtonSell.setVisible(true);
        jButtonSell.setMinimumSize(new Dimension(180, 40));
        jButtonSell.setMaximumSize(new Dimension(180, 40));
        jButtonSell.setAlignmentX(Component.CENTER_ALIGNMENT);


        jButtonBack.addActionListener(e -> {
            setVisible(false);
            customerLocalCarsFunctionsSellCar.setVisible(true);
        });

        jButtonSell.addActionListener(e -> {
            String carName = jTextFieldAddCar.getText();
            String carTypes = String.valueOf(jSpinnerCarType.getValue());
            String carConditions = (String) jSpinnerCarCondition.getValue();
            String carModels = String.valueOf(jSpinnerCarModel.getValue());
            String carPrices = jTextFieldCarPrice.getText();
            if (carName.isEmpty() || carName.equalsIgnoreCase("Enter Car Name") || carTypes.isEmpty() || carTypes.equalsIgnoreCase("Select Car Type") ||
                    carConditions.isEmpty() || (carConditions.equalsIgnoreCase("Select Car Condition") || (carModels.isEmpty() || (carModels.equalsIgnoreCase("Select Car Model")
            )))) {
                JOptionPane.showMessageDialog(this, "Please fill all the fields");
            } else {

                LocalCar localCar = new LocalCar(carName, carTypes, Double.parseDouble(carPrices),
                        Integer.parseInt(carModels), Integer.parseInt(carConditions)
                );

                JOptionPane.showMessageDialog(this, "Your car has been placed for display at MJ MOTORS."+"\nCar name: "+localCar.carName+"\n" +"Car type: "+localCar.carType
                        +"\nCar Price: " +localCar.carPrice+"\nCar Model: "+localCar.carModel+"\nCar Condition: " +localCar.carCondition);

            }

        });


    }
}
