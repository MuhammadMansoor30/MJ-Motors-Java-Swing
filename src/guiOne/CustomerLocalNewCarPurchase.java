package guiOne;

import org.djbros.ImportedCar;
import org.djbros.LocalCar;
import org.djbros.ShowRoomCars;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.ArrayList;

import static guiOne.MainFrame.customerLocalPurchaseCarFunctions;


public class CustomerLocalNewCarPurchase extends JPanel {
    JTextField jTextFieldCustomerName,jTextFieldCarName, jTextFieldCarPrice;
    JSpinner jSpinnerCarType, jSpinnerCarModel;
    JButton jButtonBack, jButtonPurchase, jButtonSearch;

    JTable jTable;
    JScrollPane jScrollPane;
    public static int index;

    CustomerLocalNewCarPurchase() {

        setVisible(true);
        setBackground(Color.BLUE);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(600, 600);
        add(Box.createRigidArea(new Dimension(0, 10)));
        JPanel panel = new JPanel();
        add(panel);
        panel.setVisible(true);
        panel.setBackground(Color.BLUE);
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        jTextFieldCustomerName = new JTextField("Enter Your Name");
        panel.add(jTextFieldCustomerName);
        jTextFieldCustomerName.setVisible(true);
        jTextFieldCustomerName.setMinimumSize(new Dimension(250, 40));
        jTextFieldCustomerName.setMaximumSize(new Dimension(250, 40));
        jTextFieldCustomerName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jTextFieldCustomerName.setText("");
            }
        });

        add(Box.createRigidArea(new Dimension(0, 10)));

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

        JPanel panel5 = new JPanel();
        add(panel5);
        panel5.setVisible(true);
        panel5.setBackground(Color.BLUE);
        panel5.setLayout(new BoxLayout(panel5, BoxLayout.X_AXIS));
        panel5.add(Box.createRigidArea(new Dimension(5, 0)));

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

        jButtonPurchase = new JButton("PURCHASE");
        panel5.add(jButtonPurchase);
        jButtonPurchase.setVisible(true);
        jButtonPurchase.setForeground(Color.WHITE);
        jButtonPurchase.setBackground(Color.BLACK);
        jButtonPurchase.setVisible(true);
        jButtonPurchase.setMinimumSize(new Dimension(180, 40));
        jButtonPurchase.setMaximumSize(new Dimension(180, 40));
        jButtonPurchase.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel5.add(Box.createRigidArea(new Dimension(10, 0)));

        jButtonSearch = new JButton("SEARCH");
        panel5.add(jButtonSearch);
        jButtonSearch.setVisible(true);
        jButtonSearch.setForeground(Color.WHITE);
        jButtonSearch.setBackground(Color.BLACK);
        jButtonSearch.setVisible(true);
        jButtonSearch.setMinimumSize(new Dimension(180, 40));
        jButtonSearch.setMaximumSize(new Dimension(180, 40));
        jButtonSearch.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel5.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton jButtonRefreshButton = new JButton("REFRESH BUTTON");
        panel5.add(jButtonRefreshButton);
        jButtonRefreshButton.setVisible(true);
        jButtonRefreshButton.setForeground(Color.WHITE);
        jButtonRefreshButton.setBackground(Color.BLACK);
        jButtonRefreshButton.setVisible(true);
        jButtonRefreshButton.setMinimumSize(new Dimension(180, 40));
        jButtonRefreshButton.setMaximumSize(new Dimension(180, 40));
        jButtonRefreshButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel5.add(Box.createRigidArea(new Dimension(5, 0)));

        add(Box.createRigidArea(new Dimension(0, 50)));

        jScrollPane = new JScrollPane();

        String column[] = {"Car Name", "Car Type", "Car Price", "Car Model"};

        LocalCar l = new LocalCar();
        l.populateNewCarArray();


        ArrayList<ArrayList<String>> twoDArrayListRow = new ArrayList<>();
        String s;
        String[] temp;
        for (int i = 0; i < ShowRoomCars.newLocalCars.size(); i++) {
            s = ShowRoomCars.newLocalCars.get(i).carName + "," + ShowRoomCars.newLocalCars.get(i).carType + "," +
                    ShowRoomCars.newLocalCars.get(i).carPrice + "," +
                    "," + ShowRoomCars.newLocalCars.get(i).carModel + "\n";
            temp = s.split(",");

            twoDArrayListRow.add(new ArrayList<>());
            for (int j = 0; j < temp.length; j++) {
                twoDArrayListRow.get(i).add(temp[j]);
            }

        }
        String[][] arrayList = new String[0][];
        if (!twoDArrayListRow.isEmpty()) {
            arrayList = new String[twoDArrayListRow.size()][twoDArrayListRow.get(0).size()];

            for (int i = 0; i < twoDArrayListRow.size(); i++) {
                for (int j = 0; j < twoDArrayListRow.get(i).size(); j++) {
                    arrayList[i][j] = twoDArrayListRow.get(i).get(j);
                }
            }

        }

        jTable = new JTable();
        jScrollPane = new JScrollPane();

        jTable.getTableHeader().setReorderingAllowed(false);

        jTable.setModel(new DefaultTableModel(arrayList,
                column));

        jScrollPane.setViewportView(jTable);
        add(jScrollPane);

        jButtonSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String customerName = jTextFieldCustomerName.getText();
                String carName = jTextFieldCarName.getText();
                String carTypes = String.valueOf(jSpinnerCarType.getValue());
                String carModels = String.valueOf(jSpinnerCarModel.getValue());
                String carPrices = jTextFieldCarPrice.getText();


                if ( customerName.isEmpty() || customerName.equalsIgnoreCase("Enter Your Name") || carPrices.isEmpty() || carPrices.equalsIgnoreCase("Enter Car Price") || carName.isEmpty() || carName.equalsIgnoreCase("Enter Car Name") || carTypes.isEmpty() || carTypes.equalsIgnoreCase("Select Car Type") ||

                                (carModels.isEmpty() || (carModels.equalsIgnoreCase("Select Car Model")
                                       ))){
                    JOptionPane.showMessageDialog(jButtonSearch, "Please fill all the fields");
                }  else if (!searchCar(carName, carTypes)) {
                    JOptionPane.showMessageDialog(jButtonSearch, "Sorry! This car is not present in the record");
                } else {
                    JOptionPane.showMessageDialog(jButtonSearch, "This car is available.You can purchase");
                }


            }
        });
        jButtonPurchase.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String customerName = jTextFieldCustomerName.getText();
                String carName = jTextFieldCarName.getText();
                String carTypes = String.valueOf(jSpinnerCarType.getValue());
                String carModels = String.valueOf(jSpinnerCarModel.getValue());
                String carPrices = jTextFieldCarPrice.getText();

                if ( customerName.isEmpty() || customerName.equalsIgnoreCase("Enter Your Name") || carPrices.isEmpty() || carPrices.equalsIgnoreCase("Enter Car Price") || carName.isEmpty() || carName.equalsIgnoreCase("Enter Car Name") || carTypes.isEmpty() || carTypes.equalsIgnoreCase("Select Car Type") ||

                                (carModels.isEmpty() || (carModels.equalsIgnoreCase("Select Car Model")
                                       ))) {
                    JOptionPane.showMessageDialog(jButtonPurchase, "Please fill all the fields");
                }  else if (!searchCar(carName, carTypes)) {
                    JOptionPane.showMessageDialog(jButtonPurchase, "No such car present in record");

                } else {

                    LocalCar localCar = new LocalCar(carName, carTypes, Double.parseDouble(carPrices),
                            Integer.parseInt(carModels));
                    removeVehicle(localCar);
                    JOptionPane.showMessageDialog(jButtonPurchase, "Removed Successfully");


                }


            }
        });


        jButtonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                customerLocalPurchaseCarFunctions.setVisible(true);
            }
        });

        jButtonRefreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ((DefaultTableModel) jTable.getModel()).setRowCount(0);
                LocalCar l = new LocalCar();
                l.populateNewCarArray();


                ArrayList<ArrayList<String>> twoDArrayListRow = new ArrayList<>();
                String s;
                String[] temp;
                for (int i = 0; i < ShowRoomCars.newLocalCars.size(); i++) {
                    s = ShowRoomCars.newLocalCars.get(i).carName + "," + ShowRoomCars.newLocalCars.get(i).carType + "," +
                            ShowRoomCars.newLocalCars.get(i).carPrice +"," + ShowRoomCars.newLocalCars.get(i).carModel + "\n";
                    temp = s.split(",");

                    twoDArrayListRow.add(new ArrayList<>());
                    for (int j = 0; j < temp.length; j++) {
                        twoDArrayListRow.get(i).add(temp[j]);
                    }

                }
                if (!twoDArrayListRow.isEmpty()) {
                    String[][] arrayList = new String[twoDArrayListRow.size()][twoDArrayListRow.get(0).size()];

                    for (int i = 0; i < twoDArrayListRow.size(); i++) {
                        for (int j = 0; j < twoDArrayListRow.get(i).size(); j++) {
                            arrayList[i][j] = twoDArrayListRow.get(i).get(j);
                        }
                    }

                    jTable.setModel(new DefaultTableModel(arrayList,
                            column));

                }

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

    public void removeVehicle(LocalCar localCar) {
        ShowRoomCars.newLocalCars.remove(localCar);

        try {
            FileInputStream fis = new FileInputStream("newLocalCarsRecord.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList checkForUpdate = (ArrayList<ShowRoomCars>) ois.readObject();
            checkForUpdate.remove(index);
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
