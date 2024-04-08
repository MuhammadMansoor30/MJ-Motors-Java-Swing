package guiOne;

import org.djbros.ImportedCar;
import org.djbros.ShowRoomCars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.ArrayList;

import static guiOne.MainFrame.managerNewImportedCarFunction;
import static guiOne.MainFrame.managerOldImportedCarFunction;

public class ManagerImportedOldRemoveCar extends JPanel {

    JTextField jTextFieldAddCar, jTextFieldCarPrice;
    JSpinner jSpinnerCarType, jSpinnerAuction, jSpinnerCarModel, jSpinnerCarCondition, jSpinnerImportYear,
            jSpinnerGrade;
    JButton jButtonBack, jButtonAdd;
    public static int index = 0;

    public ManagerImportedOldRemoveCar() {
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

        String[] carType = {"Select Car Type", "Hatchback", "Sedan", "Crossover", "SUV", "Sports"};
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

        String[] carAuction = {"Is Car Auction Sheet Available?", "Yes", "No"};
        jSpinnerAuction = new JSpinner(new SpinnerListModel(carAuction));
        jSpinnerAuction.setVisible(true);
        jSpinnerAuction.setMinimumSize(new Dimension(250, 40));
        jSpinnerAuction.setMaximumSize(new Dimension(250, 40));
        panel2.add(jSpinnerAuction);

        add(Box.createRigidArea(new Dimension(0, 10)));

        String[] carModel = {"Select Car Model", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018"};
        jSpinnerCarModel = new JSpinner(new SpinnerListModel(carModel));

        JPanel panel3 = new JPanel();
        add(panel3);
        panel3.setVisible(true);
        panel3.setBackground(Color.BLUE);
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));

        jSpinnerCarModel.setVisible(true);
        jSpinnerCarModel.setMinimumSize(new Dimension(250, 40));
        jSpinnerCarModel.setMaximumSize(new Dimension(250, 40));
        panel3.add(jSpinnerCarModel);

        panel3.add(Box.createRigidArea(new Dimension(10, 0)));


        String[] carGrade = {"Select Car Grade", "1.0", "1.5", "2.0", "2.5", "3.0", "3.5", "4.0", "4.5", "5.0"};
        jSpinnerGrade = new JSpinner(new SpinnerListModel(carGrade));
        jSpinnerGrade.setVisible(true);
        jSpinnerGrade.setMinimumSize(new Dimension(250, 40));
        jSpinnerGrade.setMaximumSize(new Dimension(250, 40));
        panel3.add(jSpinnerGrade);

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

        panel4.add(Box.createRigidArea(new Dimension(10, 0)));

        String[] carImportYear = {"Select Car Import Year", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021"};

        jSpinnerImportYear = new JSpinner(new SpinnerListModel(carImportYear));
        jSpinnerImportYear.setVisible(true);
        jSpinnerImportYear.setMinimumSize(new Dimension(250, 40));
        jSpinnerImportYear.setMaximumSize(new Dimension(250, 40));
        panel4.add(jSpinnerImportYear);

        add(Box.createRigidArea(new Dimension(0, 10)));


        JPanel panel5 = new JPanel();
        add(panel5);
        panel5.setVisible(true);
        panel5.setBackground(Color.BLUE);
        panel5.setLayout(new BoxLayout(panel5, BoxLayout.X_AXIS));

        jButtonBack = new JButton("Back");
        panel5.add(jButtonBack);
        jButtonBack.setVisible(true);
        jButtonBack.setForeground(Color.WHITE);
        jButtonBack.setBackground(Color.BLACK);
        jButtonBack.setVisible(true);
        jButtonBack.setMinimumSize(new Dimension(180, 40));
        jButtonBack.setMaximumSize(new Dimension(180, 40));
        jButtonBack.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel5.add(Box.createRigidArea(new Dimension(10, 0)));

        jButtonAdd = new JButton("Remove");
        panel5.add(jButtonAdd);
        jButtonAdd.setVisible(true);
        jButtonAdd.setForeground(Color.WHITE);
        jButtonAdd.setBackground(Color.BLACK);
        jButtonAdd.setVisible(true);
        jButtonAdd.setMinimumSize(new Dimension(180, 40));
        jButtonAdd.setMaximumSize(new Dimension(180, 40));
        jButtonAdd.setAlignmentX(Component.CENTER_ALIGNMENT);


        jButtonBack.addActionListener(e -> {
            setVisible(false);
            managerOldImportedCarFunction.setVisible(true);
        });

        jButtonAdd.addActionListener(e -> {
            String carName = jTextFieldAddCar.getText();
            String carTypes = String.valueOf(jSpinnerCarType.getValue());
            String carConditions = (String) jSpinnerCarCondition.getValue();
            String carAuctions = (String.valueOf(jSpinnerAuction.getValue()));
            String carModels = String.valueOf(jSpinnerCarModel.getValue());
            String carGrades = String.valueOf(jSpinnerGrade.getValue());
            String importYear = String.valueOf(jSpinnerImportYear.getValue());
            String carPrices = jTextFieldCarPrice.getText();

            boolean carAuctionsBoolean = (String.valueOf(jSpinnerAuction.getValue())).equalsIgnoreCase("Yes");
            if (carPrices.isEmpty() || carPrices.equalsIgnoreCase("Enter Car Price") || carName.isEmpty() || carName.equalsIgnoreCase("Enter Car Name") || carTypes.isEmpty() || carTypes.equalsIgnoreCase("Select Car Type") ||
                    carConditions.isEmpty() || (carConditions.equalsIgnoreCase("Select Car Condition") ||
                    carAuctions.isEmpty() || (carAuctions.equalsIgnoreCase("Select Auction") ||
                    (importYear.isEmpty() || (importYear.equalsIgnoreCase("Select Import Year") ||
                            (carModels.isEmpty() || (carModels.equalsIgnoreCase("Select Car Model") ||
                                    (carGrades.isEmpty() || (carGrades.equalsIgnoreCase("Select Grade")))))))))) {
                JOptionPane.showMessageDialog(this, "Please fill all the fields");
            } else if (!searchCar(carName, carTypes)) {
                JOptionPane.showMessageDialog(this, "No such car present in record");

            } else {

                ImportedCar importedCar = new ImportedCar(carName, carTypes, Double.parseDouble(carPrices),
                        Integer.parseInt(carModels), Integer.parseInt(carConditions),
                        Integer.parseInt(importYear), Double.parseDouble(carGrades),
                        carAuctionsBoolean);
                removeVehicle(importedCar);
                JOptionPane.showMessageDialog(this, "Removed Successfully");


            }


        });


    }

    private boolean searchCar(String carName, String carType) {
        FileInputStream fileOutputStream = null;
        ArrayList importedNewCars = null;
        try {
            fileOutputStream = new FileInputStream("oldImportedCarsRecord.txt");
            ObjectInputStream ois = new ObjectInputStream(fileOutputStream);
            importedNewCars = (ArrayList<ShowRoomCars>) ois.readObject();
            if (!importedNewCars.isEmpty()) {

                for (int i = 0; i < importedNewCars.size(); i++) {
                    ShowRoomCars s = (ShowRoomCars) importedNewCars.get(i);
                    if (s.carName.equalsIgnoreCase(carName) && s.carType.equalsIgnoreCase(carType)) {
                        index = i;
                        return true;
                    }
                }
            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }


    public void removeVehicle(ImportedCar importedCar) {
        ShowRoomCars.oldImportedCars.remove(importedCar);

        try {
            FileInputStream fis = new FileInputStream("oldImportedCarsRecord.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList checkForUpdate = (ArrayList<ShowRoomCars>) ois.readObject();
            checkForUpdate.remove(index);
            ois.close();
            FileOutputStream fos = new FileOutputStream("oldImportedCarsRecord.txt");
            ObjectOutputStream o = new ObjectOutputStream(fos);
            o.writeObject(checkForUpdate);
            o.flush();
            o.close();


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }


}
