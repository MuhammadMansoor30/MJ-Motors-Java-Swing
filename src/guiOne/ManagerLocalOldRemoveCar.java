package guiOne;

import org.djbros.LocalCar;
import org.djbros.ShowRoomCars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.ArrayList;

import static guiOne.MainFrame.managerLocalOldCarFunction;

public class ManagerLocalOldRemoveCar extends JPanel {
    JTextField jTextFieldCarName  ,jTextFieldCarPrice;
    JSpinner jSpinnerCarType, jSpinnerCarModel,jSpinnerCarCondition;
    JButton jButtonBack, jButtonRemove;
    public static int index = 0;

    ManagerLocalOldRemoveCar() {
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
        jTextFieldCarName = new JTextField("Enter Car Name You want to remove");
        panel1.add(jTextFieldCarName);
        jTextFieldCarName.setVisible(true);
        jTextFieldCarName.setMinimumSize(new Dimension(250, 40));
        jTextFieldCarName.setMaximumSize(new Dimension(250, 40));
        jTextFieldCarName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jTextFieldCarName.setText("");
            }
        });
        panel1.add(Box.createRigidArea(new Dimension(10, 0)));

        String[] carModel = {"Select Car Model", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021"};
        jSpinnerCarModel = new JSpinner(new SpinnerListModel(carModel));
        add(panel1);
        panel1.setVisible(true);
        panel1.setBackground(Color.BLUE);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

        jSpinnerCarModel.setVisible(true);
        jSpinnerCarModel.setMinimumSize(new Dimension(250, 40));
        jSpinnerCarModel.setMaximumSize(new Dimension(250, 40));
        panel1.add(jSpinnerCarModel);

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

        jTextFieldCarPrice = new JTextField("Enter Car Price");
        panel2.add(jTextFieldCarPrice);
        jTextFieldCarPrice.setVisible(true);
        jTextFieldCarPrice.setMinimumSize(new Dimension(250, 40));
        jTextFieldCarPrice.setMaximumSize(new Dimension(250, 40));

        jTextFieldCarPrice.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jTextFieldCarPrice.setText("");
            }
        });

        add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel panel4 = new JPanel();
        add(panel4);
        panel4.setVisible(true);
        panel4.setBackground(Color.BLUE);
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));

        String[] carCondition = {"Select Car Condition", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        jSpinnerCarCondition = new JSpinner(new SpinnerListModel(carCondition));
        jSpinnerCarCondition.setVisible(true);
        jSpinnerCarCondition.setMinimumSize(new Dimension(250, 40));
        jSpinnerCarCondition.setMaximumSize(new Dimension(250, 40));
        panel4.add(jSpinnerCarCondition);
        add(Box.createRigidArea(new Dimension(0, 10)));


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

        jButtonRemove = new JButton("Remove");
        panel3.add(jButtonRemove);
        jButtonRemove.setVisible(true);
        jButtonRemove.setForeground(Color.WHITE);
        jButtonRemove.setBackground(Color.BLACK);
        jButtonRemove.setVisible(true);
        jButtonRemove.setMinimumSize(new Dimension(180, 40));
        jButtonRemove.setMaximumSize(new Dimension(180, 40));
        jButtonRemove.setAlignmentX(Component.CENTER_ALIGNMENT);

        jButtonBack.addActionListener(e -> {
            setVisible(false);
            managerLocalOldCarFunction.setVisible(true);
        });

        jButtonRemove.addActionListener(e -> {
            String carName = jTextFieldCarName.getText();
            String carTypes = String.valueOf(jSpinnerCarType.getValue());
            String carModels = String.valueOf(jSpinnerCarModel.getValue());
            String carPrices = jTextFieldCarPrice.getText();
            String carConditions = (String) jSpinnerCarCondition.getValue();
            if (carPrices.isEmpty() || carPrices.equalsIgnoreCase("Enter Car Price") || carName.isEmpty() || carName.equalsIgnoreCase("Enter Car Name") || carTypes.isEmpty() || carTypes.equalsIgnoreCase("Select Car Type") ||
                    carConditions.isEmpty() || (carConditions.equalsIgnoreCase("Select Car Condition") ||


                    (carModels.isEmpty() || (carModels.equalsIgnoreCase("Select Car Model")
                    )))) {
                JOptionPane.showMessageDialog(this, "Please fill all the fields");
            } else if (!searchCar(carName, carTypes)) {
                JOptionPane.showMessageDialog(this, "No such car present in record");

            } else {
                LocalCar localCar = new LocalCar(carName, carTypes, Double.parseDouble(carPrices),
                        Integer.parseInt(carModels), Integer.parseInt(carConditions)
                );

                removeVehicle(localCar);
                JOptionPane.showMessageDialog(this, "Removed Successfully");

            }


        });


    }
    private boolean searchCar(String carName, String carType) {
        FileInputStream fileOutputStream = null;
        ArrayList<ShowRoomCars> localOldCars = null;
        try {
            fileOutputStream = new FileInputStream("oldLocalCarsRecord.txt");
            ObjectInputStream ois = new ObjectInputStream(fileOutputStream);
            localOldCars = (ArrayList<ShowRoomCars>) ois.readObject();
            if (!localOldCars.isEmpty()) {

                for (int i = 0; i < localOldCars.size(); i++) {
                    ShowRoomCars s = localOldCars.get(i);
                    if (s.carName.equalsIgnoreCase(carName) && s.carType.equalsIgnoreCase(carType)) {
                        index = i;
                        return true;
                    }
                }
            }
            ois.close();
        } catch (Exception e) {
        }
        return false;

    }

    public void removeVehicle(LocalCar localCar) {
        ShowRoomCars.oldLocalCars.remove(localCar);

        try {
            FileInputStream fis = new FileInputStream("oldLocalCarsRecord.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList checkForUpdate = (ArrayList<ShowRoomCars>) ois.readObject();
            checkForUpdate.remove(index);
            ois.close();
            FileOutputStream fos = new FileOutputStream("oldLocalCarsRecord.txt");
            ObjectOutputStream o = new ObjectOutputStream(fos);
            o.writeObject(checkForUpdate);
            o.flush();
            o.close();


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }


}
