package guiOne;

import org.djbros.ImportedCar;
import org.djbros.ShowRoomCars;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;


import static guiOne.MainFrame.customerImportedCarFunctions;

public class CustomerImportedCarsDetails extends JPanel {

    JTable jTableNewImported, jTableOldImported;
    JScrollPane jScrollPaneNewImported, jScrollPaneOldImported;
    public static int index;


    CustomerImportedCarsDetails() {
        setVisible(true);
        setBackground(Color.BLUE);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(600, 600);
        add(Box.createRigidArea(new Dimension(0, 80)));

        JLabel newImportedLabel = new JLabel();
        newImportedLabel.setVisible(true);
        newImportedLabel.setText("IMPORTED NEW CARS DETAILS");
        newImportedLabel.setForeground(Color.WHITE);
        add(newImportedLabel);
        newImportedLabel.setLayout(new BoxLayout(newImportedLabel, BoxLayout.X_AXIS));
        newImportedLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0, 15)));

        jScrollPaneNewImported = new JScrollPane();

        String column[] = {"Car Name", "Car Type", "Price", "Condition", "Grade", "Auction Sheet", "Model Year", "Year of Import"};

        ImportedCar c = new ImportedCar();
        c.populateNewCarArray();


        ArrayList<ArrayList<String>> twoDArrayListRow = new ArrayList<>();
        String s;
        String[] temp;
        for (int i = 0; i < ShowRoomCars.newImportedCars.size(); i++) {
            s = ShowRoomCars.newImportedCars.get(i).carName + "," + ShowRoomCars.newImportedCars.get(i).carType + "," +
                    ShowRoomCars.newImportedCars.get(i).carPrice + "," + ShowRoomCars.newImportedCars.get(i).carCondition + "," +
                    ShowRoomCars.newImportedCars.get(i).gradeAtTimeOfImport + "," + ShowRoomCars.newImportedCars.get(i).auctionSheet + "," +
                    ShowRoomCars.newImportedCars.get(i).carModel + "," + ShowRoomCars.newImportedCars.get(i).yearOfImport + "\n";
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

        jTableNewImported = new JTable();
        jScrollPaneNewImported = new JScrollPane();

        jTableNewImported.getTableHeader().setReorderingAllowed(false);

        jTableNewImported.setModel(new DefaultTableModel(arrayList,
                column));

        jScrollPaneNewImported.setViewportView(jTableNewImported);
        add(jScrollPaneNewImported);

        add(Box.createRigidArea(new Dimension(0, 50)));


        jScrollPaneOldImported = new JScrollPane();

        String columnn[] = {"Car Name", "Car Type", "Price", "Condition", "Grade", "Auction Sheet", "Model Year", "Year of Import"};

        ImportedCar a = new ImportedCar();
        a.populateOldCarArray();


        ArrayList<ArrayList<String>> twoDArrayListRoww = new ArrayList<>();
        String g;
        String[] tempp;
        for (int i = 0; i < ShowRoomCars.oldImportedCars.size(); i++) {
            g = ShowRoomCars.oldImportedCars.get(i).carName + "," + ShowRoomCars.oldImportedCars.get(i).carType + "," +
                    ShowRoomCars.oldImportedCars.get(i).carPrice + "," + ShowRoomCars.oldImportedCars.get(i).carCondition + "," +
                    ShowRoomCars.oldImportedCars.get(i).gradeAtTimeOfImport + "," + ShowRoomCars.oldImportedCars.get(i).auctionSheet + "," +
                    ShowRoomCars.oldImportedCars.get(i).carModel + "," + ShowRoomCars.oldImportedCars.get(i).yearOfImport + "\n";
            tempp = g.split(",");

            twoDArrayListRoww.add(new ArrayList<>());
            for (int j = 0; j < tempp.length; j++) {
                twoDArrayListRoww.get(i).add(tempp[j]);
            }

        }
        String[][] arrayListt = new String[0][];
        if (!twoDArrayListRoww.isEmpty()) {
            arrayListt = new String[twoDArrayListRoww.size()][twoDArrayListRoww.get(0).size()];

            for (int i = 0; i < twoDArrayListRoww.size(); i++) {
                for (int j = 0; j < twoDArrayListRoww.get(i).size(); j++) {
                    arrayListt[i][j] = twoDArrayListRoww.get(i).get(j);
                }
            }

        }
        add(Box.createRigidArea(new Dimension(0, 30)));
        JLabel oldImportedLabel = new JLabel();
        oldImportedLabel.setVisible(true);
        oldImportedLabel.setText("IMPORTED OLD CARS DETAILS");
        oldImportedLabel.setForeground(Color.WHITE);
        add(oldImportedLabel);
        oldImportedLabel.setLayout(new BoxLayout(oldImportedLabel, BoxLayout.X_AXIS));
        oldImportedLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0, 15)));

        jTableOldImported = new JTable();
        jScrollPaneOldImported = new JScrollPane();

        jTableOldImported.getTableHeader().setReorderingAllowed(false);

        jTableOldImported.setModel(new DefaultTableModel(arrayListt,
                columnn));

        jScrollPaneOldImported.setViewportView(jTableOldImported);
        add(jScrollPaneOldImported);

        add(Box.createRigidArea(new Dimension(0, 50)));

        JPanel panel1 = new JPanel();
        add(panel1);
        panel1.setVisible(true);
        panel1.setBackground(Color.BLUE);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
        JButton jButtonbackButton = new JButton("BACK");
        panel1.add(jButtonbackButton);
        jButtonbackButton.setVisible(true);
        jButtonbackButton.setForeground(Color.WHITE);
        jButtonbackButton.setBackground(Color.BLACK);
        jButtonbackButton.setVisible(true);
        jButtonbackButton.setMinimumSize(new Dimension(180, 40));
        jButtonbackButton.setMaximumSize(new Dimension(180, 40));
        jButtonbackButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0, 50)));
        panel1.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton jButtonRefreshButton = new JButton("REFRESH");
        panel1.add(jButtonRefreshButton);
        jButtonRefreshButton.setVisible(true);
        jButtonRefreshButton.setForeground(Color.WHITE);
        jButtonRefreshButton.setBackground(Color.BLACK);
        jButtonRefreshButton.setVisible(true);
        jButtonRefreshButton.setMinimumSize(new Dimension(180, 40));
        jButtonRefreshButton.setMaximumSize(new Dimension(180, 40));
        jButtonRefreshButton.setAlignmentX(Component.CENTER_ALIGNMENT);


        jButtonbackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                customerImportedCarFunctions.setVisible(true);


            }
        });
        jButtonRefreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((DefaultTableModel) jTableNewImported.getModel()).setRowCount(0);
                ImportedCar b = new ImportedCar();
                b.populateNewCarArray();

                ArrayList<ArrayList<String>> twoDArrayListRow = new ArrayList<>();
                String s;
                String[] temp;
                for (int i = 0; i < ShowRoomCars.newImportedCars.size(); i++) {
                    s = ShowRoomCars.newImportedCars.get(i).carName + "," + ShowRoomCars.newImportedCars.get(i).carType + "," +
                            ShowRoomCars.newImportedCars.get(i).carPrice + "," + ShowRoomCars.newImportedCars.get(i).carCondition + "," +
                            ShowRoomCars.newImportedCars.get(i).gradeAtTimeOfImport + "," + ShowRoomCars.newImportedCars.get(i).auctionSheet + "," +
                            ShowRoomCars.newImportedCars.get(i).carModel + "," + ShowRoomCars.newImportedCars.get(i).yearOfImport + "\n";
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

                    jTableNewImported.setModel(new DefaultTableModel(arrayList,
                            column));

               }


                ((DefaultTableModel) jTableOldImported.getModel()).setRowCount(0);
                ImportedCar a = new ImportedCar();
                a.populateOldCarArray();

                ArrayList<ArrayList<String>> twoDArrayListRoww = new ArrayList<>();
                String l;
                String[] tempp;
                for (int i = 0; i < ShowRoomCars.oldImportedCars.size(); i++) {
                    l = ShowRoomCars.oldImportedCars.get(i).carName + "," + ShowRoomCars.oldImportedCars.get(i).carType + "," +
                            ShowRoomCars.oldImportedCars.get(i).carPrice + "," + ShowRoomCars.oldImportedCars.get(i).carCondition + "," +
                            ShowRoomCars.oldImportedCars.get(i).gradeAtTimeOfImport + "," + ShowRoomCars.oldImportedCars.get(i).auctionSheet + "," +
                            ShowRoomCars.oldImportedCars.get(i).carModel + "," + ShowRoomCars.oldImportedCars.get(i).yearOfImport + "\n";
                    tempp = l.split(",");

                    twoDArrayListRoww.add(new ArrayList<>());
                    for (int j = 0; j < tempp.length; j++) {
                        twoDArrayListRoww.get(i).add(tempp[j]);
                    }

                }

               if (!twoDArrayListRoww.isEmpty()) {
                    String[][] arrayListt = new String[twoDArrayListRoww.size()][twoDArrayListRoww.get(0).size()];

                    for (int i = 0; i < twoDArrayListRoww.size(); i++) {
                        for (int j = 0; j < twoDArrayListRoww.get(i).size(); j++) {
                            arrayListt[i][j] = twoDArrayListRoww.get(i).get(j);
                        }
                    }

                    jTableOldImported.setModel(new DefaultTableModel(arrayListt,
                            column));

                }

            }
        });


    }


}
