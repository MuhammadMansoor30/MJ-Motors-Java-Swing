package guiOne;

import org.djbros.LocalCar;
import org.djbros.ShowRoomCars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.ArrayList;

import static guiOne.MainFrame.managerLocalNewCarFunction;


public class ManagerLocalNewUpdateCar extends JPanel {

    JTextField jTextFieldAddCar, jTextFieldCarPrice, jTextFieldPreviousCarName;
    JSpinner jSpinnerCarType, jSpinnerCarModel, jSpinnerCarCondition,
            jSpinnerPreviousCarType;
    JButton jButtonBack, jButtonUpdate, jButtonSearch;

    public static int index = 0;

    ManagerLocalNewUpdateCar() {

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
        jTextFieldPreviousCarName = new JTextField("Enter Car Name");
        panel1.add(jTextFieldPreviousCarName);
        jTextFieldPreviousCarName.setVisible(true);
        jTextFieldPreviousCarName.setMinimumSize(new Dimension(250, 40));
        jTextFieldPreviousCarName.setMaximumSize(new Dimension(250, 40));

        jTextFieldPreviousCarName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jTextFieldPreviousCarName.setText("");
            }
        });
        panel1.add(Box.createRigidArea(new Dimension(10, 0)));

        String[] carType = {"Select Car Type", "Hatchback", "Sedan", "Crossover", "Suv"};

        jSpinnerPreviousCarType = new JSpinner(new SpinnerListModel(carType));
        jSpinnerPreviousCarType.setVisible(true);
        jSpinnerPreviousCarType.setMinimumSize(new Dimension(250, 40));
        jSpinnerPreviousCarType.setMaximumSize(new Dimension(250, 40));
        panel1.add(jSpinnerPreviousCarType);
        add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel panel2 = new JPanel();
        add(panel2);
        panel2.setVisible(true);
        panel2.setBackground(Color.BLUE);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));

        jButtonBack = new JButton("Back");
        panel2.add(jButtonBack);
        jButtonBack.setVisible(true);
        jButtonBack.setForeground(Color.WHITE);
        jButtonBack.setBackground(Color.BLACK);
        jButtonBack.setVisible(true);
        jButtonBack.setMinimumSize(new Dimension(180, 40));
        jButtonBack.setMaximumSize(new Dimension(180, 40));
        jButtonBack.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel2.add(Box.createRigidArea(new Dimension(10, 0)));

        jButtonSearch = new JButton("Search");
        panel2.add(jButtonSearch);
        jButtonSearch.setVisible(true);
        jButtonSearch.setForeground(Color.WHITE);
        jButtonSearch.setBackground(Color.BLACK);
        jButtonSearch.setVisible(true);
        jButtonSearch.setMinimumSize(new Dimension(180, 40));
        jButtonSearch.setMaximumSize(new Dimension(180, 40));
        jButtonSearch.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel panel3 = new JPanel();
        add(panel3);
        panel3.setVisible(false);
        panel3.setBackground(Color.BLUE);
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
        jTextFieldAddCar = new JTextField("Enter Car Name");
        panel3.add(jTextFieldAddCar);
        jTextFieldAddCar.setVisible(true);
        jTextFieldAddCar.setMinimumSize(new Dimension(250, 40));
        jTextFieldAddCar.setMaximumSize(new Dimension(250, 40));
        panel3.add(Box.createRigidArea(new Dimension(10, 0)));

        jTextFieldCarPrice = new JTextField("Enter Car Price");
        panel3.add(jTextFieldCarPrice);
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

        jSpinnerCarType = new JSpinner(new SpinnerListModel(carType));

        JPanel panel4 = new JPanel();
        add(panel4);
        panel4.setVisible(false);
        panel4.setBackground(Color.BLUE);
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));

        jSpinnerCarType.setVisible(true);
        jSpinnerCarType.setMinimumSize(new Dimension(250, 40));
        jSpinnerCarType.setMaximumSize(new Dimension(250, 40));
        panel4.add(jSpinnerCarType);

        panel4.add(Box.createRigidArea(new Dimension(10, 0)));

        String[] carModel = {"Select Car Model", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021"};
        jSpinnerCarModel = new JSpinner(new SpinnerListModel(carModel));
        panel4.setBackground(Color.BLUE);
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));
        jSpinnerCarModel.setVisible(true);
        jSpinnerCarModel.setMinimumSize(new Dimension(250, 40));
        jSpinnerCarModel.setMaximumSize(new Dimension(250, 40));
        panel4.add(jSpinnerCarModel);
        add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel panel5 = new JPanel();
        add(panel5);
        panel5.setVisible(false);
        panel5.setBackground(Color.BLUE);
        panel5.setLayout(new BoxLayout(panel5, BoxLayout.X_AXIS));

        String[] carCondition = {"Select Car Condition", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        jSpinnerCarCondition = new JSpinner(new SpinnerListModel(carCondition));
        jSpinnerCarCondition.setVisible(true);
        jSpinnerCarCondition.setMinimumSize(new Dimension(250, 40));
        jSpinnerCarCondition.setMaximumSize(new Dimension(250, 40));
        panel5.add(jSpinnerCarCondition);

        add(Box.createRigidArea(new Dimension(0, 10)));


        jButtonUpdate = new JButton("UPDATE");
        add(jButtonUpdate);
        jButtonUpdate.setForeground(Color.WHITE);
        jButtonUpdate.setBackground(Color.BLACK);
        jButtonUpdate.setVisible(false);
        jButtonUpdate.setMinimumSize(new Dimension(180, 40));
        jButtonUpdate.setMaximumSize(new Dimension(180, 40));
        jButtonUpdate.setAlignmentX(Component.CENTER_ALIGNMENT);


        jButtonBack.addActionListener(e -> {
            setVisible(false);
            managerLocalNewCarFunction.setVisible(true);
            panel1.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(false);
            panel4.setVisible(false);
            jButtonUpdate.setVisible(false);
        });

        jButtonSearch.addActionListener(e -> {
            String prevCarType = String.valueOf(jSpinnerPreviousCarType.getValue());
            String prevCarName = jTextFieldPreviousCarName.getText();
            LocalCar l = new LocalCar();
            l.populateNewCarArray();
            if (searchCar(prevCarName, prevCarType)) {
                JOptionPane.showMessageDialog(this, "Car found. Update Now!");
                panel1.setVisible(true);
                panel2.setVisible(true);
                panel3.setVisible(true);
                panel4.setVisible(true);
                jButtonUpdate.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Car Not Found.");
            }
        });

        jButtonUpdate.addActionListener(e -> {

            String carName = jTextFieldAddCar.getText();
            String carTypes = String.valueOf(jSpinnerCarType.getValue());
            String carConditions = (String) jSpinnerCarCondition.getValue();
            String carModels = String.valueOf(jSpinnerCarModel.getValue());
            String carPrices = jTextFieldCarPrice.getText();


            if (carPrices.isEmpty() || carPrices.equalsIgnoreCase("Enter Car Price") || carName.isEmpty() || carName.equalsIgnoreCase("Enter Car Name") || carTypes.isEmpty() || carTypes.equalsIgnoreCase("Select Car Type") ||
                    carConditions.isEmpty() || (carConditions.equalsIgnoreCase("Select Car Condition") ||

                            (carModels.isEmpty() || (carModels.equalsIgnoreCase("Select Car Model")
                                   )))) {
                JOptionPane.showMessageDialog(this, "Please fill all the fields");
            }
            else {

                LocalCar localCar = new LocalCar(carName, carTypes, Double.parseDouble(carPrices),
                        Integer.parseInt(carModels)
                );
                updateVehicle(localCar);
                JOptionPane.showMessageDialog(this, "Car Updated Successfully");

            }



        });


    }


    private boolean searchCar(String carName, String carType) {
        FileInputStream fileOutputStream = null;
        ArrayList<ShowRoomCars> importedNewCars = null;
        try {
            fileOutputStream = new FileInputStream("newLocalCarsRecord.txt");
            ObjectInputStream ois = new ObjectInputStream(fileOutputStream);
            importedNewCars = (ArrayList<ShowRoomCars>) ois.readObject();
            if (!importedNewCars.isEmpty()) {

                for (int i = 0; i < importedNewCars.size(); i++) {
                    ShowRoomCars s = importedNewCars.get(i);
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

    public void updateVehicle(LocalCar localCar) {
        ShowRoomCars.newLocalCars.set(index, localCar);

        try {
            FileInputStream fis = new FileInputStream("newLocalCarsRecord.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList checkForUpdate = (ArrayList<ShowRoomCars>) ois.readObject();
            checkForUpdate.set(index, localCar);
            ois.close();
            FileOutputStream fos = new FileOutputStream("newLocalCarsRecord.txt");
            ObjectOutputStream o = new ObjectOutputStream(fos);
            o.writeObject(checkForUpdate);
            o.flush();
            o.close();


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}
