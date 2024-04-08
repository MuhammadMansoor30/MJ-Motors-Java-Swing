package guiOne;


import org.djbros.LocalCar;
import org.djbros.ShowRoomCars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import static guiOne.MainFrame.managerLocalNewCarFunction;


public class ManagerLocalNewAddCar extends JPanel {

    JTextField jTextFieldCarName, jTextFieldCarPrice;
    JSpinner jSpinnerCarType, jSpinnerCarModel;
    JButton jButtonBack, jButtonAdd;

    ManagerLocalNewAddCar() {
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
        jTextFieldCarName = new JTextField("Enter Car Name");
        panel1.add(jTextFieldCarName);
        jTextFieldCarName.setVisible(true);
        jTextFieldCarName.setMinimumSize(new Dimension(250, 40));
        jTextFieldCarName.setMaximumSize(new Dimension(250, 40));
        panel1.add(Box.createRigidArea(new Dimension(10, 0)));

        jTextFieldCarPrice = new JTextField("Enter Car Price");
        panel1.add(jTextFieldCarPrice);
        jTextFieldCarPrice.setVisible(true);
        jTextFieldCarPrice.setMinimumSize(new Dimension(250, 40));
        jTextFieldCarPrice.setMaximumSize(new Dimension(250, 40));

        jTextFieldCarName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jTextFieldCarName.setText("");
            }
        });
        jTextFieldCarPrice.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jTextFieldCarPrice.setText("");
            }
        });

        add(Box.createRigidArea(new Dimension(0, 10)));

        String[] carType = {"Select Car Type", "Hatchback", "Sedan", "Crossover", "Suv"};
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
        String[] carModel = {"Select Car Model", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021"};
        jSpinnerCarModel = new JSpinner(new SpinnerListModel(carModel));
        jSpinnerCarModel.setVisible(true);
        jSpinnerCarModel.setMinimumSize(new Dimension(250, 40));
        jSpinnerCarModel.setMaximumSize(new Dimension(250, 40));
        panel2.add(jSpinnerCarModel);

        add(Box.createRigidArea(new Dimension(10, 0)));

        JPanel panel3 = new JPanel();
        add(panel3);
        panel3.setVisible(true);
        panel3.setBackground(Color.BLUE);
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));

        jButtonBack = new JButton("Back");
        panel3.add(jButtonBack);
        jButtonBack.setVisible(true);
        jButtonBack.setForeground(Color.WHITE);
        jButtonBack.setBackground(Color.BLACK);
        jButtonBack.setVisible(true);
        jButtonBack.setMinimumSize(new Dimension(180, 40));
        jButtonBack.setMaximumSize(new Dimension(180, 40));
        jButtonBack.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel3.add(Box.createRigidArea(new Dimension(10, 0)));

        jButtonAdd = new JButton("Add");
        panel3.add(jButtonAdd);
        jButtonAdd.setVisible(true);
        jButtonAdd.setForeground(Color.WHITE);
        jButtonAdd.setBackground(Color.BLACK);
        jButtonAdd.setVisible(true);
        jButtonAdd.setMinimumSize(new Dimension(180, 40));
        jButtonAdd.setMaximumSize(new Dimension(180, 40));
        jButtonAdd.setAlignmentX(Component.CENTER_ALIGNMENT);


        jButtonBack.addActionListener(e -> {
            setVisible(false);
            managerLocalNewCarFunction.setVisible(true);
        });

        jButtonAdd.addActionListener(e -> {
            String carName = jTextFieldCarName.getText();
            String carTypes = String.valueOf(jSpinnerCarType.getValue());
            String carModels = String.valueOf(jSpinnerCarModel.getValue());
            String carPrices = jTextFieldCarPrice.getText();


            if (carPrices.isEmpty() || carPrices.equalsIgnoreCase("Enter Car Price") || carName.isEmpty() || carName.equalsIgnoreCase("Enter Car Name") || carTypes.isEmpty() || carTypes.equalsIgnoreCase("Select Car Type") ||


                    (carModels.isEmpty() || (carModels.equalsIgnoreCase("Select Car Model")
                    ))) {
                JOptionPane.showMessageDialog(this, "Please fill all the fields");
            } else {

                LocalCar localCar = new LocalCar(carName, carTypes, Double.parseDouble(carPrices),
                        Integer.parseInt(carModels));

                addCar(localCar);
                JOptionPane.showMessageDialog(this, "Vehicle has been added Successfully.");


            }


        });


    }

    private void addCar(LocalCar localCar) {
        localCar.getNewLocalCars().add(localCar);
        try {
            ArrayList<ShowRoomCars> newLocalCarsRecord = localCar.getNewLocalCars();
            FileOutputStream fos = new FileOutputStream("newLocalCarsRecord.txt");
            ObjectOutputStream obj = new ObjectOutputStream(fos);
            obj.writeObject(newLocalCarsRecord);
            obj.flush();
            obj.close();
            LocalCar l = new LocalCar();
            l.populateNewCarArray();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
